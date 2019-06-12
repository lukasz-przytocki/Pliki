import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("file.csv");
        BufferedWriter bfw = new BufferedWriter(fileWriter);

        Product[] product1 = new Product[3];
        product1[0] = new Product("Kawa", "ABC", 6.5);
        product1[1] = new Product("Herbata", "DEF", 5.5);
        product1[2] = new Product("Woda", "GHI", 4.5);

        for (int i = 0; i <product1.length ; i++) {
            String buffer=null;
            buffer=product1[i].getProducts();
            bfw.write(buffer);
            bfw.newLine();
        }
        bfw.close();

    }
}
