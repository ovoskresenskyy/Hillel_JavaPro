package HW_12_Canceled;

public class FileData {
    private final String name;
    private final int sizeInBytes;
    private final String path;

    private FileData(String name, int sizeInBytes, String path) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
        this.path = path;
    }

    public String getName() {
        return name;
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

    public static FileDataBuilder builder() {
        return new FileDataBuilder();
    }

    public static class FileDataBuilder {

        private String name;
        private int sizeInBytes;
        private String path;

        public FileDataBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FileDataBuilder sizeInBytes(int sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            return this;
        }

        public FileDataBuilder path(String path) {
            this.path = path;
            return this;
        }

        public FileData build() {
            return new FileData(this.name, this.sizeInBytes, this.path);
        }

    }
}
