import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main4  {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream=new FileInputStream("d:/1/22.txt");
        FileOutputStream fileOutputStream=new FileOutputStream("d:/1/33.txt");
        byte [] buffer=new byte[1000];
        while(inputStream.available()>0){
            int count = inputStream.read(buffer);
            fileOutputStream.write(buffer,0,count);
        }
        inputStream.close();
        fileOutputStream.close();
    }
}
