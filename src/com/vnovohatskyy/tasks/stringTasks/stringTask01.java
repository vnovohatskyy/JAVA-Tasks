package com.vnovohatskyy.tasks.stringTasks;

public class stringTask01 {
    public static String readingStringToSign(String str, String sign) {
        int endIndex = str.indexOf(sign);
        String resultString=str.substring(0,endIndex);
        return resultString;
    }

    public static int spacesCount(String str) {
        char[] cArray = str.toCharArray();
        int spacesCount = 0;
        for (char c : cArray){
            if (c == ' ')
                spacesCount++;
        }
        return  spacesCount;
    }

    public static void main(String[] args) {
        //Напишите программу, которая считывает символы пока не встретится точка. Также предусмотрите вывод количества пробелов.
        //Стрінга для роботи))) її можна використовувати і в наступних завданнях))
        String str = "“The central character in the series is Harry Potter, a boy who lives in Surrey with his aunt, uncle, and cousin -" +
                " the Dursleys - who discovers, at the age of eleven, that he is a wizard, though he lives in the ordinary world of " +
                "non-magical people known as Muggles.[8] The wizarding world exists parallel to the Muggle world, albeit hidden and in " +
                "secrecy. His magical ability is inborn and children with such abilities are invited to attend exclusive magic schools " +
                "that teach the necessary skills to succeed in the wizarding world.[9] Harry becomes a student at Hogwarts School of " +
                "Witchcraft and Wizardry, a wizarding academy in Scotland and it is here where most of the events in the series take " +
                "place. As Harry develops through his adolescence, he learns to overcome the problems that face him: magical, social " +
                "and emotional, including ordinary teenage challenges such as friendships, infatuation, romantic relationships, " +
                "schoolwork and exams, anxiety, depression, stress, and the greater test of preparing himself for the confrontation " +
                "that lies ahead in wizarding Britain's increasingly-violent second wizarding war.[10]”;";
        String stringToSign = readingStringToSign(str, ".");
        System.out.println("String to point: "+stringToSign);
        System.out.println("Number of spaces in string to point: "+spacesCount(stringToSign));
    }
}
