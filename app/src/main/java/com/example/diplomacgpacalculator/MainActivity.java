package com.example.diplomacgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText first,second,three,four,five,six,seven,eight;
    Calculation calculation=new Calculation();
    TextView result;
    Button calculateBtn,resetbtn;

    TextWatcher textWatcher=null;
    //int float_s, def=4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button finding
        calculateBtn=findViewById(R.id.calculateButtonId);
        resetbtn=findViewById(R.id.resetButtonId);

        //textViewFinding
        result=findViewById(R.id.resultTextViewId);
        //editText finding
        first=findViewById(R.id.firstSemesterEditTextId);
        second=findViewById(R.id.secondSemesterEditTextId);
        three=findViewById(R.id.thirdSemesterEditTextId);
        four=findViewById(R.id.fourthSemesterEditTextId);
        five=findViewById(R.id.fifthSemesterEditTextId);
        six=findViewById(R.id.sixthSemesterEditTextId);
        seven=findViewById(R.id.seventhSemesterEditTextId);
        eight=findViewById(R.id.eighthSemesterEditTextId);


        // textWatcher
        textWatcher=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

//                if(second.length()>0){
//                    Toast.makeText(MainActivity.this, " wow", Toast.LENGTH_SHORT).show();
//                    String st=second.getText().toString();
//                    Float n=Float.parseFloat(st);
//                    if (n>4){
//                        second.setText("4");
//                    }
//                    else{
//                        Toast.makeText(MainActivity.this, "zero", Toast.LENGTH_SHORT).show();
//                    }
//
//                }
//                else {
//                    second.setText("2nd Semester GPA");
//                }

            }

            @Override
            public void afterTextChanged(Editable s){

            }
        };

        second.addTextChangedListener(textWatcher);

        //set button onclickListener
        calculateBtn.setOnClickListener(this);
        resetbtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.calculateButtonId){

            if(first.length()<1){

                Toast.makeText(MainActivity.this, "Please input first semester GPA", Toast.LENGTH_SHORT).show();
            }

            else if(second.length()<1){

                Toast.makeText(MainActivity.this, "Please input second semester GPA", Toast.LENGTH_SHORT).show();
            }
            else if(three.length()<1){

                Toast.makeText(MainActivity.this, "Please input three semester GPA", Toast.LENGTH_SHORT).show();
            }else if(four.length()<1){

                Toast.makeText(MainActivity.this, "Please input four semester GPA", Toast.LENGTH_SHORT).show();
            }else if(five.length()<1){

                Toast.makeText(MainActivity.this, "Please input five semester GPA", Toast.LENGTH_SHORT).show();
            }else if(six.length()<1){

                Toast.makeText(MainActivity.this, "Please input six semester GPA", Toast.LENGTH_SHORT).show();
            }else if(seven.length()<1){

                Toast.makeText(MainActivity.this, "Please input seven semester GPA", Toast.LENGTH_SHORT).show();
            }else if(eight.length()<1){

                Toast.makeText(MainActivity.this, "Please input eight semester GPA", Toast.LENGTH_SHORT).show();
            }

            else{
                float float_first = Float.parseFloat(first.getText().toString());
                float float_second = Float.parseFloat(second.getText().toString());
                float float_three = Float.parseFloat(three.getText().toString());
                float float_four = Float.parseFloat(four.getText().toString());
                float float_five = Float.parseFloat(five.getText().toString());
                float float_six = Float.parseFloat(six.getText().toString());
                float float_seven = Float.parseFloat(seven.getText().toString());
                float float_eight = Float.parseFloat(eight.getText().toString());



                float total_cgpa=calculation.reasult(float_first,float_second,float_three, float_four,float_five,float_six,float_seven,float_eight);

                //decimal number limit set
               String Final_Cgpa= String.format("%.3g%n", total_cgpa);

               result.setText(String.valueOf(Final_Cgpa));
            }

        }
        if(v.getId()==R.id.resetButtonId){

            first.setText("");
            second.setText("");
            three.setText("");
            four.setText("");
            five.setText("");
            six.setText("");
            seven.setText("");
            eight.setText("");
        }



    }
}
