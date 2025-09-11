package com.joop.option_A.task_1;

import java.util.Objects;

public class Word {
    private final String word;

    public Word(String word) { this.word = word; }

    public String getWord() { return word; }

    @Override
    public String toString() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return Objects.equals(word, word1.word);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(word);
    }
}
