package com.example.todoapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.R.id.btnAddTodo
import com.example.todoapp.R.id.btnDeleteTodo
import com.example.todoapp.R.id.etTodoTitle
import com.example.todoapp.R.id.rvTodoItems

class MainActivity : AppCompatActivity() {

    private lateinit var todoAdapter : TodoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        todoAdapter = TodoAdapter(mutableListOf())
        findViewById<RecyclerView>(rvTodoItems).adapter = todoAdapter
        findViewById<RecyclerView>(rvTodoItems).layoutManager = LinearLayoutManager(this)

        findViewById<Button>(btnAddTodo).setOnClickListener {
            val todoTitle = findViewById<EditText>(etTodoTitle).text.toString()
            if(todoTitle.isNotEmpty()){
                val todo = Todo(todoTitle)
                todoAdapter.addTodo(todo)
                findViewById<EditText>(etTodoTitle).text.clear()
            }
        }

        findViewById<Button>(btnDeleteTodo).setOnClickListener {
            todoAdapter.deleteDoneTodos()
        }
    }
}