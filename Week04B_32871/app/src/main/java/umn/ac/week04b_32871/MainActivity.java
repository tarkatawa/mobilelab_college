package umn.ac.week04b_32871;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPindahKeHal1, btnPindahKeHal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindahKeHal1 = findViewById(R.id.main_button_change_1);
        btnPindahKeHal2 = findViewById(R.id.main_button_change_2);

        btnPindahKeHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent1);
            }
        });

        btnPindahKeHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent2);
            }
        });

    }
}