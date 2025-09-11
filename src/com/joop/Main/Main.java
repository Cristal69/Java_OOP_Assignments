package com.joop.Main;
import com.joop.option_A.task_1.*;

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

    }
}
