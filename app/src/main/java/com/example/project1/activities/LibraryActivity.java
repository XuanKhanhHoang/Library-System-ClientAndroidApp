package com.example.project1.activities;

import static androidx.navigation.Navigation.findNavController;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.example.project1.R;
import com.example.project1.databinding.ActivityLibraryBinding;

public class LibraryActivity extends AppCompatActivity {
    private ActivityLibraryBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding =ActivityLibraryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NavController navController = Navigation.findNavController(this, R.id.libraryfragment);
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController);


    }
}