package com.example.gymhelper.adapters

import android.content.Context
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.ImageButton
import android.widget.TextView
import com.example.gymhelper.R
import com.example.gymhelper.db.Excersize
import com.example.gymhelper.db.TrainingProgramDay
import com.example.gymhelper.model.TrainingDay

class ProgramEditExpandableListAdapter internal constructor(val context: Context, val groups: List<TrainingProgramDay> ,
    val trainingDays:List<TrainingDay>, val dayLayout: Int, val excersizeLayout: Int, val trainingDayDeletingCallback: (trainingDayId: Long)->Unit,
    val trainingDayEditCallback: (trainingDayId: Long, groupPosition: Int)->Unit): BaseExpandableListAdapter() {
    override fun getGroup(groupPosition: Int): Any {
        return groups.get(groupPosition)
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {

        var convertView = convertView
        val listTitle = getGroup(groupPosition) as TrainingProgramDay
        if (convertView == null) {
            val layoutInflater = this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = layoutInflater.inflate(dayLayout, null)
        }
        val expListView = parent as ExpandableListView
        expListView.expandGroup(groupPosition)

        val dayTv= convertView!!.findViewById<TextView>(R.id.dayName)
        dayTv.setTypeface(null, Typeface.BOLD)
        dayTv.text = listTitle.DayName

        val deleteTrainingDayIb = convertView!!.findViewById<ImageButton>(R.id.deleteDayIb)
        deleteTrainingDayIb.setOnClickListener {
            trainingDayDeletingCallback(groups.get(groupPosition).TrainingProgramDayId)
        }

        val editTrainingDayIb = convertView!!.findViewById<ImageButton>(R.id.editDayIb)
        editTrainingDayIb.setOnClickListener {
            trainingDayEditCallback(groups.get(groupPosition).TrainingProgramDayId, groupPosition)
        }

        return convertView
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return trainingDays.get(groupPosition).Excercizes.size
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return trainingDays.get(groupPosition).Excercizes.get(childPosition)
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView = convertView
        val child = getChild(groupPosition, childPosition) as Excersize
        if (convertView == null) {
            val layoutInflater = this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = layoutInflater.inflate(excersizeLayout, null)
        }

        val exNameTv = convertView!!.findViewById<TextView>(R.id.programExpandableListExcercizeName)
        exNameTv.text = child.Name
        val exGroupTv = convertView!!.findViewById<TextView>(R.id.programExpandableListExcercizeGroup)
        exGroupTv.text = child.Group

        return convertView
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getGroupCount(): Int {
        return groups.size
    }
}