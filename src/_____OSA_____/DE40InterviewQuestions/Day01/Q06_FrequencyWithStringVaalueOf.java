package _____OSA_____.DE40InterviewQuestions.Day01;

import java.util.ArrayList;
import java.util.List;

public class Q06_FrequencyWithStringVaalueOf {
    /*
  Count the frequency of the letters in a given String as the format below:
  Input: String str = "Java is so Good";
  Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
   */
    public static void main(String[] args) {
        String str = "Java is so Good";
        String outPut = "";

        List<String> charList = new ArrayList<>(List.of(str.split("")));

        while (!charList.isEmpty()) {
            String ch = charList.get(0);// her seferinde ilk eleman silinecegi icin yeniden bastan itibaren kontrol ediyoruz
            int count = 0;
            if (!ch.trim().isEmpty()) {
                for (int i = 0; i < charList.size(); i++) {
                    if (ch.equals(charList.get(i))) {
                        count++;
                        charList.remove(i);
                        i--; // Bir önceki elemani kontrol etmek için indeksi azalt
                    }
                }

                System.out.print(ch + count + " ");
            }else {
                charList.remove(0); // Bo?luk karakteri oldu?unda direkt olarak ç?kar
            }
        }
    }

}

