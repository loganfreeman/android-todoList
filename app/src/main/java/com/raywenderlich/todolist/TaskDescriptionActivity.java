package com.raywenderlich.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TaskDescriptionActivity extends AppCompatActivity {

    public static final String EXTRA_TASK_DESCRIPTION = "task";

    private EditText mDescriptionView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_description);

        mDescriptionView = (EditText) findViewById(R.id.descriptionText);
    }

    public void doneClicked(View view) {
// 1
        String taskDescription = mDescriptionView.getText().toString();

        if (!taskDescription.isEmpty()) {
            // 2
            Intent result = new Intent();
            result.putExtra(EXTRA_TASK_DESCRIPTION, taskDescription);
            setResult(RESULT_OK, result);
        } else {
            // 3
            setResult(RESULT_CANCELED);
        }
// 4
        finish();
    }
}
