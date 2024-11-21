package com.example.zadanie6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Haslo1;
    private EditText Haslo2;
    private TextView Komunikat;
    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Email = findViewById(R.id.email);
        Haslo1 = findViewById(R.id.haslo1);
        Haslo2 = findViewById(R.id.haslo2);
        Komunikat = findViewById(R.id.komunikat);
        Submit = findViewById(R.id.submit);



        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Email.getText().toString().trim();
                String haslo1 = Haslo1.getText().toString().trim();
                String haslo2 = Haslo2.getText().toString().trim();


                if (email.contains("@")) {
                    if (haslo1.isEmpty() || haslo2.isEmpty()) {
                        Komunikat.setText("Hasła nie mogą być puste");
                    } else if (haslo1.equals(haslo2)) {
                        Komunikat.setText("Witaj " + email);
                    } else {
                        Komunikat.setText("Hasła się różnią");
                    }
                } else {
                    Komunikat.setText("Nieprawidłowy adres e-mail");
                }


            }

        });
    }
}
