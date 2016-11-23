package com.swisssystem

import javax.inject.Inject

import com.swisssystem.services.TournamentService
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

case class InsertPlayerRequest(name: String)

class MainController @Inject() (tournamentService: TournamentService) extends Controller {
  get("/ping") { request: Request =>
    logger info "ping"
    "pong"
  }

  get("/players") { request: Request =>
    logger info "players"
    tournamentService fetchPlayers
  }

  post("/player") { request: InsertPlayerRequest =>
    logger info s"adding player ${request.name}"
    tournamentService.insertPlayer(request.name)
  }
}
