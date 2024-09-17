package com.example.bt3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView bt1= findViewById(R.id.text_signup);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_activity.this,register_activity.class));
            }
        });
        EditText user_name = findViewById(R.id.edt_userN_login);
        Button bt_lg = findViewById(R.id.bt_login);

        EditText passw_word = findViewById(R.id.edt_pass_login);
        bt_lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edt_userName = user_name.getText().toString().trim();
                String edt_pass = passw_word.getText().toString().trim();
                if(!edt_userName.isEmpty() && !edt_pass.isEmpty()){
                    Toast.makeText(Login_activity.this, "Xin chao ban co tai khoan: "+edt_userName, Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Login_activity.this,"Chua nhap du thong tin! Xin moi nhap",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}