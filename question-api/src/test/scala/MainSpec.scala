import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class HelloSpec extends FlatSpec with ShouldMatchers {
  "Hello" should "have tests" in {
    true should be === true
  }

  //Post("/api/authentication/signup", HttpEntity(MediaTypes.`application/json`, """{"email":"foo", "password":"foo" }""")))
}
