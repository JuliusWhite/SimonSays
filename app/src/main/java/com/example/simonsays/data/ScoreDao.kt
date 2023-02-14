package com.example.simonsays.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ScoreDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addScore(score:Score)

    @Query("SELECT score FROM scores_table WHERE score = (SELECT max(score) FROM scores_table)")
    fun getRecord(): Int

}