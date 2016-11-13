package com.swisssystem.persistence

import javax.inject.Inject
import slick.driver.SQLiteDriver.api._

import com.swisssystem.modules.SlickDatabaseModule.SlickDatabaseSource

class PlayerRepository @Inject() (db: SlickDatabaseSource) {
  private class PlayerTable(tag: Tag) extends Table[Players](tag, "players") {
    def id = column[Long]("id", O.PrimaryKey)
    def name = column[String]("name")
    def * = (id, name) <> ((Players.apply _).tupled, Players.unapply)
  }
}
