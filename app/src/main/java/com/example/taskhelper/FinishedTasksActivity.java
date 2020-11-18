package com.example.taskhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinishedTasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished_tasks);


        Button btnUnfinishedTasks = (Button)findViewById(R.id.btnUnfinishedTasks);

        btnUnfinishedTasks.setOnClickListener( new Button.OnClickListener() {
                                                 public void onClick(View v) {
                                                     startActivity(new Intent(FinishedTasksActivity.this, UnfinishedTasksActivity.class));
                                                 }

                                             }
        );

    }
}