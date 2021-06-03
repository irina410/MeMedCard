package com.project.mymedcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.button);
        TextView name = (TextView) findViewById(R.id.name);
        TextView lastname = (TextView) findViewById(R.id.lastname);
        TextView fathername = (TextView) findViewById(R.id.fathername);
        TextView bloodType = (TextView) findViewById(R.id.blood_type);
        TextView dateOfB = (TextView) findViewById(R.id.Date_of_Birth);
        TextView number = (TextView) findViewById(R.id.insurance_policy_number);
        TextView dis = (TextView) findViewById(R.id.textViewdiseases);
        TextView textViewphone = (TextView) findViewById(R.id.textViewnumber);
        TextView textViewallergicreactions = (TextView) findViewById(R.id.textViewallergicreactions);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityProfile.class);
                startActivity(intent);

            }
        });

        SharedPreferences preferences = getSharedPreferences("default", MODE_PRIVATE);

        String userName = preferences.getString("ed_name", " ");
        name.setText(userName);
        String userLastName = preferences.getString("ed_lastname", " ");
        lastname.setText(userLastName);
        String userFatherName = preferences.getString("ed_fathername", " ");
        fathername.setText(userFatherName);
        String userbloodtype = preferences.getString("blood_type", "");
        bloodType.setText(userbloodtype);
        String userDateOfBirth = preferences.getString("date", "");
        dateOfB.setText(userDateOfBirth);
        String usernumber = preferences.getString("number", "");
        number.setText(usernumber);
        String userdiseases = preferences.getString("diseases", "");
        dis.setText(userdiseases);
        String phone = preferences.getString("phone", "");
        textViewphone.setText(phone);
        String allerg = preferences.getString("allerg", "");
        textViewallergicreactions.setText("аллергические реакции "+allerg);


//
//        final TextView name = (TextView)findViewById(R.id.name);
//        final EditText editTextName = (EditText)findViewById(R.id.editTextTextPersonName);
//        name.setText(editTextName.getText().toString());

    }
}