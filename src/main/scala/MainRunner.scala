import Controller.Students

object MainRunner {

  def main(args: Array[String]): Unit = {
    val studentsList = List(
      Students("student1",25,17),
      Students("student2",20,16),
      Students("student3",24,19),
      Students("student4",25,18),
      Students("student5",25,9),
      Students("student6",22,9),
      Students("student7",22,17),
      Students("student8",23,12),
      Students("student9",25,13),
      Students("student10",22,10),
      Students("student11",25,17),
      Students("student12",20,16),
      Students("student13",24,1),
      Students("student14",25,19),
      Students("student15",25,9)
    )

    println("group students by age: " + Controller.groupStudentsByAge(studentsList))
    println("group students by age and grade: " + Controller.groupStudentsByAgeAndGrade(studentsList))
    println("students with grade above 17: " + Controller.getStudentsWithGradeAbove17(studentsList))
    println("sort students by age and grade: " + Controller.sortStudentsByAgeAndGrade(studentsList))
    println("sort students by their age: " + Controller.sortStudentsByAge(studentsList))
    println("find student with std id: " + Controller.findStudentByStdIdInMap(93111011))
    println("simple add function  "+ Controller.+(3,2))
    println(Controller.getFirstStudentInList(studentsList))
    println("add two numbers in curried function   " + Controller.add_curried(10)(20))
  }
}
