package com.epam.app.services

import com.epam.app.dao.{LoginDao}
import com.epam.app.domain.User

class LoginService(loginDao: LoginDao) {

  def login(name: String, password: String): Option[User] = {

    loginDao.findUser(name: String, password: String) match {
      case true => {
        loginDao.writeLoginAttempt(name, true)
        Some(User(name))
      }
      case false => {
        loginDao.writeLoginAttempt(name, false)
        None
      }
    }
  }
}

object LoginService {

  def apply(loginDao: LoginDao): LoginService = new LoginService(loginDao)

}
