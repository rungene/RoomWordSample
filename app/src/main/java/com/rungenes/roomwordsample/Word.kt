package com.rungenes.roomwordsample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


//represents the entity.Each property in the class represents a column in the table.
// The room to eventually use these properties to both create the table and instantiate objects from rows in the database.
//To make the Word class meaningful to a Room database, you need to annotate it
// Annotations identify how each part of this class relates to an entry in the database.


@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String) {


}