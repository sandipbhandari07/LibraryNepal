package library.files.librarynepal;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import library.files.librarynepal.R;
import library.files.librarynepal.SignIn_Activity;
import library.files.librarynepal.signUp_Activity;

public class MainActivity2 extends AppCompatActivity {

        Button login;
        Button signup;

        TextView skp;

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            requestWindowFeature(Window.FEATURE_NO_TITLE);
            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getSupportActionBar();



            setContentView(R.layout.activity_main2);
            login = findViewById(R.id.login);
            signup = findViewById(R.id.Register);
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity2.this, SignIn_Activity.class);
                    startActivity(intent);

                }
            });

            signup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity2.this, "Register Here", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity2.this, signUp_Activity.class);
                    startActivity(intent);
                }
            });

            skp = findViewById(R.id.skip);
            skp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity2.this, "Welcome to Homepage", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity2.this, introactivity.class);
                    startActivity(intent);

                }
            });


        }
    }


