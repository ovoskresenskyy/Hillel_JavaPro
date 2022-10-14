package HW_12_Canceled;

import java.util.*;

public class FileNavigator {

    private final HashMap<String, ArrayList<FileData>> savedFiles = new HashMap<>();

    public void add(FileData file) {
        String key = file.getPath();

        if (!savedFiles.containsKey(key)) {
            savedFiles.put(key, new ArrayList<>());
        }
        savedFiles.get(key).add(file);
    }

    public void add(String path, FileData file) {
        if (!file.getPath().equals(path)) {
            System.out.println("Wrong path!");
            return;
        }

        add(file);
    }

    public ArrayList<FileData> find(String path) {
        return savedFiles.get(path);
    }

    public ArrayList<FileData> filterBySize(int maxBytes) {

        ArrayList<FileData> allFilesSortedBySize = sortBySize();
        ArrayList<FileData> filesMatchedBySize = new ArrayList<>();

        for (int i = 0; i < allFilesSortedBySize.size() && allFilesSortedBySize.get(i).getSizeInBytes() <= maxBytes; i++) {
            filesMatchedBySize.add(allFilesSortedBySize.get(i));
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
