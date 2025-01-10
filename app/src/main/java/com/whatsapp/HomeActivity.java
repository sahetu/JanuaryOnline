package com.whatsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    TextView username,password;
    //RadioButton male,female;
    RadioGroup gender;
    CheckBox cricket,hockey,chess,football;
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        username = findViewById(R.id.home_username);
        password = findViewById(R.id.home_password);

        /*username.setText(MainActivity.username.getText().toString());
        password.setText(MainActivity.password.getText().toString());*/

        Bundle bundle = getIntent().getExtras();
        username.setText(bundle.getString("USERNAME"));
        password.setText(bundle.getString("PASSWORD"));

        /*male = findViewById(R.id.home_male);
        female = findViewById(R.id.home_female);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, male.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, female.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });*/

        gender = findViewById(R.id.home_gender);
        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rb = findViewById(i);
                Toast.makeText(HomeActivity.this, rb.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        cricket = findViewById(R.id.home_cricket);
        hockey = findViewById(R.id.home_hockey);
        chess = findViewById(R.id.home_chess);
        football = findViewById(R.id.home_football);

        /*cricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cricket.isChecked()){

                }
            }
        });*/

        /*cricket.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(HomeActivity.this, cricket.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        chess.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(HomeActivity.this, chess.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        hockey.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(HomeActivity.this, hockey.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        football.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(HomeActivity.this, football.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });*/

        show = findViewById(R.id.show_hobby);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                if(cricket.isChecked()){
                    //Toast.makeText(HomeActivity.this, cricket.getText().toString(), Toast.LENGTH_SHORT).show();
                    sb.append(cricket.getText().toString()+"\n");
                }
                if(chess.isChecked()){
                    //Toast.makeText(HomeActivity.this, chess.getText().toString(), Toast.LENGTH_SHORT).show();
                    sb.append(chess.getText().toString()+"\n");
                }
                if(football.isChecked()){
                    //Toast.makeText(HomeActivity.this, football.getText().toString(), Toast.LENGTH_SHORT).show();
                    sb.append(football.getText().toString()+"\n");
                }
                if(hockey.isChecked()){
                    //Toast.makeText(HomeActivity.this, hockey.getText().toString(), Toast.LENGTH_SHORT).show();
                    sb.append(hockey.getText().toString()+"\n");
                }

                Toast.makeText(HomeActivity.this, sb.toString().trim(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}