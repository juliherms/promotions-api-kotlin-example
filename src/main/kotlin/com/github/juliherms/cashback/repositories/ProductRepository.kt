package com.github.juliherms.cashback.repositories

import com.github.juliherms.cashback.documents.Product
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * This class responsible to access Document Product
 */
interface ProductRepository : MongoRepository<Product, String> {

    /**
     * Find product by description
     */
    fun findByDescription(description: String): Product?
}
