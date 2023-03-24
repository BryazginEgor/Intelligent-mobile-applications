package ru.mirea.bryazgin.toastapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText edMyName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edMyName = findViewById(R.id.editTextTextPersonName);
    }

    public void onClickNewToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "СТУДЕНТ No 1 ГРУППА БСБО-06-21 Количество символов - " +
                        edMyName.getText().length(),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}