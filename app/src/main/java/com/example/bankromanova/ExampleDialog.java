package com.example.bankromanova;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentManager;

public class ExampleDialog extends Dialog {
    EditText password, username;
    Button vhod, vyhod;

    public ExampleDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.dialod_activity);

        password = findViewById(R.id.editTextTextPassword);
        username = findViewById(R.id.editTextText);


        vyhod = findViewById(R.id.btnOtmena);
        vhod = findViewById(R.id.btnDob);
        vhod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
    }

    public void Login() {

        // Если введенные логин и пароль будут словом "admin",
        // показываем Toast сообщение об успешном входе:
        if (username.getText().toString().equals("admin") &&
                password.getText().toString().equals("admin")) {
            Toast.makeText(this.getContext(), "Вход выполнен!", Toast.LENGTH_SHORT).show();

            // Выполняем переход на другой экран:

        }
    }
}
