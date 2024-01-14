package org.example.GrishaTask.Part1.Part4.Task4;

public class Task4 {

    public static void main(String[] args) {

        MyCopy myCopy = (x,n,q) ->
        {
            StringBuilder s = new StringBuilder();
            int counter=0;
            while(s.length()+x.length()<q|| counter<n)
            {
                s.append(x +", ");
                counter++;
            }
            return s.toString();
        };

        String str = myCopy.cupyString("Hello",3,12);
        System.out.println(str);

    }
}
