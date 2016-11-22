package com.swisssystem

import javax.inject.Inject

import com.swisssystem.services.PlayerService
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class MainController @Inject() (playerService: PlayerService) extends Controller {
  get("/ping") { request: Request =>
    logger info "ping"
    "pong"
  }

  get("/players") { request: Request =>
    logger info "players"
    playerService fetchPlayers
  }
}
