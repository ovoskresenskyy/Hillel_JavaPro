package HW_11;

import java.util.LinkedList;

public class CoffeeOrderBoard {

    private int lastOrderNumber;

    private final LinkedList<Order> ordersInProgress = new LinkedList<>();

    public void add() {
        add("no name");
    }

    public void add(String clientName) {
        ordersInProgress.addLast(new Order(++lastOrderNumber, clientName));
    }

    public Order deliver() {
        return ordersInProgress.isEmpty() ? null : ordersInProgress.removeFirst();
    }

    public Order deliver(int orderNumber) {

        if (ordersInProgress.isEmpty()) return null;
        Order orderToDeliver = null;

        int left = 0;
        int right = ordersInProgress.size() - 1;
        while (left <= right) {

            int middle = left + (right - left) / 2;
            if (ordersInProgress.get(middle).getNumber() > orderNumber) right = middle - 1;
            else if (ordersInProgress.get(middle).getNumber() < orderNumber) left = middle + 1;
            else {
                orderToDeliver = ordersInProgress.remove(middle);
                break;
            }
        }
        return orderToDeliver;
    }

    public void draw() {

        StringBuilder textToPrint = new StringBuilder();
        textToPrint.append("-----------\n Num | Name\n-----------\n");

        for (Order order : ordersInProgress) {
            textToPrint.append(order);
        }

        System.out.println(textToPrint);
    }
}
