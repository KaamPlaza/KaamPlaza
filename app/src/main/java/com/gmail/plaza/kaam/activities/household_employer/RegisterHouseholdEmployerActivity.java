package com.gmail.plaza.kaam.activities.household_employer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.gmail.plaza.kaam.R;

public class RegisterHouseholdEmployerActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_household_employer);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Register");
    }
}