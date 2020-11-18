package com.example.taskhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class UnfinishedTasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unfinished_tasks);


        Button btnFinishedTasks = (Button)findViewById(R.id.btnFinishedTasks);
        FloatingActionButton btnAddTask = (FloatingActionButton)findViewById(R.id.btnAddTask);

        btnFinishedTasks.setOnClickListener( new Button.OnClickListener() {
                                                 public void onClick(View v) {
                                                     startActivity(new Intent(UnfinishedTasksActivity.this, FinishedTasksActivity.class));
                                                 }

                                             }
        );

        btnAddTask.setOnClickListener( new FloatingActionButton.OnClickListener() {
                                                 public void onClick(View v) {
                                                     startActivity(new Intent(UnfinishedTasksActivity.this, AddFormActivity.class));
                                                 }

                                             }
        );
    }




}