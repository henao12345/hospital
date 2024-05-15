package com.example.hospital;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    private  boolean contrasenaShowing =false
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        final EditText nombredeusuarioET = findViewById(R.id.nombredeusuarioET);
        final EditText contrasenaET = findViewById(R.id.contrasenaET);
        final ImageView passwordIcon = findViewById(R.id.passwordIcon);
        final EditText ingresaBtn = findViewById(R.id.ingresaBtn);

        passwordIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }



            }
        });
    }
}
