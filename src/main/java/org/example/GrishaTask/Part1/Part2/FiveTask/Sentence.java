package org.example.GrishaTask.Part1.Part2.FiveTask;

public class Sentence {

    private Word[] wd;

    public Sentence(String[] s)
    {
        wd = new Word[s.length];
        for(int i = 0; i< s.length;i++)
        {
             wd[i] = new Word(s[i]);

        }
    }
    public int getWordCount()
    {
    return wd.length;
    }

    public String getOriginalSentence()
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < wd.length;i++) {
            sb.append(wd[i]);
        }

        return sb.toString();
    }

    public Word getWorldByPosition(int pos) {
        return wd[pos-1];
    }
}
