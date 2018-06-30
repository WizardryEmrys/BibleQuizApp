package com.example.android.biblequizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * This function displays the final score to the user using a toast
     */
    public void displayScore(View view) {

        int totalScore = 0;

        // Radiobutton 1A
        RadioButton radioButton1A = (RadioButton) findViewById(R.id.opt_1A);
        boolean hasChecked1A = radioButton1A.isChecked();

        // Radiobutton 1B
        RadioButton radioButton1B = (RadioButton) findViewById(R.id.opt_1B);
        boolean hasChecked1B = radioButton1B.isChecked();

        // Radiobutton 1C
        RadioButton radioButton1C = (RadioButton) findViewById(R.id.opt_1C);
        boolean hasChecked1C = radioButton1C.isChecked();

        // Radiobutton 1D
        RadioButton radioButton1D = (RadioButton) findViewById(R.id.opt_1D);
        boolean hasChecked1D = radioButton1D.isChecked();

        // Radiobutton 2A
        RadioButton radioButton2A = (RadioButton) findViewById(R.id.opt_2A);
        boolean hasChecked2A = radioButton2A.isChecked();

        // Radiobutton 2B
        RadioButton radioButton2B = (RadioButton) findViewById(R.id.opt_2B);
        boolean hasChecked2B = radioButton2B.isChecked();

        // Radiobutton 2C
        RadioButton radioButton2C = (RadioButton) findViewById(R.id.opt_2C);
        boolean hasChecked2C = radioButton2C.isChecked();

        // Radiobutton 2D
        RadioButton radioButton2D = (RadioButton) findViewById(R.id.opt_2D);
        boolean hasChecked2D = radioButton2D.isChecked();

        // Radiobutton 3A
        RadioButton radioButton3A = (RadioButton) findViewById(R.id.opt_3A);
        boolean hasChecked3A = radioButton3A.isChecked();

        // Radiobutton 3B
        RadioButton radioButton3B = (RadioButton) findViewById(R.id.opt_3B);
        boolean hasChecked3B = radioButton3B.isChecked();

        // Radiobutton 3C
        RadioButton radioButton3C = (RadioButton) findViewById(R.id.opt_3C);
        boolean hasChecked3C = radioButton3C.isChecked();

        // Radiobutton 3D
        RadioButton radioButton3D = (RadioButton) findViewById(R.id.opt_3D);
        boolean hasChecked3D = radioButton3D.isChecked();

        // Radiobutton 4A
        RadioButton radioButton4A = (RadioButton) findViewById(R.id.opt_4A);
        boolean hasChecked4A = radioButton4A.isChecked();

        // Radiobutton 4B
        RadioButton radioButton4B = (RadioButton) findViewById(R.id.opt_4B);
        boolean hasChecked4B = radioButton4B.isChecked();

        // Radiobutton 4C
        RadioButton radioButton4C = (RadioButton) findViewById(R.id.opt_4C);
        boolean hasChecked4C = radioButton4C.isChecked();

        // Radiobutton 4D
        RadioButton radioButton4D = (RadioButton) findViewById(R.id.opt_4D);
        boolean hasChecked4D = radioButton4D.isChecked();

        // Radiobutton 5A
        RadioButton radioButton5A = (RadioButton) findViewById(R.id.opt_5A);
        boolean hasChecked5A = radioButton5A.isChecked();

        // Radiobutton 5B
        RadioButton radioButton5B = (RadioButton) findViewById(R.id.opt_5B);
        boolean hasChecked5B = radioButton5B.isChecked();

        // Radiobutton 5C
        RadioButton radioButton5C = (RadioButton) findViewById(R.id.opt_5C);
        boolean hasChecked5C = radioButton5C.isChecked();

        // Radiobutton 5D
        RadioButton radioButton5D = (RadioButton) findViewById(R.id.opt_5D);
        boolean hasChecked5D = radioButton5D.isChecked();

        if (hasChecked1B) {
            totalScore += 1;
        }

        if (hasChecked2D) {
            totalScore += 1;
        }

        if (hasChecked3B) {
            totalScore += 1;
        }

        if (hasChecked4A) {
            totalScore += 1;
        }

        if (hasChecked5D) {
            totalScore += 1;
        }

        // store the username in a variable
        EditText nameField = (EditText) findViewById(R.id.user_name);
        String userName = nameField.getText().toString();

        // toast message displaying the user score
        Toast.makeText(this, userName + " you had " + totalScore + " correct", Toast.LENGTH_LONG).show();
    }
}