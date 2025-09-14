package com.joop.option_A.task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class LandingGear {
    private String conditionOfTheLandingGear;

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public String getConditionOfTheLandingGear() { return conditionOfTheLandingGear; }
    public void setConditionOfTheLandingGear(String conditionOfTheLandingGear)
    { this.conditionOfTheLandingGear = conditionOfTheLandingGear; }
    public void checkOfTheLandingGearCondition() throws IOException {
        setConditionOfTheLandingGear(bufferedReader.readLine());
        switch (getConditionOfTheLandingGear()) {
            case "normal" ->
                    System.out.println("Your condition of the landing gear is normal. You don’t need a replacement");
            case "great" ->
                    System.out.println("Your condition of the landing gear is great. You don’t need a replacement");
            case "bad" ->
                    System.out.println("Your condition of the landing gear is bad. You need a replacement");
            default ->
                    System.out.println("You entered the data incorrectly");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LandingGear that = (LandingGear) o;
        return Objects.equals(conditionOfTheLandingGear,
                that.conditionOfTheLandingGear) && Objects.equals(bufferedReader, that.bufferedReader);
    }
    @Override
    public int hashCode() {
        return Objects.hash(conditionOfTheLandingGear, bufferedReader);
    }
    @Override
    public String toString() {
        return "LandingGear{" +
                "conditionOfTheLandingGear='" + conditionOfTheLandingGear + '\'' +
                ", bufferedReader=" + bufferedReader +
                '}';
    }
}
