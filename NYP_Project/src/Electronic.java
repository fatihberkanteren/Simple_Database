
import java.io.BufferedWriter;
import java.io.IOException;

//Elektronik
public class Electronic extends Abstract {

    public Electronic() {
        bildir();
    }

    @Override
    public void bildir() {
        System.out.println("Electronic sınıfı çalıştı");
    }

    @Override
    public void veritabanıYaz(ProductManager productManager, BufferedWriter bf) throws IOException {
        bf.write(productManager.getId() + "  |  " + productManager.getName()
                + "  |  " + productManager.getPrice() + "  |  " + productManager.getCampany()
                + "  |  " + productManager.getCategory() + "  |  " + productManager.urunKoduOlustur() + "\n");
    }

}
