package HW_11;

import java.util.LinkedList;

public class CoffeeOrderBoard {

    private int lastOrderNumber;
    private final LinkedList<Order> orderList = new LinkedList<>();

    public void add() {
        add("no name");
    }

    public void add(String clientName) {
        Order newOrder = new Order(++lastOrderNumber, clientName);
        orderList.addLast(newOrder);
    }

    public Order deliver() {
        if (orderList.isEmpty()) return null;

        return orderList.removeFirst();
    }

    public Order deliver(int orderNumber) {
        if (orderList.isEmpty()) return null;

        Order outputOrder = null;

        int left = 0;
        int right = orderList.size() - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (orderList.get(middle).getNumber() > orderNumber) {
                right = middle - 1;
            } else if (orderList.get(middle).getNumber() < orderNumber) {
                left = middle + 1;
            } else {
                outputOrder = orderList.remove(middle);
                break;
            }
        }
        return outputOrder;
    }

    public void draw() {
        StringBuilder textToPrint = new StringBuilder();
        textToPrint.append("-----------\n Num | Name\n-----------\n");

        for (Order order : orderList) {
            textToPrint.append(order.toString()).append("\n");
        }
        System.out.println(textToPrint);
    }
}
