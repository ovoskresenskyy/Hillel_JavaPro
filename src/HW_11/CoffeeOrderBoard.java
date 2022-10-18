package HW_11;

import java.util.LinkedList;

public class CoffeeOrderBoard {

    private final LinkedList<Order> orderList = new LinkedList<>();

    public void add() {
        add("no name");
    }

    public void add(String clientName) {
        orderList.addLast(new Order(clientName));
    }

    public Order deliver() {
        return orderList.isEmpty() ? null : orderList.removeFirst();
    }

    public Order deliver(int orderNumber) {

        if (orderList.isEmpty()) return null;
        Order orderToDeliver = null;

        int left = 0;
        int right = orderList.size() - 1;
        while (left <= right) {

            int middle = left + (right - left) / 2;
            if (orderList.get(middle).getNumber() > orderNumber) right = middle - 1;
            else if (orderList.get(middle).getNumber() < orderNumber) left = middle + 1;
            else {
                orderToDeliver = orderList.remove(middle);
                break;
            }
        }
        return orderToDeliver;
    }

    public void draw() {

        StringBuilder textToPrint = new StringBuilder();
        textToPrint.append("-----------\n Num | Name\n-----------\n");

        for (Order order : orderList) {
            textToPrint.append(order);
        }

        System.out.println(textToPrint);
    }
}
