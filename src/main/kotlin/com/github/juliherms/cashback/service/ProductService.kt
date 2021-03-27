package com.github.juliherms.cashback.service

import com.github.juliherms.cashback.documents.Product
import com.github.juliherms.cashback.dto.ProductDTO
import com.github.juliherms.cashback.repositories.ProductRepository
import org.springframework.stereotype.Service

/**
 * This class responsible to implement business logic from Product
 * Using dependency injection by constructor
 */
@Service
class   ProductService(val productRepository: ProductRepository) {


    /**
     * Convert ProductDTO to Product
     */
    fun convertDtoToProduct(productDTO: ProductDTO) : Product {

        return Product(productDTO.description)
    }

    /**
     * Find product by description
     */
    fun findByDescription(productDTO: ProductDTO) : Product? = productRepository.findByDescription(productDTO.description)

    /**
     * Save product
     */
    fun persist(productDTO: ProductDTO) : Product = productRepository.save(convertDtoToProduct(productDTO))
}