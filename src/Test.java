import java.io.File;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
//        String path = "D:/妹妹资料";
//        File file = new File(path);
//        renameFiles(file);
        int [] a = new int[5];
        for (int i = 0; i < 3; i++) {
            a[i] = i;
        }
        System.out.println(a.length);
    }

    public static void renameFiles(File file) {
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                renameFiles(f);
            }
        } else if (file.isFile()) {
            file.renameTo(new File(file.getAbsolutePath() + file.getName() + ".mp3"));
        }
    }
}
