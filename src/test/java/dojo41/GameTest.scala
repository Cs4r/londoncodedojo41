package dojo41

import dojo41.Game._
import org.scalatest._

/**
  * Created by cs4r on 23/01/17.
  */
class GameTest extends FreeSpec with Matchers {

  def state(room: Room, arrows: Int = 5): GameRunning =
    GameRunning(arrows, room)

  "checkRooom" - {
    "Free should return Continue" in {
      checkRoom(state(Empty)) shouldEqual state(Empty)
    }

    "WumpusInside should return GameOver" in {
      checkRoom(state(WumpusInside)) shouldEqual GameOver
    }

    "BottomlessPit should return GameOver" in {
      checkRoom(state(BottomLessPit)) shouldEqual GameOver
    }

    "RoomWithArrow should return Continue with +1 arrow" in {
      checkRoom(state(ArrowInside)) shouldEqual GameRunning(arrows = 6, room = Empty)
      Game.checkRoom(state(ArrowInside, arrows = 4)) shouldEqual GameRunning(arrows = 5, room = Empty)
    }
  }
}
