package umn.ac.uts_32871;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import static umn.ac.uts_32871.Login.udhLogin;

public class Profil extends AppCompatActivity {
    private Button tombolBalik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil_attar);

        tombolBalik = findViewById(R.id.keHome);
        tombolBalik.setOnClickListener(v -> {
            if(udhLogin == false){
                backProfile();
            }
            else if(udhLogin == true){
                backSongs();
            }

        });
    }
    private void backProfile(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void backSongs(){
        Intent intent = new Intent(this, LaguLagu.class);
        startActivity(intent);
    }

}