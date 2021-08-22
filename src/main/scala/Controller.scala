object Controller extends App {
  case class Students(name: String, age: Int, grade: Int)
  def findStudentByStdIdInMap(stdNumber: Int): String = {
    val res: Map[Int, String] = Map(93111011 -> "Parisa" , 93111012 -> "hafez")
    res.get(stdNumber).getOrElse("not found")
  }
  def sortStudentsByAge(xs: List[Students]) = {
    val res = xs.sortBy (_.age).map(_.name)
    res
  }
  def sortStudentsByAgeAndGrade(xs: List[Students]) = {
    val res = xs.sortBy (r => (r.age, r.grade)).map(_.name)
    res
  }
  def getStudentsWithGradeAbove17(xs: List[Students]) : List[String] = {
  val res = xs.filter(_.grade > 17).map(_.name)
  res
  }
  def groupStudentsByAgeAndGrade(xs: List[Students]) = {
  val res = xs.groupBy(x => (x.age,x.grade)).mapValues(_.size).toList.sorted
  res
}
  def +(x: Int,y:Int): Int = {
    val res = x+y
    res
  }
  def add_curried(x: Int) (y: Int) = {
    val res = x + y
    res
  }
  def getFirstStudentInList(xs: List[Students]): Object = {
    val res = xs.headOption.getOrElse("student list is empty")
    res
  }
  def reverseStudentList(xs: List[Students]): List[Students]= {
    val res = xs.reverse
    res
  }
  def groupStudentsByAge(xs: List[Students]) = {
  val res = xs.groupBy(x => (x.age)).mapValues(_.size).toList.sorted
  res
}
}
