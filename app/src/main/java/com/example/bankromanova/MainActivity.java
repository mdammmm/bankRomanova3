package com.example.bankromanova;

import static android.app.PendingIntent.getActivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button, button2;
    ImageButton button3;
    Dialog dialog;
    CardView card;

    TextView txt1, txt2;
    EditText password, username;
    Button vhod, vyhod;



    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button1);
        button2 = findViewById(R.id.btnBanks);
        button3 = findViewById(R.id.btnCurrency);
        dialog = new Dialog(MainActivity.this);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                                          showDialog();
                                      }
        }
        );

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                go_Banks();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_currency();
            }
        });


    }

    private void showDialog() {
        dialog.setContentView(R.layout.dialod_activity);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true);


        txt1 = findViewById(R.id.textView2);
        txt2 = findViewById(R.id.textView3);

        password = findViewById(R.id.editTextTextPassword);
        username = findViewById(R.id.editTextText);



        vyhod = findViewById(R.id.btnOtmena);
        vhod = findViewById(R.id.btnDob);






        dialog.show();

    }


    private void go_Banks() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    private void go_currency() {
        Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(intent2);
    }

    public void login() {
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
            Toast.makeText(getApplicationContext(), "Вход выполнен!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(), "Неправильный пароль!", Toast.LENGTH_SHORT).show();
        }

    }
}