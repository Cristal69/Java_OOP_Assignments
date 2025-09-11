package com.joop.option_A.task_1;

public class Word {
    private final String word;

    public Word(String word) { this.word = word; }

    public String getWord() { return word; }

    @Override
    public String toString() {
        return word;
    }
}
