import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        File file=new File("d:/1");
        for (File file1:file.listFiles()) {
            System.out.println("Имя файла "+file1.getName()+". Длинна файла "+file1.length()+". Является и он директорией "+file1.isDirectory());
        }
    }
}
