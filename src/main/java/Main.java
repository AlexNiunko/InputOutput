import javafx.scene.transform.Scale;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        String s2=scanner.next();
        String s3=scanner.next();
        System.out.println("Длинна первой строки равна"+s1.length());
        System.out.printf("Длинна второй строки = %d \n",s2.length());
        try( PrintWriter pr = new PrintWriter(System.out)) {
           pr.println("Длинна третьей строки равна " + s3.length());
       }
    }
}
