package com.joop.option_A.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private final List<Word> words = new ArrayList<>();

    public void addWord(Word word){ words.add(word); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Word word : words){
            sb.append(word.getWord()).append(" ");
        }
        return sb.toString().trim() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(words);
    }
}
