package org.example.GrishaTask.Part1.Part3.TaskManager;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class BusinessRecord {

    private ArrayList<Word> words;

    private LocalDate executeDate;
    private LocalTime createdWhen;

    BusinessRecord(String[] s)
    {
        words = new ArrayList<>();
        for(int i =0; i< s.length;i++)
        {
            words.add(new Word(s[i]));
        }
        createdWhen = LocalTime.now();
        executeDate = LocalDate.now();
    }
    BusinessRecord()
    {
        System.out.println("Запись не найдена");
    }

    public int getWordCount()
    {
         return words.size();
    }
    public String getOriginalSentence()
    {
        StringBuilder sb = new StringBuilder();
        for (Word word : words) {
            sb.append(word.getOriginalWorld()).append(" ");
        }
        return sb.toString().trim();
    }
    public Word getWordByPosition(int pos) {
        return words.get(pos);
    }

    public LocalTime getCreatedWhen() {
        return createdWhen;
    }

    public LocalDate getExecuteDate() {
        return executeDate;
    }
    public LocalDateTime getLocaldateTime()
    {
        return this.getExecuteDate().atTime(this.getCreatedWhen());
    }
    public void updateRecordWithNewData(String[] newWords) {
        words.clear();  // Очищаем текущий список слов
        for (String newWord : newWords) {
            words.add(new Word(newWord));  // Добавляем новые слова в список
        }
    }
}
