import java.io.File;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        String path = "D:/妹妹资料";
        File file = new File(path);
        renameFiles(file);
    }

    public static void renameFiles(File file) {
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                renameFiles(f);
            }
        } else if (file.isFile()) {
            File newFile =
            file.renameTo(new File(file.getName() + ".mp3"));
        }
    }
}
