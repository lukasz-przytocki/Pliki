import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");


        try(Scanner scanner = new Scanner(file);){
            while (scanner.hasNextLine()){
            scanner.hasNext();
            System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("Plik nie istnieje");
        }

        System.out.println("Drugi\n");

        FileReader fileReader = new FileReader("file.txt");
        BufferedReader bfr = new BufferedReader(fileReader);
        String line = null;
        while ((line=bfr.readLine()) != null){
                    System.out.println(line);
        }
    }
}
