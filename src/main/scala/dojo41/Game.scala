package dojo41

/**
  * Created by cs4r on 23/01/17.
  */
object Game {


  sealed trait Room

  case object Empty extends Room
  case object WumpusInside extends Room
  case object BottomLessPit extends Room
  case object ArrowInside extends Room

  sealed trait GameState
  case class GameRunning(arrows: Int, room: Room) extends GameState
  case object GameOver extends GameState

  def checkRoom(game: GameRunning): GameState = game.room match {
    case Empty => game
    case WumpusInside => GameOver
    case BottomLessPit => GameOver
    case ArrowInside => game.copy(arrows = game.arrows + 1, room = Empty)
    case _ => ???
  }

}
