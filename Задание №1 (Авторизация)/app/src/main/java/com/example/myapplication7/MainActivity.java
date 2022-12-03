package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int temp;
        String[] logins = {"admin", "admin1"};
        String[] passwds = {"1111", "2222"};

        final EditText login = (EditText)findViewById(R.id.login);
        final EditText passwd = (EditText)findViewById(R.id.passwd);
        final TextView result = (TextView)findViewById(R.id.result);
        final Button b = (Button)findViewById(R.id.getResult);

        b.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            public void onClick(View v) {
                String log = login.getText().toString();
                String pass = passwd.getText().toString();
                for (int i = 0; i < logins.length; i++) {
                    if (logins[i].equals(log) && passwds[i].equals(pass)) {
                        result.setText("Верно");
                        result.setTextColor(R.color.green);
                        break;
                    }
                    else {
                        result.setText("Вы ошиблись в логине или пароле");
                        result.setTextColor(R.color.red);
                        login.setText("");
                        passwd.setText("");
                    }
                }
            }
        });
    }
}