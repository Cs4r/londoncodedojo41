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

  case class Continue(val numberOfArrows) extends GameState {

  }
  case object GameOver extends GameState


  def checkRoom(room: Room) = room match {
    case Empty => Continue
    case WumpusInside => GameOver
    case BottomLessPit => GameOver
    case _ => ???
  }

}
