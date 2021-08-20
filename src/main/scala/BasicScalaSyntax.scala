import java.util.Date

object BasicScalaSyntax extends App {
  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)

  //slice is a pure function
  val xs = Array(1, 2, 3, 4, 5)
  println(xs.slice(0, 3))
  println(xs.slice(0, 3))
  println(xs.slice(0, 3))


  //for loop
  for (i <- 1 to 5) {
    println("i using to" + i)
  }

  //list
  val lst = List(1,2,3,4,5,6,7,8,9,10)
  for (i <- lst if i < 10){
    println("value in the list" + i)
  }

  //use for loop as expersion
  val myresult = for { i <- lst if i< 6 } yield {
    i * i
  }
  println("result: " + myresult )


  object func{
    def +(x: Int,y:Int): Int = { x+y }
    def log(data: Date,message: String):Unit = {
      println(data+"     "+message)
    }
    def add(x: Int, y: Int) = x + y
    def add_curried(x: Int) (y: Int) = x + y
  }

  println("result of add function is: " + func.+(3,2))

  //Partially Applied Functions
  val date = new Date()
  val newLog = func.log(date, _:String)
  newLog("log1")
  newLog("log2")

  //curried function
  println(func.add_curried(10)(20))

  // list
  println(0 :: lst) // can not change the value of lst but it will print 0 at the beginning
  println( 0 :: 1 :: 2 :: Nil) // create a list (0,1,2)
  println(lst.head) // first element of list
  println(lst.tail) // last element of list -> (1,2)
  println(lst.empty) // if empty the result is True
  println(lst.reverse) // reverses the list
  println(lst.max)
  var sum: Int = 0
  lst foreach(sum+=_)
  println(sum)

//  set
//   only unique values and it is not sorted in scala
  val names: Set[String] = Set("parisa", "hafez", "husin")
  println(names + "mohammad")

// maps key value pairs
  val myMap: Map[Int, String] = Map(801 -> "Parisa" , 802 -> "hafez")
  myMap.keys.foreach { key => println(key + "   " + myMap(key))}

// map and filter
  println(lst.map(x=> x * 2))
  println(lst.map(x=> "hi" * x))
  println(lst.flatMap(x => List(x , x+1 )))
  println(lst.filter(x => x%2 != 0 ))

  //reduce and fold (left/right)
  print(lst.reduceLeft(_ + _))








}
