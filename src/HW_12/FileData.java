package HW_12;

public class FileData {
    private final String name;
    private final int sizeInBytes;
    private final String path;

    public FileData(String name, int sizeInBytes, String path) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
        this.path = path;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "name='" + name + '\'' +
                ", sizeInBytes=" + sizeInBytes +
                ", path='" + path + '\'' +
                '}';
    }

}
