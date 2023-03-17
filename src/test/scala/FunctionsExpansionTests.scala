import org.scalatest.flatspec.AnyFlatSpec

class FunctionsExpansionTests extends AnyFlatSpec {

  "adder" should "correctly add two numbers" in {
    val adder = FunctionsExpansion.adder
    assert(adder(2, 3) == 5)
    assert(adder(-1, 1) == 0)
    assert(adder(0, 0) == 0)
  }

  "sumOfList" should "correctly sum a list of integers" in {
    val sumOfList = FunctionsExpansion.sumOfList
    assert(sumOfList(List(1, 2, 3, 4, 5)) == 15)
    assert(sumOfList(List(0, 0, 0, 0)) == 0)
  }

  "higherOrderFunction" should "correctly apply a function to a number" in {
    val higherOrderFunction = FunctionsExpansion.higherOrderFunction
    assert(higherOrderFunction((x: Int) => x * 2, 5) == 10)
    assert(higherOrderFunction((x: Int) => x + 10, 0) == 10)
    assert(higherOrderFunction((x: Int) => x - 5, -5) == -10)
  }

}
