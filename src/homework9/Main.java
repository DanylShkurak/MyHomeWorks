package homework9;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        fileWriteAndReadMethod("src/folder/file.txt");
        System.out.println("");
        registration();
        System.out.println("");
        login();
    }


    public static void login() throws IOException {
        String pathToFileWithUserinfo = "src/folder/users.txt";
        boolean switcher = false;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (count < 4) {
            System.out.println("Enter ur log : ");
            String log = scanner.nextLine();
            System.out.println("Enter ur password: ");
            String password = scanner.nextLine();
            String userInfo = log.concat(" ").concat(password);
            switcher = readInfoForUser(pathToFileWithUserinfo, userInfo);
            count++;
            if (switcher) {
                break;
            }
            if (count==3){
                System.out.println("Try again after 1 min");
                break;
            }else System.out.println("Wrong log or password. Try again");
        }
    }

    private static void registration() throws IOException {
        String pathToFileWithUserinfo = "src/folder/users.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur log : ");
        String log = scanner.nextLine();
        System.out.println("Enter ur password: ");
        String password = scanner.nextLine();
        System.out.println("Enter ur password again : ");
        if (!scanner.nextLine().equals(password)) {
            System.out.println("Password does not match ");
            return;
        }
        String userInfo = log + " " + password + "\n";
        checkDirectory(pathToFileWithUserinfo, userInfo);
    }


    private static void fileWriteAndReadMethod(String filePath) throws IOException {
        Text text = new Text();
        try {
            checkDirectory(filePath, text.getText());
        } catch (IOException e) {
            System.err.println("Error");
        }
        System.out.println("File successfully created and filled");
        read(filePath);
    }

    private static void write(String path, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(text);
        fileWriter.close();
    }

    private static void checkDirectory(String path, String text) throws IOException {
        Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }
        write(path, text);
    }

    private static void read(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);
        System.out.println("Text: ");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
        fileReader.close();
    }

    private static boolean readInfoForUser(String path, String info) throws IOException {
        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            if (scanner.nextLine().equals(info)) {
                System.out.println("Hello user");
                return true;
            }
        }
        scanner.close();
        fileReader.close();
        return false;
    }
}
