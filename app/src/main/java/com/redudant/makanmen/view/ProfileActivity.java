package com.redudant.makanmen.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.redudant.makanmen.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setTitle("Profile");
    }
}
