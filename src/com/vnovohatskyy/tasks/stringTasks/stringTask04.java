package com.vnovohatskyy.tasks.stringTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stringTask04 {
    public static String filteringString (String str, String toFilter) {
        StringBuilder filteringString = new StringBuilder();
        List<String> strArray = new ArrayList<>(Arrays.asList(str.split("")));
        List<String> toFilterArray = new ArrayList<>(Arrays.asList(toFilter.split("")));
        for (int i=0; i<toFilterArray.size(); i++) {
            if (strArray.contains(toFilterArray.get(i))) {
                filteringString.append(toFilterArray.get(i));
            }
        }
        return filteringString.toString().replaceAll("\\s+"," ").
                replaceAll("\\,\\,", "").
                replaceAll("\\s\\,", "\\,").
                replaceAll("\\[\\s","\\[").
                replaceAll("\\s\\]","\\]");
    }

    public static void main(String[] args) {
        //В цій стрігзі я добавив зайві коми і пробіли і кілька кириличних букв, Якщо їх видалити то вона буде ідентичною з
        // стрінгою першою завдання 7, напиати Автоматичне фівльтування і видалення зайвих символів щоб str1 при порывнянны з str
        // давало тру
        String str = "“The central character in the series is Harry Potter, a boy who lives in Surrey with his aunt, uncle, and cousin - the Dursleys - who discovers, at the age of eleven, that he is a wizard, though he lives in the ordinary world of non-magical people known as Muggles.[8] The wizarding world exists parallel to the Muggle world, albeit hidden and in secrecy. His magical ability is inborn and children with such abilities are invited to attend exclusive magic schools that teach the necessary skills to succeed in the wizarding world.[9] Harry becomes a student at Hogwarts School of Witchcraft and Wizardry, a wizarding academy in Scotland and it is here where most of the events in the series take place. As Harry develops through his adolescence, he learns to overcome the problems that face him: magical, social and emotional, including ordinary teenage challenges such as friendships, infatuation, romantic relationships, schoolwork and exams, anxiety, depression, stress, and the greater test of preparing himself for the confrontation that lies ahead in wizarding Britain's increasingly-violent second wizarding war.[10]”;";
        String str1 = "“The  central  character in the series is Harry Potter,  a   boy who lives in Surrey with his aunt,  uncle, and cousin - the Dursleys -  who discovers, at the age of eleven, that  he is a wizard,,,   though he lives in the ordinary world of non-magical people known as Muggles.[ 8 ] The еwizarding world exists parallel to the Muggle world, albeit hidden and in secrecy.  His magical ability is inborn and children  with  such  abilities  are  invited  to attend exclusive magic schools that teach the necessary skills to succeed in the п wizarding world.[9] Harry becomes a student at Hogwarts School of Witchcraft and Wizardry, a wizarding academy in Scotland and it is  here  where  most  of  the  events in the series take place. As Harry develops through his adolescence, he learns to overcome the problems  that  face  him:  magical, п social  and  emotional , including ordinary teenage е challenges such as friendships, infatuation, romantic  п relationships,   schoolwork   and exams,  anxiety,  depression,  stress,  and the greater  test  of  preparing himself for the confrontation that lies ahead in wizarding Britain's increasingly-violent second wizarding war.[10]”;";
        System.out.println ("String1 is equals to String2: "+filteringString (str, str1).equals(str));

    }
}
