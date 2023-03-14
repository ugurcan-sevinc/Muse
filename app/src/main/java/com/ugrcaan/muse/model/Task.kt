package com.ugrcaan.muse.model

data class Task(
    val priority: Int,
    val header: String,
    val description: String,
    val date: String,
    val time: String,
    val list: ArrayList<Subtask>
)

