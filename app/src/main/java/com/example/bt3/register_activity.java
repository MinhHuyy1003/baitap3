package com.example.bt3;

import android.content.Intent;
import android.os.Bundle;
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

public class register_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView bt1= findViewById(R.id.tv_haveAcc);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(register_activity.this,Login_activity.class));
            }
        });

        EditText tv_fullname = findViewById(R.id.edt_fullname);
        EditText tv_gmail = findViewById(R.id.edt_Gmail);
        EditText tv_username = findViewById(R.id.edt_UserName);
        EditText tv_pass = findViewById(R.id.edt_passWord);
        EditText tv_confirmPass = findViewById(R.id.edt_confirm_pass);
        Button bt_register= findViewById(R.id.bt_register);

        bt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edt_fullname = tv_fullname.getText().toString().trim();
                String edt_gmail = tv_gmail.getText().toString().trim();
                String edt_username = tv_username.getText().toString().trim();
                String edt_pass = tv_pass.getText().toString().trim();
                String edt_confirmPass = tv_confirmPass.getText().toString().trim();
                if(!edt_fullname.isEmpty() && !edt_gmail.isEmpty() && !edt_username.isEmpty() && !edt_pass.isEmpty() && !edt_confirmPass.isEmpty()){
                    Toast.makeText(register_activity.this,"dang ki thanh cong xin moi dang nhap!",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(register_activity.this,Login_activity.class));
                }
                else{
                    Toast.makeText(register_activity.this,"Ban chua nhap du thong tin!",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}