package com.example.gymhelper.model

import com.example.gymhelper.db.TrainingProgram

data class TrainingProgramWithDetails(val trainingProgram: TrainingProgram, val isChecked: Boolean)