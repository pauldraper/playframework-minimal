package example

import play.api.mvc.{Action, Controller}

class ExampleController extends Controller {

	def get = Action(Ok("Hello world!"))

}
