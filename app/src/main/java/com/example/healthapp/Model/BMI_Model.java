package com.example.healthapp.Model;

public class BMI_Model {
    public double height;
    public double weight;
    public boolean isMetric;

    enum Status {
        UNDERWEIGHT,
        HEALTHY,
        OVERWEIGHT,
        OBESE
    }

    public BMI_Model(double height, double weight, boolean isMetric) {
        this.height = height;
        this.weight = weight;
        this.isMetric = isMetric;
    }
    //From https://www.cdc.gov/nccdphp/dnpao/growthcharts/training/bmiage/page5_1.html & https://www.cdc.gov/nccdphp/dnpao/growthcharts/training/bmiage/page5_2.html
    public double getBMI(){
        if(isMetric)
        {
            return (weight / Math.pow(height, 2));
        }
        else {
            return (weight/ Math.pow(height, 2)) * 703;
        }
    }

    public Status getStatus(){
        double bmi = getBMI();
        if(bmi < 18.5)
        {
            return Status.UNDERWEIGHT;
        }
        else if(18.5 <= bmi && bmi <= 24.9)
        {
            return Status.HEALTHY;
        }
        else if(25.0 <= bmi && bmi <= 29.9)
        {
            return Status.OVERWEIGHT;
        }
        else {
            return Status.OBESE;
        }

    }

}
