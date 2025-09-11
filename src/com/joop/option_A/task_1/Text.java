package com.joop.option_A.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {
    private final String title;
    private final List<Sentence> sentenceList = new ArrayList<>();

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(title, text.title) && Objects.equals(sentenceList, text.sentenceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, sentenceList);
    }
}
