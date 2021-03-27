package com.github.juliherms.cashback.utils

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class PasswordUtilsTest {

    private val PASSWORD = "112233";
    private val bCryptEncoder = BCryptPasswordEncoder()

    @Test
    fun testMakeHashPassword(){
        val hash = PasswordUtils().makeBcrypt(PASSWORD)
        Assertions.assertTrue(bCryptEncoder.matches(PASSWORD,hash))
    }
}