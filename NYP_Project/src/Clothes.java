
import java.io.BufferedWriter;
import java.io.IOException;

//Kıyafet
public class Clothes extends Abstract {

    public Clothes() {
        bildir();
    }

    @Override
    public void bildir() {
        System.out.println("Clothes sınıfı çalıştı");
    }

    @Override
    public void veritabanıYaz(ProductManager productManager, BufferedWriter bf) throws IOException {
        bf.write(productManager.getId() + "  |  " + productManager.getName()
                + "  |  " + productManager.getPrice() + "  |  " + productManager.getCampany()
                + "  |  " + productManager.getCategory() + "  |  " + productManager.urunKoduOlustur() + "\n");
    }

}
