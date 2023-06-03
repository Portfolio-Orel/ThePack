package com.orels.thepack.data.local

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.orels.thepack.domain.model.Location

class Converters {
    @TypeConverter
    fun locationToString(location: Location): String = Gson().toJson(location)

    @TypeConverter
    fun stringToLocation(string: String): Location = Gson().fromJson(string, Location::class.java)

    @TypeConverter
    fun stringToStringsList(string: String): List<String> = Gson().fromJson(string, Array<String>::class.java).toList()

    @TypeConverter
    fun stringsListToString(strings: List<String>): String = Gson().toJson(strings)
}