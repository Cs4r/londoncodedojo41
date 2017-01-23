package dojo41

/**
  * Created by cs4r on 23/01/17.
  */
object World {


  case class Tile()
  case class Vertex(x: Int, y: Int, z: Int)


  def createWorld(): List[Tile] = {
    (1 to 20).map(_ => Tile()).toList
  }

  val vertices: List[Vertex] = List(

    Vertex(2, 5, 8),
    Vertex(1, 10, 3),
    Vertex(12, 4, 2),
    Vertex(14, 5, 3),
    Vertex(6, 1, 4),
    Vertex(15, 5, 7),
    Vertex(8, 6, 17),
    Vertex(1, 11, 7),
    Vertex(19, 12, 10),
    Vertex(9, 2, 11),
    Vertex(20, 8, 10),
    Vertex(13, 9, 3),
    Vertex(18, 14, 12),
    Vertex(13, 15, 4),
    Vertex(6, 14, 16),
    Vertex(17, 15, 18),
    Vertex(7, 20, 16),
    Vertex(13, 19, 16),
    Vertex(9, 20, 18),
    Vertex(11, 17, 19)
  )


}
