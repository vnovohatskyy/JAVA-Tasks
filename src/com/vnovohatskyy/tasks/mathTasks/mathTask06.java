package com.vnovohatskyy.tasks.mathTasks;

import java.math.BigInteger;

public class mathTask06 {
    public static void main(String[] args) {
        //Выведите на экран первые 100  членов последовательности Фибоначчи. Напоминаем, что первый и второй члены последовательности
        // равны единицам, а каждый следующий — сумме двух предыдущих. (не факт що 100 чисел помістяться в 2 мілярда )  і про фібоначі
        // незя гуглить )
        // Тількт сюди можна https://uk.wikipedia.org/wiki/%D0%9F%D0%BE%D1%81%D0%BB%D1%96%D0%B4%D0%BE%D0%B2%D0%BD%D1%96%D1%81%D1%82%D1%8C_
        // %D0%A4%D1%96%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D1%96

        BigInteger fib1= new BigInteger("1");
        BigInteger fib2= new BigInteger("1");;
        BigInteger sumFib;
        int i;
        for(i=0; i<100; i++) {
            if (i<2) {
                sumFib=new BigInteger("1");
            } else {
                sumFib=fib1.add(fib2);
                fib1=fib2;
                fib2=sumFib;
            }
            System.out.print(sumFib+", ");
        }
    }
}
