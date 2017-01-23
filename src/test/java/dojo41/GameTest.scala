package dojo41

import dojo41.Game._
import org.scalatest._

/**
  * Created by cs4r on 23/01/17.
  */
class GameTest extends FreeSpec with Matchers {


  "checkRooom" - {
    "Free should return Continue" in {
      Game.checkRoom(Empty) shouldEqual Continue
    }

    "WumpusInside should return GameOver" in {
      Game.checkRoom(WumpusInside) shouldEqual GameOver
    }

    "BottomLesPit should return GameOver" in {
      Game.checkRoom(BottomLessPit) shouldEqual GameOver
    }
  }
}
