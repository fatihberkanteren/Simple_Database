
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ProductManager extends Product {

    String zaman;
    String year;

    public ProductManager() {
        selamla();
        zamanTut();
    }

    private void hataBıldır() {
        System.out.println("Hata");
    }

    private void hataBıldır(Exception mesaj) {
        System.out.println("Hata" + mesaj);
    }

    private void hataBıldır(Exception mesaj, int satır) {
        System.out.println("Hata" + mesaj + satır + ".satırda");
    }

    private String zamanTut() {
        Calendar calendar = Calendar.getInstance();
        String zmn = String.valueOf(getTime());
        String dosyaAdi = zmn.replace(" ", "-");
        String dogruDosyaAdi = dosyaAdi.replace(":", "-");
        String zamn = dogruDosyaAdi.substring(4, 11);
        this.year = String.valueOf(calendar.get(Calendar.YEAR));
        zaman = zamn + year;
        return zaman;
    }
    
    public String getZaman() {
        return this.zaman;
    }

    File file;
    FileWriter fw;
    BufferedWriter bf;

    public void dosyaOlustur(String url) throws IOException {
        this.file = new File(url);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public File dosyaDondur() {
        return this.file;
    }

    public void fileWriterolustur(File file) {
        try {
            this.fw = new FileWriter(file);
        } catch (IOException ex) {
            hataBıldır();
        }
    }

    public FileWriter fwDondur(File file) {
        fileWriterolustur(file);
        return this.fw;
    }

    public void bufferedWriterolustur(FileWriter fw) {
        try {
            this.bf = new BufferedWriter(fw);
        } catch (Exception e) {
            hataBıldır(e);
        }

    }

    public BufferedWriter bfDondur(FileWriter fw) {
        bufferedWriterolustur(fw);
        return this.bf;
    }

    private void selamla() {
        System.out.println("(...Hoşgeldiniz...)");
    }

    public void sor() {
        System.out.println("Veritabanı içeriğini görmek ister misiniz ? (e/h)");
    }

    public void veritabanıSor() {
        System.out.println("1-) Kıyafet\n2-) Aksesuar\n3-) Elektronik\n4-) Kişisel Bakım");
        System.out.println("Seçiminiz : ");
    }

    public void kategoriGöster() {
        System.out.println("\nOluşturmak İstediğiniz Veritabanının Kategorisini Seçiniz Lütfen :");
        System.out.println("***********************************");
        System.out.println("1-) Kıyafet\n2-) Aksesuar\n3-) Elektronik\n4-) Kişisel Bakım\n5-) Çıkış");
        System.out.println("***********************************");
        System.out.print("Seçiminiz : ");

    }

    public String kategoriDöndür(int kategori) {
        kategoriAta(kategori);
        return getCategory();
    }

    public void bildir() {
        System.out.println("\n" + getCategory() + " Veritabanı Oluşturuldu.");
    }

    private void kategoriAta(int kategori) {
        switch (kategori) {
            case 1:
                setCategory("Kıyafet");
                break;
            case 2:
                setCategory("Aksesuar");
                break;
            case 3:
                setCategory("Elektronik");
                break;
            case 4:
                setCategory("Kişisel Bakım");
                break;
            default:
                break;
        }
    }

    private int sayiUret() {
        return (int) (0 + 3 * Math.random());
    }

    String[] kiyafet = new String[]{"Mavi", "DeFacto", "Koton", "Avva"};
    String[] aksesuar = new String[]{"Guess", "Casio", "Versace", "Pull&Bear"};
    String[] elektronik = new String[]{"Apple", "Samsung", "Lenovo", "Hp"};
    String[] kisiselBakim = new String[]{"Nivea", "Slazenger", "Gilette", "Rexona"};

    public String setCategoryCompany(String kategori) {
        switch (kategori) {
            case "Kıyafet":
                setCampany(kiyafet[sayiUret()]);
                break;
            case "Aksesuar":
                setCampany(aksesuar[sayiUret()]);
                break;
            case "Elektronik":
                setCampany(elektronik[sayiUret()]);
                break;
            case "Kişisel Bakım":
                setCampany(kisiselBakim[sayiUret()]);
                break;
            case "null":
                break;
            default:
                break;
        }
        return getCampany();
    }

    public String urunKoduOlustur() {
        setProductCode(getName().substring(0, 1) + getId());
        return getProductCode();
    }

    public Date getTime() {
        Date date = new java.util.Date();
        return date;
    }

    public void urunBilgiAl(String kategori) {
        Scanner input = new Scanner(System.in);
        switch (kategori) {
            case "Kıyafet":
                System.out.println("Ürün İsmini Giriniz : ");
                setName(input.nextLine());
                System.out.println("Ürün Fiyatını Giriniz :");
                setPrice(input.nextDouble());

                break;
            case "Aksesuar":
                System.out.println("Ürün İsmini Giriniz : ");
                setName(input.nextLine());
                System.out.println("Ürün Fiyatını Giriniz :");
                setPrice(input.nextDouble());

                break;
            case "Elektronik":
                System.out.println("Ürün İsmini Giriniz : ");
                setName(input.nextLine());
                System.out.println("Ürün Fiyatını Giriniz :");
                setPrice(input.nextDouble());

                break;
            case "Kişisel Bakım":
                System.out.println("Ürün İsmini Giriniz : ");
                setName(input.nextLine());
                System.out.println("Ürün Fiyatını Giriniz :");
                setPrice(input.nextDouble());

                break;
            default:
                break;
        }
    }

    public static void readFile(String path) {
        File file = new File(path);
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException ex) {
        }
    }

    public void bye() {
        System.out.println("Güle Güle ...");
    }

    class VeriOku extends ProductManager {

        public VeriOku() {
            System.out.println("VeriOku sınıfı çalıştı");
        }

        public String cevapAl(Scanner scanner) {
            sor();
            String cevap = scanner.next();
            return cevap;
        }

        public void veri_oku(String cevap, Scanner klavye) {
            try {
                if ("e".equals(cevap)) {
                    String path = "C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\Veritabanı Dosyaları\\" + zamanTut() + ".txt";
                    readFile(path);
                } else {
                    bye();
                }
            } catch (Exception e) {
                hataBıldır(e, 242);
            }
            
        }

    }

}
