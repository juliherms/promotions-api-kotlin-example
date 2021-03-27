package com.github.juliherms.cashback.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class PasswordUtils {

    /**
     * Method responsible to encode password
     */
    fun makeBcrypt(password: String): String = BCryptPasswordEncoder().encode(password)
}