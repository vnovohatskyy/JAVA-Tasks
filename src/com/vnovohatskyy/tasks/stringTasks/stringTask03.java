package com.vnovohatskyy.tasks.stringTasks;

import java.nio.charset.Charset;

public class stringTask03 {
    public static String formatingString (String str) {
        byte[] byteArray = str.getBytes(Charset.forName("UTF-8"));
        byte[] formatingArray = new byte[byteArray.length+1];
        for (int i = 0; i < byteArray.length; i++){
            formatingArray[i] = byteArray[i];
        }
        formatingArray[formatingArray.length -1] = 01;
        String s = new String(formatingArray);
        return s;
    }

    public static void main(String[] args) {
        // Форматування тестку , Відформатувати автомачично стрінгу так щоб при виводі на екран вона не помінялась але  щоб для перевірки
        // автоматичної це були не однакові обєкти))  Добавити нечитаємі символи, І так далі.  (str )
        String str = "“The central character in the series is Harry Potter, a boy who lives in Surrey with his aunt, uncle, and cousin - the Dursleys - who discovers, at the age of eleven, that he is a wizard, though he lives in the ordinary world of non-magical people known as Muggles.[8] The wizarding world exists parallel to the Muggle world, albeit hidden and in secrecy. His magical ability is inborn and children with such abilities are invited to attend exclusive magic schools that teach the necessary skills to succeed in the wizarding world.[9] Harry becomes a student at Hogwarts School of Witchcraft and Wizardry, a wizarding academy in Scotland and it is here where most of the events in the series take place. As Harry develops through his adolescence, he learns to overcome the problems that face him: magical, social and emotional, including ordinary teenage challenges such as friendships, infatuation, romantic relationships, schoolwork and exams, anxiety, depression, stress, and the greater test of preparing himself for the confrontation that lies ahead in wizarding Britain's increasingly-violent second wizarding war.[10]”;";
        System.out.println (formatingString(str).equals(str));
    }
}
