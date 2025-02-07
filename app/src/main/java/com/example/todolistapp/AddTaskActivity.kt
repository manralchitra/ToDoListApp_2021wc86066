package com.example.todolistapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AddTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)

        val taskEditText = findViewById<EditText>(R.id.taskEditText)
        val saveTaskButton = findViewById<Button>(R.id.saveTaskButton)

        saveTaskButton.setOnClickListener {
            val task = taskEditText.text.toString()
            if (task.isNotEmpty()) {
                val resultIntent = Intent().apply {
                    putExtra("task", task)
                }
                setResult(Activity.RESULT_OK, resultIntent)
                finish()
            }
        }
    }
}