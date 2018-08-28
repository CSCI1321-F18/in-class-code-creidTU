package basics

class HitBox (
  //Position
  private var _cx: Double = 0.0,
  private var _cy: Double = 0.0,
  //Size
  val width: Double = 1.0,
  val height: Double = 1.0,
  ){
  
  def cx = _cx
  def cy = _cy
  //Finding if HitBox intersects another HitBox
  def intersects(other: HitBox):Boolean = {
    val overlapX = (_cx - other._cx).abs < 0.5*(width + other.width)
    val overlapY = (_cy - other._cy).abs < 0.5*(height + other.height)
    overlapX && overlapY
  }
}