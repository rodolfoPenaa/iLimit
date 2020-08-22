package com.example.fordrink.db

import androidx.lifecycle.LiveData

class Repository(private val productsDAO: DrinksDAO) {
    val allProducts:LiveData<List<Products>> = productsDAO.getAllCheckItems()

    suspend fun  insertProducts(products: Products){
        productsDAO.insertCheckItem(products)

    suspend fun deleteAllProducts(){
        val checkproducts= allProducts.value?.toTypedArray()
        if (checkproducts!=null){
            productsDAO.clearAllCheckItems(*checkproducts)
        }
    }

    }
}