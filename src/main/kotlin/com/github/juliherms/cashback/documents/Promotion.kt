package com.github.juliherms.cashback.documents

import com.github.juliherms.cashback.enums.TypeEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

/**
 * This class represents promotion in the system
 */
@Document
data class Promotion (
        val name: String,
        val amount: Float? = 0.0f,
        val type: TypeEnum,
        val initialDate: Date,
        val expiredDate: Date,
        @Id val id: String? = null
)
