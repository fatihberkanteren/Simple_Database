
import java.io.BufferedWriter;
import java.io.IOException;

//Kişisel Bakım
public class PersonalCare extends Abstract {

    public PersonalCare() {
        bildir();
    }

    @Override
    public void bildir() {
        System.out.println("PersonalCare sınıfı çalıştı");
    }

    @Override
    public void veritabanıYaz(ProductManager productManager, BufferedWriter bf) throws IOException {
        bf.write(productManager.getId() + "  |  " + productManager.getName()
                + "  |  " + productManager.getPrice() + "  |  " + productManager.getCampany()
                + "  |  " + productManager.getCategory() + "  |  " + productManager.urunKoduOlustur() + "\n");
    }

}
