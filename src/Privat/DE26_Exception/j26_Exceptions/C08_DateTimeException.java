package Privat.DE26_Exception.j26_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C08_DateTimeException {
    public static void main(String[] args) {
        //DateTimeException -> tarih zaman value'lerde oluşan RTE
        String dateScraped = "2021-08-15 09:00:28";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse(dateScraped, formatter);
        // .DateTimeParseException , uymaz ise bunu fırlatır

                //   LocalDate d1=LocalDate.of(2023,2,29);

        try {
            LocalDate d2=LocalDate.of(2023,2,29);
            System.out.println("Agam bu satırı okuduysan code exception fırlatmadı ");
        } catch (DateTimeException e) {
            System.out.println("Agam hatalı girdi yaptın : "+e.getMessage());
            System.out.println("Agam bu satırı okuduysan code exception fırlattı ama handle ettik");
        }
        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur
    }//ClassMain sonu
}
