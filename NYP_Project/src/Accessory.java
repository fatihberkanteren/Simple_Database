
import java.io.BufferedWriter;
import java.io.IOException;

//Aksesuar
public class Accessory extends Abstract {

    public Accessory() {
        bildir();
    }

    @Override
    public void bildir() {
        System.out.println("Accessory sınıfı çalıştı");
    }

    @Override
    public void veritabanıYaz(ProductManager productManager, BufferedWriter bf) throws IOException {
        bf.write(productManager.getId() + "  |  " + productManager.getName()
                + "  |  " + productManager.getPrice() + "  |  " + productManager.getCampany()
                + "  |  " + productManager.getCategory() + "  |  " + productManager.urunKoduOlustur() + "\n");
    }

}
