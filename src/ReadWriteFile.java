import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by austinhays on 5/25/16.
 */
public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File f = new File("names.txt");

        FileWriter fw = new FileWriter(f);

        //overwrite the file if it exists.
        fw.write("Alice\n");
        fw.append("Bob\n");
        fw.append("Charlie\n");
        fw.close();

        // read line by line
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        //read entire file
        scanner = new Scanner(f);
        scanner.useDelimiter("\\Z"); // special delimiter to mark the end of a file
        System.out.println(scanner.next());
    }
}
