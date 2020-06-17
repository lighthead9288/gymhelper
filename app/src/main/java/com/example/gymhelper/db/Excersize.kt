package com.example.gymhelper.db

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Excersizes")
data class Excersize(
    @PrimaryKey(autoGenerate = true)
    var ExcersizeId: Long = 0L,

    @ColumnInfo(name = "Name")
    val Name: String,

    @ColumnInfo(name="Group")
    val Group: String,

    @ColumnInfo(name="Subgroup")
    val Subgroup: String,

    @ColumnInfo(name = "Description")
    val Description: String,

    @ColumnInfo(name="Level")
    val Level: String

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readLong(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeLong(ExcersizeId)
        parcel.writeString(Name)
        parcel.writeString(Group)
        parcel.writeString(Subgroup)
        parcel.writeString(Description)
        parcel.writeString(Level)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Excersize> {
        override fun createFromParcel(parcel: Parcel): Excersize {
            return Excersize(parcel)
        }

        override fun newArray(size: Int): Array<Excersize?> {
            return arrayOfNulls(size)
        }
    }
}