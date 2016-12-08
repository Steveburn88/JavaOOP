package exercise07.Task1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
/**
 * Created by stefan on 08.12.16.
 */
public class FileCopy {


    public static void main(String[] args) {
        Path currentRelativePath = Paths.get("");
        String dir = currentRelativePath.toAbsolutePath().toString();
        System.out.println(dir);
        String line;
        BufferedReader br;
        FileWriter fw;
        try {
            br = new BufferedReader(new FileReader(dir+"/src/exercise07/Task1/source.txt"));
            fw = new FileWriter(dir+"/src/exercise07/Task1/destination.txt");

            while((line = br.readLine()) != null) {
                System.out.println(line);
                fw.write(line);
                fw.write("\r\n");
            }
            br.close();
            fw.close();
        } catch (FileNotFoundException f) {
            System.out.println(f.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
