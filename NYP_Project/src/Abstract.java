
import java.io.BufferedWriter;
import java.io.IOException;

public abstract class Abstract {

    public abstract void veritabanıYaz(ProductManager productManager, BufferedWriter bf) throws IOException;

    public abstract void bildir();
}
