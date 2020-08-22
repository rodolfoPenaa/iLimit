package com.example.fordrink.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "added_Item")
data class Products(@PrimaryKey (autoGenerate = true) @NotNull val name:String,
                    val singleprice:Int,
                    val quantity:Int,
                    val total:String)
