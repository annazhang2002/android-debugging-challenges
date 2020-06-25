package com.codepath.debuggingchallenges.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;

import com.codepath.debuggingchallenges.R;

public class ToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool);

        // Sets the Toolbar to act as the ActionBar for this Activity window.
//         Make sure the toolbar exists in the activity and is not null
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }

        getSupportActionBar().setTitle("My toolbar!");


        TextView tvDescription = (TextView) findViewById(R.id.tvDescription);
        tvDescription.setText(R.string.hello);
    }
}
