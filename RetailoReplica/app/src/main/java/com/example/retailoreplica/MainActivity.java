package com.example.retailoreplica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.retailoreplica.databinding.ActivityLoginBinding;
import com.example.retailoreplica.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding A_Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(ActivityMainBinding.inflate(getLayoutInflater()).getRoot());
    }
}