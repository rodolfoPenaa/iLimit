package com.example.fordrink.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class RoomDDBB:RoomDatabase() {

    abstract fun dAO():DrinksDAO
    companion object{
                    @Volatile
                    private var INSTANCE: RoomDDBB?=null
        fun getDDBB(context: Context): RoomDDBB{
            val tempINSTANCE= INSTANCE
            if (tempINSTANCE!=null){
                return tempINSTANCE
            }
         synchronized(this){
             val instance = Room.databaseBuilder(context.
             applicationContext,
             RoomDDBB::class.java,
             "added_item"
             ).build()
             INSTANCE=instance
             return  instance
         }
        }
    }
}