package com.joop.Main;

import com.joop.option_A.task_1.*;
import com.joop.option_A.task_2.Car;
import com.joop.option_A.task_2.Engine;
import com.joop.option_A.task_2.Wheel;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Task_1 -------------------------------------------------------------------------------------------------------
        Word w1 = new Word("Hello");
        Word w2 = new Word("world");

        Sentence s1 = new Sentence();
        s1.addWord(w1);
        s1.addWord(w2);

        Text text = new Text("My first text");
        text.addSentence(s1);

        text.printTitle();
        text.printText();
        //Task_2 -------------------------------------------------------------------------------------------------------
        Engine engine = new Engine();
        engine.setNumberOilLevel(3.5F);
        engine.OilLevel();

        Wheel wheel = new Wheel();
        wheel.setWear(30);
        wheel.setPressure(10.5F);
        wheel.TyrePressureCheck();
        wheel.TyreWearCheck();

        Car car = new Car();
        car.setCarBrand("Nissan");
        car.setGasolineQuantity(30);
        try {
            car.drive(wheel,engine);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Task_3 -------------------------------------------------------------------------------------------------------
    }
}
