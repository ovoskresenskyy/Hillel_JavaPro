package HW_13;

import java.io.*;
import java.util.*;

public class FileProcessing {

    // todo: Need another class for reader/writer ?

    public Map<String, Integer> bookByWords = new HashMap<>();

    public void parseBook(File book) {

        readBook(book);
        writeStatisticIntoTheFile();
    }

    private void readBook(File book) {

        try (BufferedReader bookReader = new BufferedReader(new FileReader(book))) { //todo: FileReader or BufferedFileReader?
            String line;
            while ((line = bookReader.readLine()) != null) parseLine(line);
            bookByWords = sortMapByValue();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    private void writeStatisticIntoTheFile() {

        String fileSeparator = System.getProperty("file.separator");
        String filePath = "src"
                + fileSeparator
                + this.getClass().getPackageName()
                + fileSeparator
                + "File with values.txt";
        File fileWithFinalValues = new File(filePath);

        try (BufferedWriter statisticRecorder = new BufferedWriter(new FileWriter(fileWithFinalValues, false))) { //todo: FileWriter or BufferedFileWriter?
            StringBuilder statistic = new StringBuilder()
                    .append("Count of unique words in the book: ")
                    .append(bookByWords.size() + 1)
                    .append("\n")
                    .append(writeTenMostUsedWords());

            System.out.println(statistic);
            statisticRecorder.write(statistic.toString());
            statisticRecorder.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private StringBuilder writeTenMostUsedWords() {

        int limit = 0;
        StringBuilder statistic = new StringBuilder("Ten most used words in the book:\n");

        Iterator<Map.Entry<String, Integer>> entries = bookByWords.entrySet().iterator();
        while (entries.hasNext() && limit++ < 10) {
            Map.Entry<String, Integer> entry = entries.next();
            statistic.append(limit)
                    .append(". ")
                    .append(entry.getKey())
                    .append(" -> ")
                    .append(entry.getKey().length()).append(" symbols. Used: ")
                    .append(entry.getValue()).append(" times\n");
        }
        return statistic;
    }


    private void parseLine(String line) {

        String[] wordsAtLine = line
                .trim()
                .split("\\s+");

        for (String word : wordsAtLine) {
            String wordAsKey = word
                    .toLowerCase()
                    .replaceAll("[^a-z]", "");

            if (wordAsKey.length() <= 2) continue;
            if (!bookByWords.containsKey(wordAsKey)) bookByWords.put(wordAsKey, 0);
            bookByWords.put(wordAsKey, bookByWords.get(wordAsKey) + 1);
        }
    }

    private Map<String, Integer> sortMapByValue() {

        List<Map.Entry<String, Integer>> wordsWithCounts = new LinkedList<>(bookByWords.entrySet());
        wordsWithCounts.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, Integer> sortedBookByWords = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : wordsWithCounts) {
            sortedBookByWords.put(entry.getKey(), entry.getValue());
        }
        return sortedBookByWords;
    }

    private String removeExtension(String fileName) {

        int lastIndex = fileName.lastIndexOf(".");
        if (lastIndex != -1) fileName = fileName.substring(0, lastIndex);
        return fileName;
    }

    public File findFileByName(String fileName) {

        File rootDirectory = new File("src/");
        return findFileByName(rootDirectory, fileName);
    }

    private File findFileByName(File directory, String fileName) {

        File foundedFile = new File(fileName);
        for (File fileOrDirectory : Objects.requireNonNull(directory.listFiles())) {
            if (fileOrDirectory.isDirectory() && !foundedFile.isFile()) {
                foundedFile = findFileByName(fileOrDirectory, fileName);
            } else if (removeExtension(fileOrDirectory.getName()).equalsIgnoreCase(fileName)) return fileOrDirectory;
        }
        return foundedFile;
    }
}
