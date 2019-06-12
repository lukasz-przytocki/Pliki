import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadAllFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        Scanner scanner = new Scanner(file);
        String allText="";
        while (scanner.hasNextLine()){
            allText= allText+ " " +scanner.nextLine();
        }
        System.out.println(allText);
          System.out.println("Ilość znaków: "+allText.length());

        String[] wyrazy = allText.split(" ");
        System.out.println(Arrays.toString(wyrazy));


    }
}
