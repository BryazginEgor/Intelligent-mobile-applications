package ru.mirea.bryazgin.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewActivity(View view) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Брязгин Егор Игоревич");
        startActivity(Intent.createChooser(shareIntent, "Брязгин Егор Игоревич"));

        //Uri address = Uri.parse("https://www.mirea.ru/");
        //Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
        // startActivity(openLinkIntent);
    }
}