package com.epam.app.calc

import com.epam.shared.{UnitSpec, UnitTest}
import org.scalamock.scalatest.MockFactory


class CalculatorTest extends UnitSpec with MockFactory {

  test("We would like to know how the Calculator works", UnitTest) {

    val calc = CalculatorImp()

    calc.add(10, 20) shouldBe(30)

    calc.multiply(10,15) shouldBe(150)

  }

  test("testing the applyfunction method", UnitTest) {
    val calc = CalculatorImp()
    val fx = mockFunction[Int, Int, Int]
    fx expects(*, *) noMoreThanTwice() onCall{
      2 * _ + _
    }
    calc.applyFunction(3, 14, fx) shouldBe(20)
    calc.applyFunction(5, 20, fx) shouldBe(30)
  }

}
