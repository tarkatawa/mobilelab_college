package umn.ac.uts_32871;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button menujuProfil, menujuLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menujuProfil = findViewById(R.id.keProfil);
        menujuLogin = findViewById(R.id.keLogin);
        menujuProfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switchProfile();
            }
        });
        menujuLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switchLogin();
            }
        });
    }

    private void switchProfile(){
        Intent intent = new Intent(this, Profil.class);
        startActivity(intent);
    }

    private void switchLogin(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}