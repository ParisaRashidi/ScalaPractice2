object Student extends App {

  // var getter and setter
  // val getter no setter
  case class Students(name: String, age: Int, grade: Int) {
      def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
      def greet(): Unit = println(s"Hi, I am $name")
      def groupByAge(stds: List[Students]) = println(stds.groupBy( x => (x.age)).mapValues(_.size).toList)
      def bestStudents(stds: List[Students]): Unit = println(stds.filter(x => x.grade > 17))
      def topStudent(stds: List[Students]): Unit = println(stds.maxBy( x => x.grade))
      def sortOldestToYoungest(stds: List[Students]): Unit = println(stds.sortBy (x => x.age))
    }

     val st = new Students("student1",0,0)
     st.greet("student2")
     val studentsList = List(
           Students("student1",25,17),
           Students("student2",20,16),
           Students("student3",24,17),
           Students("student4",25,20),
           Students("student5",25,9),
           Students("student6",22,9),
           Students("student7",22,19),
           Students("student8",23,12),
           Students("student9",25,13),
           Students("student10",22,10),
     )
    st.groupByAge(studentsList)
    st.bestStudents(studentsList)
    st.topStudent(studentsList)
    st.sortOldestToYoungest(studentsList)
}
