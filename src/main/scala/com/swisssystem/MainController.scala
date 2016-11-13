package com.swisssystem

import javax.inject.Inject

import com.swisssystem.services.PlayerService
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class MainController @Inject() (playerService: PlayerService) extends Controller {
  get("/ping") { request: Request =>
    info("ping")
    "pong"
  }
}
