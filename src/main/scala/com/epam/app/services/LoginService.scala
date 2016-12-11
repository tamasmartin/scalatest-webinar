package com.epam.app.services

import com.epam.app.dao.{LoginDaoImp}
import com.epam.app.domain.User

class LoginService(dao: LoginDaoImp) {

  def login(name: String, password: String): Option[User] = {

    dao.findUser(name: String, password: String) match {
      case true => {
        dao.writeLoginAttempt(name, true)
        Some(User(name))
      }
      case false => {
        dao.writeLoginAttempt(name, false)
        None
      }
    }
  }
}
