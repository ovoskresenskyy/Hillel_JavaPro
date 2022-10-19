package HW_12;

public class Main {
    public static void main(String[] args) {

        String pathForTest_1 = "C:\\Trash";
        String pathForTest_2 = "C:\\Trash2";

        FileData file1 = new FileData("file_1", 123, pathForTest_1);
        FileData file2 = new FileData("file_2", 345, pathForTest_1);
        FileData file3 = new FileData("file_3", 150, pathForTest_2);

        FileNavigator myNavigator = new FileNavigator();
        myNavigator.add(pathForTest_1, file1);
        myNavigator.add(pathForTest_1, file2);
        myNavigator.add(pathForTest_2, file3);

        System.out.println(myNavigator.find(pathForTest_1));

        System.out.println(myNavigator.filterBySize(160));

        myNavigator.remove(pathForTest_1);
        System.out.println(myNavigator.find(pathForTest_1));

        System.out.println(myNavigator.filterBySize(160));

        myNavigator.add(pathForTest_2, file1);
    }
}
