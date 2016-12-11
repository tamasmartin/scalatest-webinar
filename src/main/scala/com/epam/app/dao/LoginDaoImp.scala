package com.epam.app.dao

class LoginDaoImp extends LoginDao {

  override def findUser(name: String, password: String): Boolean = {
    true
  }

  override def writeLoginAttempt(name: String, success: Boolean): Unit = {

    success match {
      case true => println(s"The user ${name} successfully logged in.")
      case _ => println(s"The login attempt of user ${name} is rejected.")
    }
  }

}
