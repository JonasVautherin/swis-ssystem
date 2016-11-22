package com.swisssystem.persistence

import com.swisssystem.modules.SlickDatabaseModule.SlickDatabaseSource

import javax.inject.Inject
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import slick.driver.SQLiteDriver.api._

class PlayerRepository @Inject() (db: SlickDatabaseSource) {
  private class PlayerTable(tag: Tag) extends Table[Players](tag, "players") {
    def id = column[Long]("id", O.PrimaryKey)
    def name = column[String]("name")
    def * = (id, name) <> ((Players.apply _).tupled, Players.unapply)
  }

  private val players = TableQuery[PlayerTable]

  def fetchPlayers(): Future[Option[Players]] = {
    db.run {
      //players.filter(x => x.id === x.id).take(2).result
      players.result
    }.map(_.headOption)
  }
}
