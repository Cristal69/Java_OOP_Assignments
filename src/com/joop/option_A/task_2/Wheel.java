package com.joop.option_A.task_2;

import java.util.Objects;
import java.util.Scanner;

public class Wheel {
    private float pressure;
    private int wear;

    Scanner scanner = new Scanner(System.in);
    public float getPressure() { return pressure; }
    public int getWear() { return wear; }
    public void setPressure(float pressure) { this.pressure = pressure; }
    public void setWear(int wear) { this.wear = wear; }
    public void TyrePressureCheck(){
        if (getPressure() > 100.1) System.out.println("tire pressure is higher than normal");
        if (getPressure() < 20.0) System.out.println("tire pressure is below normal");
        else System.out.println("tire pressure is normal");
    }
    public void TyreWearCheck(){
        if (getWear() > 100) System.out.println("tire wear is higher than normal");
        if (getWear() < 20) System.out.println("tire wear is below normal");
        else System.out.println("tire wear is normal");
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Float.compare(pressure, wheel.pressure) == 0 && wear == wheel.wear && Objects.equals(scanner, wheel.scanner);
    }
    @Override
    public int hashCode() { return Objects.hash(pressure, wear, scanner); }
    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                ", wear=" + wear +
                ", scanner=" + scanner +
                '}';
    }
}
