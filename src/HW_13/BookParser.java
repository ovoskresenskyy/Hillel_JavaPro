package HW_13;

import java.io.*;
import java.util.*;

public class BookParser {

    public Map<String, Integer> bookByWords = new HashMap<>();
    private String bookName;

    public void startParser(File book) {

        bookName = book.getName();
        readBook(book);
        writeStatistic();
    }

    private void readBook(File book) {

        try (BufferedReader bookReader = new BufferedReader(new FileReader(book))) {
            String bookLine;
            while ((bookLine = bookReader.readLine()) != null) parseLine(bookLine);
            bookByWords = sortMapByValue();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    private void parseLine(String line) {

        String[] lineWords = line.trim().split("\\s+");
        for (String word : lineWords) {

            String wordAsKey = word.toLowerCase().replaceAll("[^a-z]", "");
            if (wordAsKey.length() <= 2) continue;
            if (!bookByWords.containsKey(wordAsKey)) bookByWords.put(wordAsKey, 0);
            bookByWords.put(wordAsKey, bookByWords.get(wordAsKey) + 1);
        }
    }

    private Map<String, Integer> sortMapByValue() {

        List<Map.Entry<String, Integer>> wordCounter = new LinkedList<>(bookByWords.entrySet());
        wordCounter.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, Integer> sortedByValue = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : wordCounter) {
            sortedByValue.put(entry.getKey(), entry.getValue());
        }
        return sortedByValue;
    }

    private void writeStatistic() {

        File summaryStatistic = getStatisticFile();
        try (FileWriter statisticRecorder = new FileWriter(summaryStatistic, false)) {
            StringBuilder statistic = new StringBuilder()
                    .append("Count of unique words in the book: ")
                    .append(bookByWords.size())
                    .append("\n")
                    .append(getMostUsedWords());

            System.out.println(statistic);
            statisticRecorder.write(statistic.toString());
            statisticRecorder.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private File getStatisticFile(){
        String separator = System.getProperty("file.separator");
        StringBuilder path = new StringBuilder()
                .append("src")
                .append(separator)
                .append(this.getClass().getPackageName())
                .append(separator)
                .append(removeExtension(bookName))
                .append("_statistic.txt");
        File summaryStatistic = new File(path.toString());

        if (!summaryStatistic.isFile()) {
            try {
                summaryStatistic.createNewFile();
            } catch (IOException exception) {
                throw new RuntimeException(exception);
            }
        }
        return summaryStatistic;
    }

    private StringBuilder getMostUsedWords() {

        int counter = 0;
        StringBuilder statistic = new StringBuilder("Ten most used words in the book:\n");

        Iterator<Map.Entry<String, Integer>> entries = bookByWords.entrySet().iterator();
        while (entries.hasNext() && counter++ < 10) {
            Map.Entry<String, Integer> entry = entries.next();
            statistic.append(counter)
                    .append(". ")
                    .append(entry.getKey())
                    .append(" -> ")
                    .append(entry.getKey().length())
                    .append(" symbols. Used: ")
                    .append(entry.getValue())
                    .append(" times\n");
        }
        return statistic;
    }


    private String removeExtension(String fileName) {

        int pointIndex = fileName.lastIndexOf(".");
        if (pointIndex != -1) fileName = fileName.substring(0, pointIndex);
        return fileName;
    }

    public File getFileByName(String name) {
        return getFileByName(new File("src/"), name);
    }

    private File getFileByName(File directory, String name) {

        File foundedFile = new File(name);
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isDirectory() && !foundedFile.isFile()) {
                foundedFile = getFileByName(file, name);
            } else if (removeExtension(file.getName()).equalsIgnoreCase(name)) return file;
        }
        return foundedFile;
    }
}
