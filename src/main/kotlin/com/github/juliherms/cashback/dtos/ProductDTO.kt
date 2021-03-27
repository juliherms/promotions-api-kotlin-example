package com.github.juliherms.cashback.dto

import javax.validation.constraints.NotEmpty


data class ProductDTO (

    @get:NotEmpty(message = "Nome não pode ser vazio.")
    val description: String,
    val id: String? = null
)
