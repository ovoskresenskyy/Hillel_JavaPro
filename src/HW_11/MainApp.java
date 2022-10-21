package HW_11;

public class MainApp {

    public static void main(String[] args) {

        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add();
        orderBoard.add("Ivan");

        orderBoard.draw();
        orderBoard.deliver();

        orderBoard.add();
        orderBoard.add("NifNif");
        orderBoard.add("NafNaf");
        orderBoard.add("NufNuf");

        orderBoard.draw();

        orderBoard.deliver(5);
        orderBoard.deliver(555);
        orderBoard.deliver();
        orderBoard.deliver(2);
        orderBoard.deliver();

        orderBoard.draw();

    }
}
