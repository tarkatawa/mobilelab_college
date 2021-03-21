package umn.ac.uts_32871;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    private Button tombolLogin;
    EditText txtUsername, txtPassword;
    static boolean udhLogin;
    TextView notis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        notis = (TextView) this.findViewById(R.id.notis);
        txtUsername = (EditText) this.findViewById(R.id.txtUsername);
        txtPassword = (EditText) this.findViewById(R.id.txtPassword);
        tombolLogin = findViewById(R.id.btnLogin);
        tombolLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(txtUsername.getText().toString().matches("uasmobile") && txtPassword.getText().toString().matches("uasmobilegenap")){
                    masuk();
                }
                else{
                    notis.setText(String.valueOf("Username atau Password salah."));
                }
            }
        });
    }
    private void masuk(){
        Intent intent = new Intent(this, LaguLagu.class);
        startActivity(intent);
        udhLogin = true;
    }
}
