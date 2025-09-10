package com.joop.option_A.task_1;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private String title;
    private List<Sentence> sentenceList = new ArrayList<>();

    public Text(String title) { this.title = title; }
    public void addSentence(Sentence sentence){ sentenceList.add(sentence); }
    public void printText(){
        for (Sentence sentence : sentenceList) {
            System.out.println(sentence);
        }
    }
    public void printTitle(){
        System.out.println("Heading: " + title);
    }
}
