package Privat.Projeler.ProjeSablonVonFarukHoca;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileKisiler implements InterFile {
    final static String filePath=System.getProperty("user.dir")+"/dosya1.txt";
    @Override
    public void dosyayaYaz( ) {
        File file = new File(filePath); // dosya objesini path+isim ile oluşturuyoruz
        if (!file.exists()) { // file yoksa oluşturalım
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("FileKisiler 10 -> dosya bulunamadı : "+e);
            }
        }
        try {
            FileWriter fWriter = new FileWriter(file,false);
            BufferedWriter bWriter = new BufferedWriter(fWriter);

            for (Map.Entry<Integer,Kisiler> val : Runner.liste.entrySet()) {
                String line=val.getValue().getId()+"*";
                line = line+val.getValue().getAdSoyad()+"*";
                line = line+val.getValue().getAdres()+"*";
                line = line+val.getValue().geteMail()+"*";
                line = line+val.getValue().getTel()+"*";
                line = line+val.getValue().isDurum();
                bWriter.write(line);  // ekleme yapıyorsak bWriter.append(str1)
                bWriter.newLine();
            }
            bWriter.close();
            fWriter.close();
        } catch (Exception e){
            System.out.println(e);
        }

        // listeyi dosyaya yaz
    }

    @Override
    public void dosyadanOku() {
        Map<Integer, Kisiler> liste = new HashMap<>();
        // dosyadan oku, listeye aktar

        // dosyayı açalım
        File file = new File(filePath); // dosya objesini path+isim ile oluşturuyoruz
        if (!file.exists()) { // file yoksa oluşturalım
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bReader = new BufferedReader(fileReader);
            String line;
            /* bu metot dosyadanOku() 1 kez çağrılıyor, aksi halde dolu Map e veriler,
            bir kez daha yüklenmiş olurdu. eğer bu metot birden fazla çağrılması gerekecek ise,
            tüm verileri aldığımız için önce map i aşağıdaki şekilde sıfırlamalıydık
            Runner.liste = new HashMap<>();
            yukarıdaki anlatım hatalı (array list için doğru) map de key mantığı olduğu için üzerine
            yazar ve verinin dublicate(çift) olması engeller
             */
            while ((line=bReader.readLine()) !=null){
                // line dan 1 kişi verisini alalım
               String[] dizi = line.split("\\*");
               int id = Integer.parseInt(dizi[0]);
               String adSoy = dizi[1];
               String adres = dizi[2];
               String eMail = dizi[3];
               String tel   = dizi[4];
               boolean durum= Boolean.parseBoolean(dizi[5]);
               // aldığımız bu veriyi, map a ekleyelim
                Kisiler kisi = new Kisiler(id,adSoy,adres,eMail,tel,durum);
                Runner.liste.put(id,kisi);
                // en büyük id yi buluyoruz, çünki yeni kayıt eklerken bundan
                // bir fazlasını id olarak vereceğiz, aksi halde proğramdan
                // çıkıp tekrar giddiğimizde Runner.adresSonID 1 den başlar ve olay karış
                if (id>Runner.adresSonID) Runner.adresSonID=id;
            }
            bReader.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }




        // listenin son elemanının  ID sini  Runner.adresSonID ye alalım

    }
}
