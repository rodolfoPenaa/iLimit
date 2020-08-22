package com.example.fordrink.db

import androidx.lifecycle.LiveData
import androidx.room.*

interface DrinksDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCheckItem(products: Products)
    @Update
    suspend fun updateCheckItem(products: Products)
    @Delete
    suspend fun clearAllCheckItems(vararg creature: Products)

    @Query("SELECT * FROM added_Item ORDER BY name ASC")
    fun getAllCheckItems(): LiveData<List<Products>>

}