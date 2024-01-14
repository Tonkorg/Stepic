package org.example.GrishaTask.Part1.Part3.TaskManager;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Diary {


    private final HashSet<BusinessRecord> businessRecord = new HashSet<>();
    BusinessRecord last;


    public BusinessRecord searchByByDate(LocalDate localDateTime)
    {
        for(BusinessRecord lc: businessRecord)
        {
            if(localDateTime.equals(lc.getExecuteDate()))
            {
                return lc;

            }
        }
        return new BusinessRecord();
    }
    public BusinessRecord searchByTime(LocalTime localDateTime)
    {
        for(BusinessRecord lc: businessRecord)
        {
            if(localDateTime.equals( lc.getCreatedWhen()))
            {
                return lc;

            }
        }
        return new BusinessRecord();
    }

    public BusinessRecord searchByByDateTime(LocalDateTime localDateTime)
    {
        for(BusinessRecord lc: businessRecord)
        {
            if(localDateTime.equals(lc.getExecuteDate().atTime(lc.getCreatedWhen())))
            {
                return lc;

            }
        }
        return new BusinessRecord();
    }

    public boolean delete(LocalDate localDate) {
        Iterator<BusinessRecord> iterator = businessRecord.iterator();
        while (iterator.hasNext()) {
            BusinessRecord vc = iterator.next();
            if (localDate.equals(vc.getExecuteDate())) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public boolean delete(LocalDateTime localDateTime)
    {
        for(BusinessRecord vc: businessRecord)
        {
            if(localDateTime.equals( vc.getLocaldateTime()))
            {
                businessRecord.remove(vc);
                return true;
            }
        }
        return false;

    }

    public void corectByDateTime(LocalDateTime localDateTime) {
        Iterator<BusinessRecord> iterator = businessRecord.iterator();
        try (Scanner scanner = new Scanner(System.in)) {
            while (iterator.hasNext()) {
                BusinessRecord vc = iterator.next();
                if (localDateTime.equals(vc.getLocaldateTime())) {
                    System.out.println("Введите измененную фразу");
                    String[] str = scanner.nextLine().split(" ");
                    vc.updateRecordWithNewData(str);
                }
            }
        }
    }

    public void corectByDate(LocalDate localDate) {
        Iterator<BusinessRecord> iterator = businessRecord.iterator();
        try (Scanner scanner = new Scanner(System.in)) {
            while (iterator.hasNext()) {
                BusinessRecord vc = iterator.next();
                if (localDate.equals(vc.getExecuteDate())) {
                    System.out.println("Введите измененную фразу");
                    String[] str = scanner.nextLine().split(" ");
                    vc.updateRecordWithNewData(str);
                }
            }
        }
    }

    public void showAll(boolean asc)
    {
        List<BusinessRecord> col = businessRecord.stream().sorted().toList();
        if(asc)
        {

            for(BusinessRecord br: col)
            {
                System.out.println(br.getOriginalSentence());
            }
        }
        else
        {
            Collections.reverse(col);
            for (int i = col.size() - 1; i >= 0; i--) {
                System.out.println(col.get(i).getOriginalSentence());
            }
        }
    }

    public BusinessRecord showByDateTime(LocalDateTime localDateTime)
    {
        for(BusinessRecord v:businessRecord)
        {
            if(localDateTime.equals(v.getLocaldateTime()))
            {
                return v;
            }

        }
        return null;
    }


    public BusinessRecord showLast()
    {
        if(!businessRecord.isEmpty()) {
            System.out.println(last.getOriginalSentence());
            return last;
        }
        return null;
    }
    public String showLast(int i)
    {
        if(!businessRecord.isEmpty()) {
            return (last.getOriginalSentence());
        }
        return "Записей нет!";
    }


    public void createBusinessRecord(String[] s) {
        if (s.length != 0) {
            last = new BusinessRecord(s);
            businessRecord.add(last);
        } else {
            System.out.println("Ошибка: Пустая строка! Запись не создана.");
            return; // Добавьте эту строку
        }
    }

}
