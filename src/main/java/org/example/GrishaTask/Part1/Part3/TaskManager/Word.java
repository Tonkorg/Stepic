package org.example.GrishaTask.Part1.Part3.TaskManager;

public class Word {

    private char[] ch;

    public Word(String word)
    {
        ch = word.toCharArray();
    }
    public int getSimbolCount()
    {
        return ch.length;
    }
    public String getOriginalWorld()
    {
        return  new String((ch));
    }
}
