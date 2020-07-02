package com.example.gymhelper.adapters

import android.content.Context
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.CheckBox
import android.widget.ExpandableListView
import android.widget.TextView
import com.example.gymhelper.R
import com.example.gymhelper.db.Excersize
import com.example.gymhelper.model.ExcersizeGroup

class ExcersizesListExpandableListAdapter internal constructor(
    val context: Context,
    val groups: List<String>,
    val groupedExcersizes: List<ExcersizeGroup>,
    val groupLayout:Int,
    val excersizesLayout: Int,
    val curDayExcersizes: List<Excersize>,
    val excersizeCheckingCallback: (exId: Long, selected: Boolean)->Unit
) : BaseExpandableListAdapter() {
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
        val listTitle = getGroup(groupPosition) as String
        if (convertView == null) {
            val layoutInflater
                    = this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = layoutInflater.inflate(groupLayout, null)
        }

        val groups = curDayExcersizes.map { it.Group }
        if (groups.contains(listTitle)) {
            val expListView = parent as ExpandableListView
            expListView.expandGroup(groupPosition)
        }

        val dayTv= convertView!!.findViewById<TextView>(R.id.groupName)
        dayTv.setTypeface(null, Typeface.BOLD)
        dayTv.text = listTitle
        return convertView
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return groupedExcersizes.get(groupPosition).excersizes.size
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return groupedExcersizes.get(groupPosition).excersizes.get(childPosition)
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
    ): View? {
        var convertView = convertView
        val child = getChild(groupPosition, childPosition) as Excersize
        if (convertView == null) {
            val layoutInflater
                    = this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = layoutInflater.inflate(excersizesLayout, null)
        }

        val exNameTv = convertView?.findViewById<TextView>(R.id.exNameTv)
        exNameTv?.text = child.Name

        val subgroupTv = convertView?.findViewById<TextView>(R.id.exSubGroupTv)
        subgroupTv?.text = child.Group

        val levelTv = convertView?.findViewById<TextView>(R.id.exLevelTv)
        levelTv?.text = child.Level

        val inCurDayCb = convertView?.findViewById<CheckBox>(R.id.inCurDayCb)

        inCurDayCb?.isChecked = false

        val exIds = curDayExcersizes.map { it.ExcersizeId }

        if (exIds.contains(child.ExcersizeId))
            inCurDayCb?.isChecked = true

        inCurDayCb?.setOnClickListener {
            excersizeCheckingCallback(child.ExcersizeId, inCurDayCb.isChecked)
        }

        return convertView
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getGroupCount(): Int {
        return groups.size
    }

}