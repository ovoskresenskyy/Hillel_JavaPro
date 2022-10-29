package HW_13;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileProcessing bookParser = new FileProcessing();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert book name to search: ");

        File book = bookParser.findFileByName(scanner.nextLine());
        if (book.isFile()) {
            bookParser.parseBook(book);
        } else {
            System.out.println("File with that name doesn't exist.");
        }
    }
}
