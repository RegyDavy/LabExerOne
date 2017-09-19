package com.reginand.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    EditText Q1;
    EditText Q2;
    EditText SW;
    EditText LABEXER;
    EditText MajEx;

    Double ave;
    Double fin;
    Button Compute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Q1 = (EditText) findViewById(R.id.Q1);
        Q2 = (EditText) findViewById(R.id.Q2);
        SW = (EditText) findViewById(R.id.SW);
        LABEXER = (EditText) findViewById(R.id.LABEXER);
        MajEx = (EditText) findViewById(R.id.MajEx);
        Compute = (Button) findViewById(R.id.Compute);


    }
        public void gradecalc (View view)
        {
            Double quiz1 = Double.parseDouble(Q1.getText().toString());
            Double quiz2 = Double.parseDouble(Q2.getText().toString());
            Double sw = Double.parseDouble(SW.getText().toString());
            Double lab = Double.parseDouble(LABEXER.getText().toString());
            Double me = Double.parseDouble(MajEx.getText().toString());

            ave = (quiz1 * .1) + (quiz2 * .1) + (sw * .1) +
                    (lab * .4) + (me * .3);

            if (ave < 60) {
                fin = 5.0;
            } else if (ave >= 60 && fin < 66) {
                fin = 3.0;
            } else if (ave >= 66 && fin < 71) {
                fin = 2.75;
            } else if (ave >= 71 && fin < 76) {
                fin = 2.5;
            } else if (ave >= 76 && fin < 81) {
                fin = 2.25;
            } else if (ave >= 81 && fin < 86) {
                fin = 2.0;
            } else if (ave >= 86 && fin < 91) {
                fin = 1.75;
            } else if (ave >= 91 && fin < 93) {
                fin = 1.5;
            } else if (ave >= 93 && fin < 95) {
                fin = 1.25;
            } else if (ave >= 95 && fin <= 100) {
                fin = 1.0;
            } else {
                fin = 0.0;
            }

            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("raGrade", ave.toString());
            intent.putExtra("finalGrade", fin.toString());
            startActivity(intent);
        }


}
