package Privat.DE25_InHeritance.Task02_AsyaHanimincOZUMU;

import javax.security.auth.Subject;
import java.security.PublicKey;

public class SubClass extends SuperClass {
    int sayi=13;
    @Override
    public void maaas(){// sub class'da super classdaki aynı isimle bir metot
        System.out.println("Bol bol ikramiye");
    }
@Override
    public void javaMethod(){
        super.maaas();// üst sınıf
        this.maaas();//kendi sınıfımızın verilerine ulaşmak için
        System.out.println("this.sayi = " + this.sayi);
        System.out.println("super.sayi = " + super.sayi);
    }


}
