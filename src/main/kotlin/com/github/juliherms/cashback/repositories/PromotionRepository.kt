package com.github.juliherms.cashback.repositories

import com.github.juliherms.cashback.documents.Promotion
import com.github.juliherms.cashback.enums.TypeEnum
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface PromotionRepository : MongoRepository<Promotion,String> {

    /**
     * find all promotions by type
     */
    fun findByType(type: TypeEnum, pageable: Pageable) : Page<Promotion>


}