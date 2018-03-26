package com.vnovohatskyy.tasks.stringTasks;

public class stringTask02 {
    public static int spacesCount(String str) {
        char[] cArray = str.toCharArray();
        int spacesCount = 0;
        for (char c : cArray){
            if (c == ' ')
                spacesCount++;
        }
        return  spacesCount;
    }

    public static int vovelsCount (String str) {
        int vovelsCount = 0;
        char[] cArray = str.toLowerCase().toCharArray();
        char[] vovelsArray = "aeiouy".toCharArray();
        for (char c : cArray) {
            for (char v: vovelsArray) {
                if (c==v) {
                    vovelsCount++;
                }
            }
        }
        return vovelsCount;
    }

    public static int consonantsCount (String str) {
        int consonantsCount = 0;
        char[] cArray = str.toLowerCase().toCharArray();
        char[] consonantsArray = "bsdfghjklmnpqrstvwxyz".toCharArray();
        for (char c : cArray) {
            for (char cons: consonantsArray) {
                if (c==cons) {
                    consonantsCount++;
                }
            }
        }
        return consonantsCount;
    }

    public static int bigLettersCount (String str) {
        int count = 0;
        char[] cArray = str.toCharArray();
        for (char c: cArray) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //Підрахувати і вивести в консоль Кількість пробілів. Кількіть голосних букв, кількість приголосних,  Кільксть Великих . (str )
        String str = "“The central character in the series is Harry Potter, a boy who lives in Surrey with his aunt, uncle, and cousin - the Dursleys - who discovers, at the age of eleven, that he is a wizard, though he lives in the ordinary world of non-magical people known as Muggles.[8] The wizarding world exists parallel to the Muggle world, albeit hidden and in secrecy. His magical ability is inborn and children with such abilities are invited to attend exclusive magic schools that teach the necessary skills to succeed in the wizarding world.[9] Harry becomes a student at Hogwarts School of Witchcraft and Wizardry, a wizarding academy in Scotland and it is here where most of the events in the series take place. As Harry develops through his adolescence, he learns to overcome the problems that face him: magical, social and emotional, including ordinary teenage challenges such as friendships, infatuation, romantic relationships, schoolwork and exams, anxiety, depression, stress, and the greater test of preparing himself for the confrontation that lies ahead in wizarding Britain's increasingly-violent second wizarding war.[10]”;";

        System.out.println("Spaces in string: "+spacesCount(str));
        System.out.println("Vovels in string: "+vovelsCount(str));
        System.out.println("Consonants in string: "+consonantsCount(str));
        System.out.println("Big letters in string: "+bigLettersCount(str));
    }
}
