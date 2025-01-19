package FileOperation;

import java.io.*;

public class FileOpe {
    static String filename="Myfile.csv";

    public static void CreateFile() throws FileNotFoundException {

        String Path = System.getProperty(("user.dir") + "//Java Practicals//");
        System.out.println("Current working directory: " + Path + filename);

        File f = new File(Path + filename);
        try {
            if (f.createNewFile()) {
                System.out.println("File created successfully..." + f.getName());

            } else {
                System.out.println("File already exist...");
            }

        } catch (IOException e) {
            System.out.println("File not creating...");
        }
    }

    public static void main(String args[]) throws FileNotFoundException {
            CreateFile();
        }
}
