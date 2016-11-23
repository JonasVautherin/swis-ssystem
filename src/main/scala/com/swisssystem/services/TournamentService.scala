package com.swisssystem.services

import com.swisssystem.PlayerDto
import com.swisssystem.persistence.TournamentRepository

import com.twitter.util.Future
import com.swisssystem.TwitterFutureOps._
import javax.inject.Inject
import scala.concurrent.ExecutionContext.Implicits.global

class TournamentService @Inject() (
  tournamentRepository: TournamentRepository
) {

  def insertPlayer(name: String) = tournamentRepository.insertPlayer(name)

  def fetchPlayers(): Future[Seq[PlayerDto]] = {
    tournamentRepository.fetchPlayers().map(_.map(player => PlayerDto(player.id.get, player.name))).toTwitterFuture
  }
}
