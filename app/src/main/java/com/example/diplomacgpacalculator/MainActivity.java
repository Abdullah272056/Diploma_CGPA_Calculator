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

        //set button onclickListener
        calculateBtn.setOnClickListener(this);
        resetbtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.calculateButtonId){
            if(first.length()<1){
                first.setError("Enter a value");
            }
            else if(second.length()<1){
                second.setError("Enter a value");
            }
            else if(three.length()<1){
                three.setError("Enter a value");
            }else if(four.length()<1){
                four.setError("Enter a value");
            }else if(five.length()<1){
                five.setError("Enter a value");
            }else if(six.length()<1){
                six.setError("Enter a value");
            }else if(seven.length()<1){
                seven.setError("Enter a value");
            }else if(eight.length()<1){
                eight.setError("Enter a value");
            }
            else{

                if(Float.parseFloat(first.getText().toString())>4 || Float.parseFloat(first.getText().toString())<2){
                    first.setError("Enter a valid value");
                }
                else if(Float.parseFloat(second.getText().toString())>4 || Float.parseFloat(second.getText().toString())<2){
                    second.setError("Enter a valid value");
                }
                else if(Float.parseFloat(three.getText().toString())>4|| Float.parseFloat(three.getText().toString())<2){
                    three.setError("Enter a valid value");
                }else if(Float.parseFloat(four.getText().toString())>4|| Float.parseFloat(four.getText().toString())<2){
                    four.setError("Enter a valid value");
                }else if(Float.parseFloat(five.getText().toString())>4|| Float.parseFloat(five.getText().toString())<2){
                    five.setError("Enter a valid value");
                }else if(Float.parseFloat(six.getText().toString())>4|| Float.parseFloat(six.getText().toString())<2){
                    six.setError("Enter a valid value");
                }else if(Float.parseFloat(seven.getText().toString())>4|| Float.parseFloat(seven.getText().toString())<2){
                    seven.setError("Enter a valid value");
                }else if(Float.parseFloat(eight.getText().toString())>4|| Float.parseFloat(eight.getText().toString())<2){
                    eight.setError("Enter a valid value");
                }else {
                    float float_first = Float.parseFloat(first.getText().toString());
                    float float_second = Float.parseFloat(second.getText().toString());
                    float float_three = Float.parseFloat(three.getText().toString());
                    float float_four = Float.parseFloat(four.getText().toString());
                    float float_five = Float.parseFloat(five.getText().toString());
                    float float_six = Float.parseFloat(six.getText().toString());
                    float float_seven = Float.parseFloat(seven.getText().toString());
                    float float_eight = Float.parseFloat(eight.getText().toString());

                    String totalCgpaAndGrade=calculation.result(float_first,float_second,float_three, float_four,float_five,float_six,float_seven,float_eight);

                    //decimal number limit set
                   // String Final_Cgpa= String.format("%.3g%n", total_cgpa);

                    result.setText(totalCgpaAndGrade);
                }

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
