package com.myapplicationdev.android.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = findViewById(R.id.button1);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

            //Get the RadioGroup object
                RadioGroup rg = findViewById(R.id.radioGroup1);

                //Get the Id of the selected radio button in the RadioGroup
                int selectedButtonID = rg.getCheckedRadioButtonId();

                //Get the radio button from the id we had gotton above
                RadioButton rb = findViewById(selectedButtonID);

                //Show a toast that displays the text on the selected radio buttons
                Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_LONG).show();


            }
        });

    }
}
