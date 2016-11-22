package com.swisssystem.services

import com.swisssystem.PlayerDto
import com.swisssystem.persistence.PlayerRepository

import com.twitter.util.Future
import com.swisssystem.TwitterFutureOps._
import javax.inject.Inject
import scala.concurrent.ExecutionContext.Implicits.global

class PlayerService @Inject() (
  playerRepository: PlayerRepository
) {
  def fetchPlayers(): Future[Option[PlayerDto]] = {
    playerRepository.fetchPlayers().map(_.map(player => PlayerDto(player.id.toInt, player.name))).toTwitterFuture
  }
}
