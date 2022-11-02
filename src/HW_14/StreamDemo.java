package HW_14;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class StreamDemo {

    private final List<Product> products;

    public StreamDemo(List<Product> products) {
        this.products = products;
    }

    public List<Product> getFilteredByTypeAndPrice(String type, double price) {
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.getPrice() > price)
                .toList();
    }

    public List<Product> applyDiscountByType(String type, int percent) {
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .filter(Product::isDiscountPossible)
                .peek(product -> product.applyDiscount(percent))
                .toList();
    }

    public Product getLowestPriceProductByType(String type) throws NoSuchElementException {
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .reduce((left, right) -> left.getPrice() < right.getPrice() ? left : right)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Product> getRecentlyAdded() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getDateAdded).reversed())
                .limit(3)
                .toList();
    }

    public double getSumByParameters(int yearAdded, String type, int priceLimit) {
        return products.stream()
                .filter(product -> product.getDateAdded().getYear() == yearAdded)
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.getPrice() <= priceLimit)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public Map<String, List<Product>> getGroupedByType() {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
