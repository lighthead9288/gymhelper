package com.example.gymhelper.model

import com.example.gymhelper.db.Excersize


class ExcersizesByGroups(val excersizesGroups: MutableList<ExcersizeGroup>)

data class ExcersizeGroup(val groupName: String, val excersizes: List<Excersize>)