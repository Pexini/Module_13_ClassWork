package Exept;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("input.txt");
            Scanner scanner = new Scanner(fileReader);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Частное " + a/b);
            System.out.println("Производное " + a*b);
        }catch (FileNotFoundException e){
            System.out.println("Для работы нужен файл input.txt");
            System.out.println("Сообщение "  + e.getMessage());
        }
    }
}
