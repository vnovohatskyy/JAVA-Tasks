package com.vnovohatskyy.tasks.mathTasks;

public class mathTask04 {
    public static void main(String[] args) {
        //В переменной n хранится вещественное число с ненулевой дробной частью.
        // Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран
        double n4=23.40;
        if (n4%(int)(n4)>=0.5){
            System.out.println((int)n4+1);
        } else {
            System.out.println((int)n4);
        }

    }
}
