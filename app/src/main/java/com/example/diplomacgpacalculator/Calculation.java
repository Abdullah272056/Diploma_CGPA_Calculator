package com.example.diplomacgpacalculator;

public class Calculation {
    String grade;
    public String result(float first,float second,float three,float four, float five,float six,float seven,float eight){
        float first_parcent_reasult = ((first * 5) / 100);
    float second_parcent_reasult = ((second * 5) / 100);
    float three_parcent_reasult = ((three * 5) / 100);
    float four_parcent_reasult = ((four * 10) / 100);
    float five_parcent_reasult = ((five * 15) / 100);
    float six_parcent_reasult = ((six * 20) / 100);
    float seven_parcent_reasult = ((seven * 25) / 100);
    float eight_parcent_reasult = ((eight * 15) / 100);

    float total_cgpa = (first_parcent_reasult + second_parcent_reasult + three_parcent_reasult
            + four_parcent_reasult + five_parcent_reasult + six_parcent_reasult +
            seven_parcent_reasult + eight_parcent_reasult);

        String cgpaString= String.format("%.3g%n", total_cgpa);
        float Cgpa=Float.parseFloat(cgpaString);

        if (Cgpa>=4){
            grade="(A+)";
        }else if (Cgpa<4 && Cgpa>=3.75){
            grade="(A)";
        }
        else if (Cgpa<3.75 && Cgpa>=3.5){
            grade="(A-)";
        }
        else if (Cgpa<3.5 && Cgpa>=3.25){
            grade="(B+)";
        }
        else if (Cgpa<3.25 && Cgpa>=3.00){
            grade="(B)";
        }
        else if (Cgpa<3.00 && Cgpa>=2.75){
            grade="(B-)";
        }
        else if (Cgpa<2.75 && Cgpa>=2.5){
            grade="(C+)";
        }
        else if (Cgpa<2.5 && Cgpa>=2.25){
            grade="(C)";
        }
        else if (Cgpa<2.25 && Cgpa>=2.00){
            grade="(D)";
        }else {
            grade="(F)";
        }

String pointAndCGPA=String.valueOf(Cgpa)+"\t\t"+grade;
    return pointAndCGPA;
}

}
