package Privat.DE28_Interface;

public class Main implements I_arac,I_oto {
    @Override
    public void motor(int p1) {

    }

    @Override
    public void motor2() {

    }
    /* InterFace
      1 - Birden faza interface implement edilebilir
      2 - Tüm metotlar defult olarak public ve abstract dır(yani gövdesizdir)
      3 - Tüm method şlar abstrac tır
      4 - Abstract classın gelişmiş halidir.
      5 - class kelimesi yerine Interface kelimesi kullanılır
      6 - child class tüm metotları implement etmek zorundadır

      Abstract Class
      1 - Sadece 1 adet abstaract class extend edilebilir
      2 - metotlar private dışında herşey olur,
      3 - Metotlar abstract yada concrete olabilir
      5 - class kelimesi yerine abstract class kelimesi kullanılır
      6 - child class abstract(gövdesiz) metotları implement etmek zorundadır, diğerler metotler
       isteğe göre override edilebilir

       - classı extend ederiz, metotlarını implement eder, sonra değiştirebiliriz(override )
       - interface i implement ederiz metotlarını implement eder, sonra değiştirebiliriz(override )
     */




}
