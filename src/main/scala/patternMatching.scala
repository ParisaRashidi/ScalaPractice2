import scala.util.Random

object patternMatching extends App {

  val random_number = new Random()
  val x = random_number.nextInt(10)

  val description = x match {
    case 1 => "number one"
    case 2 => "number two"
    case _ => "something else" // whildcard or else matcher error
  }

  println(x)
  println(description)

  case class Person(name: String, age: Int)
  val parisa = Person("parisa",25)

  val greeting = parisa match {
    case Person(n,a) if a < 21 => s"hi my name is $n and I am $a years old I am less than 21 !"
    case _ => "something else"
  }

  println(greeting)

  sealed class Animal
  case class Dog(breed: String) extends Animal
  case class Parrot(greeting: String) extends Animal

  val animal:Animal = Dog("meat")
  animal match {
    case Dog(breed) => println(s"dog eats $breed")
  }


}

