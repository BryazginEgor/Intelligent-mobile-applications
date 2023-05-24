package ru.mirea.bryazgin.lesson_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import ru.mirea.bryazgin.lesson_6.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    SharedPreferences sharedPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        sharedPref = getSharedPreferences("mirea_settings", Context.MODE_PRIVATE);


        binding.Group.setText(sharedPref.getString("GROUP", "BSBO-06-21"));
        binding.Film.setText(sharedPref.getString("Film", "unknown"));
        binding.Number.setText(sharedPref.getString("Number", String.valueOf(1)));
    }

    public void buttonOnClick(View view){
        sharedPref = getSharedPreferences("mirea_settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString("GROUP", String.valueOf(binding.Group.getText()));
        editor.putString("Film", String.valueOf(binding.Film.getText()));
        editor.putString("Number", String.valueOf(binding.Number.getText()));



        editor.apply();


    }
}