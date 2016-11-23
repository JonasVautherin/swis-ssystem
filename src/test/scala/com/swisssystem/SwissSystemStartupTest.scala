package com.swisssystem

import com.google.inject.Stage
import com.twitter.finatra.http.EmbeddedHttpServer
import com.twitter.inject.server.FeatureTest

class SwissSystemStartupTest extends FeatureTest {
  override val server = new EmbeddedHttpServer(
    twitterServer = new Server,
    stage = Stage.PRODUCTION,
    verbose = false)

  "Server" should {
    "startup" in {
      server.assertHealthy()
    }
  }
}
