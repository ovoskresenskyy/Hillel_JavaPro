package HW_13;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BookParser bookParser = new BookParser();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert book name to search: ");

        File book = bookParser.getFileByName(scanner.nextLine());
        if (book.isFile()) bookParser.startParser(book);
        else System.out.println("File with that name doesn't exist.");

        scanner.close();
    }
}
