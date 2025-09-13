package com.joop.option_A.task_2;

public class Engine {
    private float numberOilLevel;

    public float getNumberOilLevel() { return numberOilLevel; }
    public void setNumberOilLevel(float numberOilLevel) {this.numberOilLevel = numberOilLevel; }
    public void OilLevel(){
        if (getNumberOilLevel() > 5.0) System.out.println("number exceeds max limit");
        if (getNumberOilLevel() < 1.5) System.out.println("Your running out of oil");
        else System.out.println("Your level oil normal");
    }

}
