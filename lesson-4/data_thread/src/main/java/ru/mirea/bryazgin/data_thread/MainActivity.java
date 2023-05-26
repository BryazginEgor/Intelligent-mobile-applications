package ru.mirea.bryazgin.data_thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.concurrent.TimeUnit;

import ru.mirea.bryazgin.data_thread.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding	=	ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.textView.setText("runOnUIThread — запускает указанное действие в потоке пользовательского интерфейса. " +
                "Если текущий поток является потоком пользовательского интерфейса, то действие выполняется немедленно. " +
                "Если текущий поток не является потоком пользовательского интерфейса, действие отправляется в очередь событий потока пользовательского интерфейса. " +
                "post — вызывает добавление Runnable в очередь сообщений. Runnable будет запущен в потоке пользовательского интерфейса. " +
                "postDelayed — вызывает добавление Runnable в очередь сообщений для запуска по истечении указанного времени. " +
                "Runnable будет запущен в потоке пользовательского интерфейса.");

        final Runnable runn1 = new Runnable() {
            public void run() {
                binding.tvInfo.setText("runn 1");
            }
        };
        final Runnable runn2 = new Runnable() {
            public void run() {
                binding.tvInfo.setText("runn 2");
            }
        };
        final Runnable runn3 = new Runnable() {
            public void run() {
                binding.tvInfo.setText("runn 3");
            }
        };
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(2);
                    runOnUiThread(runn1);
                    TimeUnit.SECONDS.sleep(1);
                    binding.tvInfo.postDelayed(runn3, 2000);
                    binding.tvInfo.post(runn2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }
}