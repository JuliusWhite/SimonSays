package com.example.simonsays.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "scores_table")
data class Score(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "score") val score: Int?,
    @ColumnInfo(name = "date") val _date: String?
)
