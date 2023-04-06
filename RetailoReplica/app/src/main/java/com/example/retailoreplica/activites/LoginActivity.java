package com.example.retailoreplica.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.retailoreplica.R;
import com.example.retailoreplica.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding A_Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(ActivityLoginBinding.inflate(getLayoutInflater()).getRoot());

    }
}