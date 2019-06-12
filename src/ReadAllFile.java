import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadAllFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Plik.txt");
        Scanner scanner = new Scanner(file);
        String line=null;
        int allChars = 0;
        int whiteChars = 0;
        int wordsCount = 0;
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            allChars+=line.length();
            whiteChars+=line.replace(" ", "").length();
            wordsCount+=line.split(" ").length;
//            System.out.println(Arrays.toString(line.split(" ")));
        }

        System.out.println(allChars);
        System.out.println(whiteChars);
        System.out.println(wordsCount);


    }
}
