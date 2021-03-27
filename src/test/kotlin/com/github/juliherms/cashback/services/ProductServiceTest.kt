package com.github.juliherms.cashback.services

import com.github.juliherms.cashback.documents.Product
import com.github.juliherms.cashback.dto.ProductDTO
import com.github.juliherms.cashback.repositories.ProductRepository
import com.github.juliherms.cashback.service.ProductService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.BDDMockito
import org.mockito.Mockito.`when`
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit.jupiter.SpringExtension

/**
 * This class responsible to implement test case for Product service
 */
@SpringBootTest
@ExtendWith(SpringExtension::class)
class ProductServiceTest {

    @Autowired
    val productService : ProductService? = null

    @MockBean
    private val productRepository: ProductRepository? = null

    private val DESCRIPTION = "Ração Premiere"

    private fun product() : Product = Product(DESCRIPTION,"1")

    private fun productDto() : ProductDTO = ProductDTO(DESCRIPTION,"1")

    @BeforeEach
    fun setUp() {


    }
    /**
     * Test find products by description
     */
    @Test
    fun testFindProductByDescriptionSuccess(){

        BDDMockito.given(productRepository?.findByDescription(DESCRIPTION)).willReturn(product())

        val product: Product? = productService?.findByDescription(productDto())
        Assertions.assertNotNull(product)
    }
}
