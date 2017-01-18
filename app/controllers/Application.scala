package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    val names = List("James", "Emma", "Ollie", "Nate")
    Ok(views.html.index("One more time... <small>with feeling</small>", names))
  }

  def another = Action { implicit request =>
    val initialValue = session.get("counter").map(_.toInt).getOrElse(0)
    Ok(views.html.another()).withSession("counter" -> (initialValue + 1).toString)
  }

}