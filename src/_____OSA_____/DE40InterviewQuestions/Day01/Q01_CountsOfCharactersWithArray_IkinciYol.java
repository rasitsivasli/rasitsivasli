package _____OSA_____.DE40InterviewQuestions.Day01;

import java.util.*;

public class Q01_CountsOfCharactersWithArray_IkinciYol {
    /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini(kaç adet olduğunu) ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scan.nextLine();

        List<String> list = new ArrayList<>(List.of(str.split("")));
        Map<String, Integer> map = new HashMap<>();

        for (String e : list) {
            map.put(e,map.getOrDefault(e, 0)+1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" elemani "+entry.getValue()+" kez vardir");
        }
    }
}


