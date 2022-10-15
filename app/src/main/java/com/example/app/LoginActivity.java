package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

     Button entrar;
     EditText usuario;
     EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrar = findViewById(R.id.button);
        usuario = findViewById(R.id.ed_User);
        senha = findViewById(R.id.ed_Senha);

        usuario.setText("admin");
        senha.setText("123");

        entrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == entrar.getId())
        {
            if(usuario.getText().toString().equals("admin")
            && senha.getText().toString().equals("123")){
                Intent i = new Intent(getApplicationContext(), Recycle_Activity.class);
                startActivity(i);
            }else{
                Toast.makeText(getApplicationContext(),
                         "Usuário ou senha inválido", Toast.LENGTH_LONG).show();
            }
        }
    }
}