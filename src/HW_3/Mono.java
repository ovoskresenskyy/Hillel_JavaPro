package HW_3;

public class Mono {

    private final double deposit;
    private final User user;
    private static final int ONE_YEAR_PERCENT = 12;
    private static final int FIVE_YEARS_PERCENT = 15;
    private static final int TEN_YEARS_PERCENT = 17;

    public Mono(User user, double deposit) {
        this.deposit = deposit;
        this.user = user;
    }

    public void printReport() {
        System.out.println("Hello " + user.toString());
        System.out.println("Your deposit: " + deposit);
        System.out.println("Profit for your deposit:");
        System.out.println("1 year: " + getProfit(1));
        System.out.println("5 years: " + getProfit(5));
        System.out.println("10 years: " + getProfit(10));
    }

    private String getProfit(int years) {
        double profit = deposit;
        double percent = getPercent(years);
        for (int i = 0; i < years; i++) {
            profit += profit * percent / 100;
        }
        return String.format("%.2f", profit);
    }

    private int getPercent(int years) {
        return switch (years) {
            case 1 -> ONE_YEAR_PERCENT;
            case 5 -> FIVE_YEARS_PERCENT;
            case 10 -> TEN_YEARS_PERCENT;
            default -> 0;
        };
    }
}
