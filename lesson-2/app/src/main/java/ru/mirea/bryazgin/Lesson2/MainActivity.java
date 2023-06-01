package ru.mirea.bryazgin.Lesson2;



import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
//1.Будет ли вызван метод «onCreate» после нажатия на кнопку «Home» и возврата в приложение?
//нет
//2.Изменится ли значение поля «EditText» после нажатия на кнопку «Home» и возврата в приложение?
//изменяется в процесссе на onPause(), но начальный и конечный результат - onResume()
//3.Изменится ли значение поля «EditText» после нажатия на кнопку «Back» и возврата в приложение?
//изменяется в процесссе на onPause(), но начальный и конечный результат - onResume()
public class MainActivity extends AppCompatActivity {

    private EditText btnMirea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMirea = findViewById(R.id.editTextTextPersonName);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
        btnMirea.setText("OnStart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
        Log.i(TAG, "onRestoreInstanceState()");
        btnMirea.setText("onRestoreInstanceState()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart()");
        btnMirea.setText("onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
        btnMirea.setText("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
        btnMirea.setText("onPause()");
    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
        Log.i(TAG, "onSaveInstanceState()");
        btnMirea.setText("onSaveInstanceState()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
        btnMirea.setText("onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
        btnMirea.setText("onDestroy()");
    }
}