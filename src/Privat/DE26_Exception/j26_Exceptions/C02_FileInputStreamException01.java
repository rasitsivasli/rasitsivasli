package Privat.DE26_Exception.j26_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_FileInputStreamException01 {
    /*

             Dosya okuma/yazma işlemi bu işlemlerde hata ihitimali yüksek olduğu için  hata kontrolü zorunlu tutuluyor.
             bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surunlara karşılk gelen hatalara Checked Exception denir
             Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


            Bir kod create edilirken olasi exception'lar ongorulup
            exception olustugunda Java'nin ne yapmasini istedigimiz
            belirtilmelidir.


                 1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
                 kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

                     2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
                 FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
                 FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
                 Class'inin parent class Hz.Adem
         */
    public static void main(String[] args) throws IOException {//meth signiture level exception java zorunlu ekledi
    //public static void main(String[] args) throws FileNotFoundException {
        //FileInputStream fis=new FileInputStream("/Users/haluk.../IdeaProjects/javaLearn/src/j26_Exceptions/ebikGabık");
        FileInputStream fis=new FileInputStream("/Users/haluk.../IdeaProjects/javaLearn/src/j26_Exceptions/ebikGabık");
//fis path(yolu) verilen file erişim sağlaya obj.
//FileNotFoundException ->ulaşılması gereken file path(adres yol) yanlışşsa istisnası
        /*
        Eğer bir method'da Checked (CTE riski olan excp.) exception varsa method signature(mnethod name'den sonraki bölüm) hata uyarısı altı kırmızı çizgi verir
        komutun derlenmesine izin vermez ve kod üzerine gelidiğimde Add...  exception handle etme tavsiye eder otamatih throws excp eklenir.
        Bu şekilde methodu call eden komutlat try-catch alınması garanti edilmiş olur.
         */
        int k;
        while ((k=fis.read())!=-1){//fis.read() meth ile ulaşılan file'daki ascii değerlerin -1 olmama sartı(ascii=-1 olmayan karakter verir)->IOException -> evde yoksa controlu
            System.out.print((char) k);//k int  ascci olan file değeri char ici casting-> type dönüşümü
        }
        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");
    }//main sonu
}//class sonu
