package dojo41

import org.scalatest.{FreeSpec, Matchers}

/**
  * Created by cs4r on 23/01/17.
  */
class WorldTest extends FreeSpec with Matchers {


  "createRoom" - {

    "list size is 20" in {
      World.createWorld().size shouldBe 20
    }

    "every room index should appear exactly three times" in {
     println(World.vertices.flatMap(vertex => List(vertex.x, vertex.y, vertex.z)).groupBy(identity) )
      World.vertices.flatMap(vertex => List(vertex.x, vertex.y, vertex.z)).groupBy(identity) forall { case (_, values) => values.size == 3 } shouldBe true

      World.vertices.flatMap(vertex => List(vertex.x, vertex.y, vertex.z)) should have length(60)
    }
  }

}
