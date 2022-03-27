package Lesson1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TestSpec extends AnyFlatSpec with should.Matchers{

  //AppRunner.main(Array.empty) общий тест через AnyFlatSpec

  "plusOne" should "work properly" in {
    AppRunner.plusOne(1) shouldBe 2
  }

}
