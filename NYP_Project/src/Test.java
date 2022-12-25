
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
        ProductManager productManager = new ProductManager();
        int secim;
        Scanner klavye = new Scanner(System.in);
        String zaman = String.valueOf(productManager.getTime());
        String dosyaAdi = zaman.replace(" ", "-");
        String dogruDosyaAdi = dosyaAdi.replace(":", "-");
        System.out.println(dogruDosyaAdi);
        productManager.dosyaOlustur("C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\Veritabanı Dosyaları\\" + productManager.getZaman()+ ".txt");
        File dosya = productManager.dosyaDondur();
        FileWriter fw = productManager.fwDondur(dosya);
        BufferedWriter bf = productManager.bfDondur(fw);
        bf.write("İd |Ürün Adı   |Fiyat   |Kategori    |Firma     |Ürün Kodu |\n");
        do {
            productManager.kategoriGöster();
            Scanner input = new Scanner(System.in);
            secim = input.nextInt();
            if (secim == 5) {
                break;
            } else {
                String kategori = productManager.kategoriDöndür(secim);
                productManager.setCategoryCompany(kategori);
                if ("Kıyafet".equals(kategori)) {
                    Clothes clothes = new Clothes();
                    productManager.urunBilgiAl(kategori);
                    clothes.veritabanıYaz(productManager, bf);
                } else if ("Aksesuar".equals(kategori)) {
                    Accessory accessory = new Accessory();
                    productManager.urunBilgiAl(kategori);
                    accessory.veritabanıYaz(productManager, bf);
                } else if ("Elektronik".equals(kategori)) {
                    Electronic electronic = new Electronic();
                    productManager.urunBilgiAl(kategori);
                    electronic.veritabanıYaz(productManager, bf);
                } else if ("Kişisel Bakım".equals(kategori)) {
                    PersonalCare personalCare = new PersonalCare();
                    productManager.urunBilgiAl(kategori);
                    personalCare.veritabanıYaz(productManager, bf);
                } else {

                }
                productManager.idArttir();
            }
        } while (secim >= 1 && secim <= 4);
        bf.close();
        //System.out.println(dosya.getPath());
        ProductManager.VeriOku veriOku = productManager.new VeriOku();
        String cevap = veriOku.cevapAl(klavye);
        veriOku.veri_oku(cevap, klavye);
    }

}
