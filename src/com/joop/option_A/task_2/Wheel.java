package com.joop.option_A.task_2;

public class Wheel {
    private final float pressure;
    private final int wear;

    public Wheel(float pressure, int wear){
        this.pressure = pressure;
        this.wear = wear;
    }
    public float getPressure() { return pressure; }
    public int getWear() { return wear; }
}
