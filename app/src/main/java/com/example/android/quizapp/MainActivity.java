package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int correct = 0;
    int wrong = 0;
    private EditText edit_text;
    private EditText njoi;
    private RadioGroup radio_grp;
    private CheckBox senegal, egypt, nigeria, brazil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio_grp = (RadioGroup) findViewById(R.id.radio_grp);
        njoi = (EditText) findViewById(R.id.njoi);
        edit_text = (EditText) findViewById(R.id.edit_text);
        senegal = (CheckBox) findViewById(R.id.senegal);
        egypt = (CheckBox) findViewById(R.id.egypt);
        nigeria = (CheckBox) findViewById(R.id.nigeria);
        brazil = (CheckBox) findViewById(R.id.brazil);
    }

    public void sub(View view){
        String answer = edit_text.getText().toString().toLowerCase();
        String correctAnswer = getString(R.string.answer);
            if (correctAnswer.equals(answer)){
                Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_LONG).show();
                correct++;
            }
                else{
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_LONG).show();
                }

        final RadioGroup radio_grp = (RadioGroup) findViewById(R.id.radio_grp);
        radio_grp.setOnCheckedChangeListener (new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.croatia: {
                        Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    }
                    break;
                    case R.id.nigeria: {
                        Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    }
                    break;
                    case R.id.iceland: {
                        Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    }
                    break;
                    case R.id.argentina: {
                        Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                        correct++;
                    }
                    break;
                }}
            }
         );

            if(senegal.isChecked() && egypt.isChecked() && nigeria.isChecked() ){
                Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                correct++;
            }else{
                Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
            }

    }
}
