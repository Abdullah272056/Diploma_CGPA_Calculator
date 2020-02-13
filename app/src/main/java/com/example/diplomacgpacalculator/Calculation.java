package com.example.diplomacgpacalculator;

public class Calculation {
    public float reasult(float first,float second,float three,float four, float five,float six,float seven,float eight){

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
    return total_cgpa;
}

}
