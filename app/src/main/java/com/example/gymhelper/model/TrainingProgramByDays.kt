package com.example.gymhelper.model

import android.os.Parcel
import android.os.Parcelable
import com.example.gymhelper.db.Excersize
import com.example.gymhelper.db.TrainingProgramDay


class ProgramByDays(val trainingDays: MutableList<TrainingDay>) {
}

data class TrainingDay(val Day: TrainingProgramDay, val Excercizes: List<Excersize>)


