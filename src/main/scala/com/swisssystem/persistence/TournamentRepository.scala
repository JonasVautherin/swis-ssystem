package com.swisssystem.persistence

import com.swisssystem.modules.SlickDatabaseModule.SlickDatabaseSource

import javax.inject.Inject
import scala.concurrent.duration.Duration
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future, Await}
import slick.driver.SQLiteDriver.api._

class TournamentRepository @Inject() (db: SlickDatabaseSource) {
  private class PlayerTable(tag: Tag) extends Table[Players](tag, "players") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def name = column[String]("name")
    def * = (id.?, name) <> (Players.tupled, Players.unapply)
  }

  private val players = TableQuery[PlayerTable]

  def insertPlayer(name: String) = {
    db.run { players += Players(None, name) }
  }

  def fetchPlayers(): Future[Seq[Players]] = {
    db.run { players.result }
  }
}

case class Players(id: Option[Int], name: String)
