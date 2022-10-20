package HW_12;

import java.util.*;

public class FileNavigator {

    private final Map<String, ArrayList<FileData>> savedFiles = new HashMap<>();

    public void add(String path, FileData file) {

        if (!file.getPath().equals(path)) {
            System.out.println("Wrong path!");
            return;
        }

        if (!savedFiles.containsKey(path)) savedFiles.put(path, new ArrayList<>());
        savedFiles.get(path).add(file);
    }

    public ArrayList<FileData> find(String path) {
        return savedFiles.get(path);
    }

    public ArrayList<FileData> filterBySize(int maxBytes) {

        ArrayList<FileData> filesSortedBySize = sortBySize();
        ArrayList<FileData> filesMatchedBySize = new ArrayList<>();
        for (int i = 0; i < filesSortedBySize.size() && filesSortedBySize.get(i).getSizeInBytes() <= maxBytes; i++) {
            filesMatchedBySize.add(filesSortedBySize.get(i));
        }

        return filesMatchedBySize;
    }

    private ArrayList<FileData> sortBySize() {

        ArrayList<FileData> allFilesSortedBySize = new ArrayList<>();
        for (Map.Entry<String, ArrayList<FileData>> entry : savedFiles.entrySet()) {
            allFilesSortedBySize.addAll(entry.getValue());
        }
        allFilesSortedBySize.sort(Comparator.comparingInt(FileData::getSizeInBytes));

        return allFilesSortedBySize;
    }

    public void remove(String path) {
        savedFiles.remove(path);
    }
}
