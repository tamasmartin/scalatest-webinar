package com.epam.app.dao

trait LoginDao {

  def findUser(name: String, password: String): Boolean

  def writeLoginAttempt(name: String, success: Boolean): Unit

}
