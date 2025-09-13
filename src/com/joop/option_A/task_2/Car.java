package com.joop.option_A.task_2;

import java.io.IOException;
import java.util.Objects;

public class Car {
    private String carBrand;
    private int gasolineQuantity;
    public int getGasolineQuantity() { return gasolineQuantity; }
    public void setCarBrand(String carBrand) { this.carBrand = carBrand; }
    public void setGasolineQuantity(int gasolineQuantity) { this.gasolineQuantity = gasolineQuantity; }

    public void drive(Wheel wheel, Engine engine) throws IOException {
        if (getGasolineQuantity() > 100)
            System.out.println("the entered data does not match");
        if (getGasolineQuantity() < 20)
            System.out.println("your going to the gas station");
        else {
            System.out.println("eou have enough gasoline");
        }
        wheel.TyrePressureCheck();
        engine.OilLevel();
        wheel.TyreWearCheck();

    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return gasolineQuantity == car.gasolineQuantity && Objects.equals(carBrand, car.carBrand);
    }
    @Override
    public int hashCode() { return Objects.hash(carBrand, gasolineQuantity); }
    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", gasolineQuantity=" + gasolineQuantity +
                '}';
    }
}
