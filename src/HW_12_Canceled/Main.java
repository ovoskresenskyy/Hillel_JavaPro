package HW_12_Canceled;

public class Main {
    public static void main(String[] args) {

        String pathForTest_1 = "C:\\Trash";
        String pathForTest_2 = "C:\\Trash2";

        FileData file1 = FileData.builder()
                .name("file_1")
                .sizeInBytes(123)
                .path(pathForTest_1).build();

        FileData file2 = FileData.builder()
                .name("file_2")
                .sizeInBytes(345)
                .path(pathForTest_1).build();

        FileData file3 = FileData.builder()
                .name("file_3")
                .sizeInBytes(150)
                .path(pathForTest_2).build();

        FileNavigator myNavigator = new FileNavigator();
        myNavigator.add(file1);
        myNavigator.add(file2);
        myNavigator.add(file3);

        System.out.println(myNavigator.find(pathForTest_1));

        System.out.println(myNavigator.filterBySize(160));

        myNavigator.remove(pathForTest_1);
        System.out.println(myNavigator.find(pathForTest_1));
        System.out.println(myNavigator.filterBySize(160));

        myNavigator.add(pathForTest_2, file1);
    }
}
