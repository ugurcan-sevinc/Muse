package com.ugrcaan.muse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ugrcaan.muse.adapter.TaskAdapter
import com.ugrcaan.muse.databinding.ActivityMainBinding
import com.ugrcaan.muse.model.Task

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val test : List<Task> = emptyList()

        val tasks = listOf(
            Task(1, "Task 1", "Description 1", "2022-03-15", "10:00", arrayListOf()),
            Task(2, "Task 2", "Description 2", "2022-03-16", "14:00", arrayListOf()),
            Task(3, "Task 3", "Description 3", "2022-03-16", "18:00", arrayListOf())

        )

        binding.labelUsersName.text = "Uğurcan Sevinç"
        binding.labelWelcome.text = "Hello, Good Afternoon"

        val adapter = TaskAdapter(tasks)

        val recyclerView = binding.taskRecycler
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter



    }
}