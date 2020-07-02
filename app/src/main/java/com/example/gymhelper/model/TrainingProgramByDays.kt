package com.example.gymhelper.model

import com.example.gymhelper.db.Excersize
import com.example.gymhelper.db.TrainingProgramDay

data class ProgramByDays(val trainingDays: MutableList<TrainingDay>)

data class TrainingDay(val Day: TrainingProgramDay, val Excercizes: List<Excersize>)


