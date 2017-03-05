package example

import play.api.mvc.{Action, Controller}

object ExampleController extends Controller {

	def get = Action(Ok("Hello world!"))

}
