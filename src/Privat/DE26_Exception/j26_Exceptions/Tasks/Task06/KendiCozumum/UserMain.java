package Privat.DE26_Exception.j26_Exceptions.Tasks.Task06.KendiCozumum;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      /*   1- filedları id, username, password, active (boolean), signedIn (boolean)
        olan User isimli bir pojo class create ediniz.

     4- UserMain isminde main için bir class cteate ediniz.
     5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
        active ve signedIn default olarak true, false atayabilirsiniz.
        id yi sistem otomatik versin.,
     6- eğer password 6 dan küçük olursa yeniden userı girsin.passwordun
        6 karakterden küçük olup olmadığını classın içinde kontrol ediniz.*/

        ArrayList<User> kullanicilar = new ArrayList<>();
        kullaniciEkle(kullanicilar);

    }

    private static void kullaniciEkle(ArrayList<User> kullanicilar) {
        for (int i = 0; i < 2; i++) {
            User user = new User();
            Random random = new Random();
            user.setId(random.nextInt(1000));
            System.out.println(i + 1 + ". kulanici icin Id otomatik olarak belirlendi : "+random.nextInt(1000));
            System.out.print(i + 1 + ". kulanici icin Username : ");
            user.setUsername(scanner.next());
            password(user, i);
            System.out.print(i + 1 + ". kulanici active mi : ");
            user.setActive(scanner.nextBoolean());
            System.out.print(i + 1 + ". kulanici signedIn : ");
            user.setSignedIn(scanner.nextBoolean());
            kullanicilar.add(user);
            System.out.println(i+1+". kullanici " + kullanicilar.get(i));
        }


    }

    private static void password(User user, int i) {
        System.out.print(i + 1 + ". kulanici icin Password : ");
        try {String geciciPassword = scanner.next();
            if (geciciPassword.length() < 6) {
                throw new Exception();
            } else user.setPassword(geciciPassword);
        } catch (Exception e) {
            System.out.println("Password 6 haneden kucuk olmaz. Lütfen tekrar deneyiniz");
            password(user, i);
        }

    }


}



