package com.example.pc.appquanlidoibong;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.Toast;

public class ManHinhLoginActivity extends AppCompatActivity {
    EditText edtUser, edtPassword;
    Button btnDangKi, btnDangNhap, btnThoat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_login);
        addControls();
        addEvents();
    }



    private void addControls() {
        edtUser = findViewById(R.id.edtUser);
        edtPassword = findViewById(R.id.edtPassword);

        btnDangKi = findViewById(R.id.btnDangKi);
        btnDangNhap = findViewById(R.id.btnDangNhap);
        btnThoat = findViewById(R.id.btnThoat);

    }

    private void addEvents() {
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ManHinhLoginActivity.this, android.R.style.Theme_DeviceDefault_Dialog_Alert);
                builder.setTitle("Bạn có muốn thoát khỏi app không?");
                builder.setMessage("Bạn chọn: ");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        onBackPressed();

                    }
                });
                builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();

            }
        });

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtUser.getText().length() != 0 && edtPassword.getText().length() != 0){
                    if (edtUser.getText().toString().equals("admin") && edtPassword.getText().toString().equals("123")){
                        Toast.makeText(ManHinhLoginActivity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(ManHinhLoginActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}
