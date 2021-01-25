package com.example.diplomacgpacalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText first,second,three,four,five,six,seven,eight;
    Calculation calculation=new Calculation();
    TextView result;
    Button calculateBtn,resetbtn;
    String totalCgpaAndGrade;
    int themeValue=1;
    LinearLayout mainLinearLayout;

    String string_first,string_second,string_three,string_four,
            string_five,string_six,string_seven,string_eight;
    float float_first,float_second,float_three,float_four,
            float_five,float_six,float_seven,float_eight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button finding
        calculateBtn=findViewById(R.id.calculateButtonId);
        resetbtn=findViewById(R.id.resetButtonId);
        //layout finding
        mainLinearLayout=findViewById(R.id.mainLayoutId);
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

        string_first = first.getText().toString();
        string_second = second.getText().toString();
        string_three = three.getText().toString();
        string_four = four.getText().toString();
        string_five = five.getText().toString();
        string_six = six.getText().toString();
        string_seven = seven.getText().toString();
        string_eight = eight.getText().toString();

        //calculate button clicked
        if (v.getId()==R.id.calculateButtonId){
            if(TextUtils.isEmpty(string_first)){
                first.setError("Enter a value");
                first.requestFocus();
                return;
            }
            if(Float.parseFloat(string_first)>4 || Float.parseFloat(string_first)<2){
                first.setError("Should not greater than 2 and less than 4");
                first.requestFocus();
                return;
            }


             if(TextUtils.isEmpty(string_second)){
                second.setError("Enter a value");
                second.requestFocus();
                 return;
            }
            if(Float.parseFloat(string_second)>4 || Float.parseFloat(string_second)<2){
                second.setError("Should not greater than 2 and less than 4");
                second.requestFocus();
                return;
            }

             if(TextUtils.isEmpty(string_three)){
                three.setError("Enter a value");
                three.requestFocus();
                 return;
            }
            if(Float.parseFloat(string_three)>4|| Float.parseFloat(string_three)<2){
                three.setError("Should not greater than 2 and less than 4");
                three.requestFocus();
                return;
            }

            if(TextUtils.isEmpty(string_four)){
                four.setError("Enter a value");
                four.requestFocus();
                return;
            }
            if(Float.parseFloat(string_four)>4|| Float.parseFloat(string_four)<2){
                four.setError("Should not greater than 2 and less than 4");
                four.requestFocus();
                return;
            }
            if(TextUtils.isEmpty(string_five)){
                five.setError("Enter a value");
                five.requestFocus();
                return;
            }
            if(Float.parseFloat(string_five)>4|| Float.parseFloat(string_five)<2){
                five.setError("Should not greater than 2 and less than 4");
                five.requestFocus();
                return;
            }
            if(TextUtils.isEmpty(string_six)){
                six.setError("Enter a value");
                six.requestFocus();
                return;
            }
            if(Float.parseFloat(string_six)>4|| Float.parseFloat(string_six)<2){
                six.setError("Should not greater than 2 and less than 4");
                six.requestFocus();
                return;
            }
            if(TextUtils.isEmpty(string_seven)){
                seven.setError("Enter a value");
                seven.requestFocus();
                return;
            }
            if(Float.parseFloat(string_seven)>4|| Float.parseFloat(string_seven)<2){
                seven.setError("Should not greater than 2 and less than 4");
                seven.requestFocus();
                return;
            }
            if(TextUtils.isEmpty(string_eight)){
                eight.setError("Enter a value");
                eight.requestFocus();
                return;
            }
            if(Float.parseFloat(string_eight)>4|| Float.parseFloat(string_eight)<2){
                eight.setError("Should not greater than 2 and less than 4");
                eight.requestFocus();
                return;
            }
                     float_first = Float.parseFloat(string_first);
                     float_second = Float.parseFloat(string_second);
                     float_three = Float.parseFloat(string_three);
                     float_four = Float.parseFloat(string_four);
                     float_five = Float.parseFloat(string_five);
                     float_six = Float.parseFloat(string_six);
                     float_seven = Float.parseFloat(string_seven);
                     float_eight = Float.parseFloat(string_eight);

                    totalCgpaAndGrade=calculation.result(float_first,float_second,float_three,
                            float_four,float_five,float_six,float_seven,float_eight);

                    result.setText(totalCgpaAndGrade);


        }

        // resetButton Clicked
        if(v.getId()==R.id.resetButtonId){
            result.setText("");
            first.setText("");
            second.setText("");
            three.setText("");
            four.setText("");
            five.setText("");
            six.setText("");
            seven.setText("");
            eight.setText("");
            totalCgpaAndGrade=null;
        }
    }


    //creating Option Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }


    // set OptionMenu Item SelectListener
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            //set share item Listener
            case R.id.shareItemId:
                if(TextUtils.isEmpty(string_first)){
                    first.setError("Enter a value");
                    first.requestFocus();
                }
                else if(Float.parseFloat(string_first)>4 || Float.parseFloat(string_first)<2){
                    first.setError("Should not greater than 2 and less than 4");
                    first.requestFocus();
                }
                else  if(TextUtils.isEmpty(string_second)){
                    second.setError("Enter a value");
                    second.requestFocus();
                }
                else  if(Float.parseFloat(string_second)>4 || Float.parseFloat(string_second)<2){
                    second.setError("Should not greater than 2 and less than 4");
                    second.requestFocus();
                }

                else  if(TextUtils.isEmpty(string_three)){
                    three.setError("Enter a value");
                    three.requestFocus();
                }
                else if(Float.parseFloat(string_three)>4|| Float.parseFloat(string_three)<2){
                    three.setError("Should not greater than 2 and less than 4");
                    three.requestFocus();
                }

                else if(TextUtils.isEmpty(string_four)){
                    four.setError("Enter a value");
                    four.requestFocus();
                }
                else if(Float.parseFloat(string_four)>4|| Float.parseFloat(string_four)<2){
                    four.setError("Should not greater than 2 and less than 4");
                    four.requestFocus();
                }
                else if(TextUtils.isEmpty(string_five)){
                    five.setError("Enter a value");
                    five.requestFocus();

                }
                else if(Float.parseFloat(string_five)>4|| Float.parseFloat(string_five)<2){
                    five.setError("Should not greater than 2 and less than 4");
                    five.requestFocus();
                }
                else   if(TextUtils.isEmpty(string_six)){
                    six.setError("Enter a value");
                    six.requestFocus();
                }
                else if(Float.parseFloat(string_six)>4|| Float.parseFloat(string_six)<2){
                    six.setError("Should not greater than 2 and less than 4");
                    six.requestFocus();
                }
                else  if(TextUtils.isEmpty(string_seven)){
                    seven.setError("Enter a value");
                    seven.requestFocus();
                }
                else  if(Float.parseFloat(string_seven)>4|| Float.parseFloat(string_seven)<2){
                    seven.setError("Should not greater than 2 and less than 4");
                    seven.requestFocus();
                }
                else  if(TextUtils.isEmpty(string_eight)){
                    eight.setError("Enter a value");
                    eight.requestFocus();
                }
                else if(Float.parseFloat(string_eight)>4|| Float.parseFloat(string_eight)<2){
                    eight.setError("Should not greater than 2 and less than 4");
                    eight.requestFocus();
                }
                else {

                    Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                    sharingIntent.setType("text/plain");
                    String shareBody = "first semester GPA is =\t\t" + first.getText().toString() + "\n" +
                            "Second semester GPA is =\t\t" + second.getText().toString() + "\n" +
                            "Third semester GPA is =\t\t" + three.getText().toString() + "\n" +
                            "Fourth semester GPA is =\t\t" + four.getText().toString() + "\n" +
                            "Fifth semester GPA is =\t\t" + five.getText().toString() + "\n" +
                            "Six semester GPA is =\t\t" + six.getText().toString() + "\n" +
                            "Seven semester GPA is =\t\t" + seven.getText().toString() + "\n" +
                            "Eight semester GPA is =\t\t" + eight.getText().toString() + "\n\n\n" +
                            "Total CGPA is =\t\t" + totalCgpaAndGrade;

                    String shareSub = "Diploma CGPA ";
                    sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                    startActivity(Intent.createChooser(sharingIntent, "Share using"));
                }

                break;

            //set theme item Listener
            case R.id.themeItemId:
                themeValue++;
                if (themeValue == 1){
                    mainLinearLayout.setBackgroundResource(R.drawable.backgraound);
                } else if (themeValue == 2){
                    mainLinearLayout.setBackgroundResource(R.drawable.backgraound1);
                } else if (themeValue == 3) {
                    mainLinearLayout.setBackgroundResource(R.drawable.backgraound2);
                } else if (themeValue == 4) {
                    mainLinearLayout.setBackgroundResource(R.drawable.backgraound3);
                 }
                else  if (themeValue==5){
                    mainLinearLayout.setBackgroundResource (R.drawable.backgraound4);
                }
                else  if (themeValue==6){
                    mainLinearLayout.setBackgroundResource (R.drawable.backgraound5);
                }
                else  if (themeValue==7){
                    mainLinearLayout.setBackgroundResource (R.drawable.backgraound6);
                }
                else  if (themeValue==8){
                    mainLinearLayout.setBackgroundResource (R.drawable.backgraound7);
                    themeValue=0;
                }
        break;
        }
        return super.onOptionsItemSelected(item);
    }

}
