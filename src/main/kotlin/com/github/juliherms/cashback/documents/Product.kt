package com.github.juliherms.cashback.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * This class responsible to represents Product
 */
@Document
data class Product(
     val description: String,
     @Id val id: String? = null
)
