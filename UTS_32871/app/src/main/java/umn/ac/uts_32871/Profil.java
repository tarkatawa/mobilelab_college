package umn.ac.uts_32871;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profil extends AppCompatActivity {
    private Button tombolBalik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil_attar);

        tombolBalik = findViewById(R.id.keHome);
        tombolBalik.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                backProfile();
            }
        });
    }
    private void backProfile(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}