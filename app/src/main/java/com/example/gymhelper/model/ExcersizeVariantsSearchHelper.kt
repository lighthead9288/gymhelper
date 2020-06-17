package com.example.gymhelper.model

import com.example.gymhelper.db.Excersize

class ExcersizeVariantsSearchHelper(private val source: MutableList<Excersize>) {

    fun getSortedExcersizeVariantsList(excersize: Excersize): MutableList<Excersize> {
        var resList = mutableListOf<Excersize>()
        //Add excersizes with a same group, subgroup and level
        val fullMatchExs = source.filter {x->((x.Group==excersize.Group)||(x.Group==""))
                &&((x.Subgroup==excersize.Subgroup)||(x.Subgroup==""))
                &&((x.Level==excersize.Level)||(x.Level==""))
                &&(x.ExcersizeId!=excersize.ExcersizeId)}
        resList.addAll(fullMatchExs)
        //Add excersizes with a same group and subgroup
        val secondGroupExs = source.filter {x->((x.Group==excersize.Group)||(x.Group==""))
                &&((x.Subgroup==excersize.Subgroup)||(x.Subgroup==""))
                &&(x.ExcersizeId!=excersize.ExcersizeId)}
        resList.addAll(secondGroupExs)
        //Add excersizes simply from current group
        val simpleGroupMatchExs = source.filter {x->((x.Group==excersize.Group)||(x.Group==""))
                &&(x.ExcersizeId!=excersize.ExcersizeId)}
        resList.addAll(simpleGroupMatchExs)
        resList = resList.distinctBy { it.ExcersizeId }.toMutableList()

        return resList
    }
}