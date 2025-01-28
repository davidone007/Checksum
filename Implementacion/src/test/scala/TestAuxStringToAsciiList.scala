import org.scalatest.flatspec._
import org.scalatest.matchers.should.Matchers
import  scala.*
import model.*

/**
 * This class contains unit tests for the BinarySearch function.
 */
class TestAuxStringToAsciiList extends AnyFlatSpec with Matchers {

  val single = new SingleCheckSum("Single", 13)

  "StrinToAscii" should "Test 1: Empty string should return an empty list" in {

    single.stringToAsciiList("", 2) shouldBe empty
  }

  it should "Test 2: Block size greater than string length should return a list with ASCII values of characters" in {
    single.stringToAsciiList("abc", 5) shouldEqual List(97, 98, 99)
  }

  it should "Test 3: Block size equal to string length should return a list with ASCII values of characters" in {
    single.stringToAsciiList("hello", 5) shouldEqual List(104, 101, 108, 108, 111)
  }

  it should "Test 4: Block size less than string length should return a list with ASCII values of characters in blocks" in {
    single.stringToAsciiList("hello", 2) shouldEqual List(104, 101, 108, 108, 111)
  }

  it should "Test 5: Special characters in the string should be converted to ASCII values" in {
    single.stringToAsciiList("!@#$", 2) shouldEqual List(33, 64, 35, 36)
  }

  it should "Test 6: Mix of uppercase and lowercase characters in the string" in {
    single.stringToAsciiList("HelloWorld", 3) shouldEqual List(72, 101, 108, 108, 111, 87, 111, 114, 108, 100)
  }

}
