package com.swisssystem

import com.swisssystem.modules._

import com.twitter.inject.Logging
import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter

object ServerMain extends Server

class Server extends HttpServer with Logging {
  override def modules = Seq(TypesafeConfigModule, SlickDatabaseModule)

  override def defaultFinatraHttpPort = ":9999"

  override def configureHttp(router: HttpRouter) {
    router
      .add[MainController]
  }

  override def warmup() {
    logger info s"Warming up..."
  }
}
