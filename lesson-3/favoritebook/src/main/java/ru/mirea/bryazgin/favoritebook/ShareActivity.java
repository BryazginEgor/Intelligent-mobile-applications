package ru.mirea.bryazgin.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
    public EditText Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = findViewById(R.id.textViewBook);
            String university = extras.getString(MainActivity.KEY);
            ageView.setText(String.format("Мой любимая книга: %s", university));
        }
    }

    public void onClick(View view) {
        Text = findViewById(R.id.editTextPersonName);
        String book = String.valueOf(Text.getText());
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, book);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}