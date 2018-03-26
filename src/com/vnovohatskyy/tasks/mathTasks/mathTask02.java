package com.vnovohatskyy.tasks.mathTasks;

public class mathTask02 {
    public static void main(String[] args) {
        // Создайте программу, которая вычислит выражение 14/209+14ˣ(29-13²+14/3) и выведет результат на экран.
        // При этом число 14 обязательно сохраните в отдельной
        double number = 14;
        System.out.println(number/209+number*(29-Math.pow(13,2)+number/3));

    }
}
