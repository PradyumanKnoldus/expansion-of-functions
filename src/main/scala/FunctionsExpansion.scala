object FunctionsExpansion extends App {

  // Expansion of following functions


  // val adder: (Int, Int) => Int = (firstNumber: Int, secondNumber: Int) => firstNumber + secondNumber

  val adder: (Int, Int) => Int = new Function2[Int, Int, Int] {
    def apply(firstNumber: Int, secondNumber: Int): Int = firstNumber + secondNumber
  }
  adder.apply(3, 4)


  // val sumOfList: List[Int] => Int = (inputList: List[Int]) => inputList.sum

  val sumOfList: List[Int] => Int = new Function1[List[Int], Int] {
    def apply(inputList: List[Int]): Int = {
      if (inputList == null) throw new RuntimeException("Error: Input list is null.")
      inputList.sum
    }
  }
  sumOfList.apply(List(2,3,4,5,6))


  // val higherOrderFunction: (Int => Int, Int) => Int = (f: (Int => Int), num : Int) => function(num)

  val higherOrderFunction: (Int => Int, Int) => Int = new Function2[Int => Int, Int, Int] {
    def apply(function: Int => Int, num: Int): Int = function(num)
  }
  higherOrderFunction.apply((x: Int) => x * 2, 5)
}
