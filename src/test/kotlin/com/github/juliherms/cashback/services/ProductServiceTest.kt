package com.github.juliherms.cashback.services

import com.github.juliherms.cashback.documents.Product
import com.github.juliherms.cashback.dto.ProductDTO
import com.github.juliherms.cashback.repositories.ProductRepository
import com.github.juliherms.cashback.service.ProductService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.BDDMockito
import org.mockito.Mock
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

/**
 * This class responsible to implement test case for Product service
 */
@SpringBootTest()
class ProductServiceTest {

    @Autowired
    val productService : ProductService? = null

    @Mock
    private val productRepository: ProductRepository? = null

    private val DESCRIPTION = "Ração Premiere"

    private fun product() : Product = Product("Ração Premiere","1")

    private fun productDto() : ProductDTO = ProductDTO(DESCRIPTION)

    @BeforeEach
    fun setUp() {

        BDDMockito.given(productRepository?.save(product())).willReturn(product())

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

    /**
     * Test save product
     */
    @Test
    fun testPersistProductSuccess() {

        val product: Product? = productService?.persist(productDto())
        Assertions.assertNotNull(product)
    }
}
