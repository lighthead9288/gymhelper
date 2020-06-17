package com.example.gymhelper.model

import com.example.gymhelper.db.Excersize
import com.example.gymhelper.db.Photo

data class ExcersizeWithDetails(val excersize: Excersize, val photos:MutableList<Photo>)