package com.epam.shared

import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.WebBrowser
import org.scalatest._

abstract class UnitSpec extends FunSuite with Matchers {}

abstract class AcceptanceSpec extends FeatureSpec with Matchers with GivenWhenThen with Eventually with WebBrowser with BeforeAndAfterAll{}
