package com.epam.app.calc

import scala.util.Random

class CalculatorImp extends Calculator {

  private val random : Random = new Random()

  /**
   * Returns a + b
   * @param a Number 1
   * @param b Number 2
   * @return sum
   */
  override def add(a: Int, b: Int): Int = {
    a + b
  }

  /**
   * Returns a - b
   * @param a Number 1
   * @param b Number 2
   * @return subtract
   */
  override def subtract(a: Int, b: Int): Int = {
    a - b
  }

  /**
   * Devides a with b
   * @param a Number 1
   * @param b Number 2
   * @return a / b
   */
  override def divide(a: Int, b: Int): Double = {
    (a.toDouble  / b.toDouble )
  }

  /**
   * Multiply a with b
   * @param a
   * @param b
   * @return a * b
   */
  override def multiply(a: Int, b: Int): Int = {
    a * b
  }

  /**
   * A higher order function.
   * @param a [Int]
   * @param b
   * @param f
   * @return f(a,b)
   */
  override def applyFunction(a: Int, b: Int, f: (Int, Int) => Int): Int = {
    f(a, b)
  }

  /**
    * Generates random number between min and max
    * @param min Minimum inclusive
    * @param max Maximum exclusive
    * @return Random number
    */
  override def randomBetween(min: Int, max: Int): Int = {
    min + random.nextInt(max - min)
  }
}

/**
  * Companion object
  */
object CalculatorImp {
  def apply(): CalculatorImp = new CalculatorImp()
}
