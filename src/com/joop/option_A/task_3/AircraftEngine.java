package com.joop.option_A.task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

public class AircraftEngine {
    private int aviationFuel;
    private String engineCondition;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Scanner scanner = new Scanner(System.in);

    public int getAviationFuel() { return aviationFuel; }
    public String getEngineCondition() { return engineCondition; }
    public void setAviationFuel(int aviationFuel) { this.aviationFuel = aviationFuel; }
    public void setEngineCondition(String engineCondition) { this.engineCondition = engineCondition; }
    public void engineConditionCheck() throws IOException {
        setEngineCondition(bufferedReader.readLine());
        switch (getEngineCondition()) {
            case "normal" ->
                    System.out.println("Your condition of the landing gear is normal. You don’t need a replacement");
            case "great" ->
                    System.out.println("Your condition of the landing gear is great. You don’t need a replacement");
            case "bad" ->
                    System.out.println("your condition of the landing gear is bad. You need a replacement");
            default ->
                    System.out.println("you entered the data incorrectly");
        }
    }
    public void aviationFuelCheck(){
        setAviationFuel(scanner.nextInt());
        if (getAviationFuel() >= 101)
            System.out.println("Your reading will exceed");
        if (getAviationFuel() <= 10)
            System.out.println("You are low on fuel. Please drive to a gas station.");
        else { System.out.println("Your fuel level is normal."); }
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AircraftEngine that = (AircraftEngine) o;
        return aviationFuel == that.aviationFuel &&
                Objects.equals(engineCondition, that.engineCondition) &&
                Objects.equals(bufferedReader, that.bufferedReader);
    }
    @Override
    public int hashCode() { return Objects.hash(aviationFuel, engineCondition, bufferedReader); }

    @Override
    public String toString() {
        return "AircraftEngine{" +
                "aviationFuel=" + aviationFuel +
                ", engineCondition='" + engineCondition + '\'' +
                ", bufferedReader=" + bufferedReader +
                ", scanner=" + scanner +
                '}';
    }
}
