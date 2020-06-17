package com.example.gymhelper.model

import com.example.gymhelper.db.TrainingProfile

data class TrainingProfileWithDetails(val trainingProfile: TrainingProfile, val isChecked: Boolean)