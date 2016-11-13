import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class MainController extends Controller {
  get("/ping") { request: Request =>
    info("ping")
    "pong"
  }
}
