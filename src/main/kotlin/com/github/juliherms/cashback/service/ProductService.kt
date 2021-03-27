package com.github.juliherms.cashback.service

import com.github.juliherms.cashback.documents.Product
import com.github.juliherms.cashback.dto.ProductDTO
import org.springframework.stereotype.Component
import java.util.concurrent.ConcurrentHashMap

@Component
class ProductService {

    fun convertDtoToProduct(productDTO: ProductDTO) : Product {

        return Product(productDTO.description)
    }

}