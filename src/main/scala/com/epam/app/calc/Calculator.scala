package com.epam.app.calc

trait Calculator {

  def add(a: Int, b: Int): Int

  def subtract(a: Int, b: Int): Int

  def divide(a: Int, b: Int): Double

  def multiply(a: Int, b: Int): Int

  def applyFunction(a: Int, b: Int, f: (Int, Int) => Int): Int

  def randomBetween(min: Int, max: Int): Int

}

