public class CoffeeShopAnalyzer {
    public static void main(String[] args) {

        // PART 1: Set up the arrays (parallel: same index = same day)
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};

        // PART 2: Print each day's sales
        System.out.println("--- Daily Sales ---");
        for (int i = 0; i < weeklySales.length; i++) {
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
        }

        // PART 3: Total and average
        int totalSales = 0;
        for (int dailySale : weeklySales) {
            totalSales += dailySale;          // add each day to the running total
        }
        // (double) prevents integer division from cutting off the decimals
        double averageSales = (double) totalSales / weeklySales.length;

        System.out.println("\n--- Weekly Summary ---");
        System.out.println("Total Sales: " + totalSales + " cups");
        System.out.println("Average Daily Sales: " + averageSales + " cups");

        // PART 4 + BONUS: Best (max) and worst (min) day
        int maxSales = weeklySales[0];        // start with the first day
        int minSales = weeklySales[0];
        String bestDay = daysOfWeek[0];
        String worstDay = daysOfWeek[0];

        for (int i = 1; i < weeklySales.length; i++) {   // start at 1: index 0 is already used
            if (weeklySales[i] > maxSales) {  // new highest?
                maxSales = weeklySales[i];
                bestDay = daysOfWeek[i];
            }
            if (weeklySales[i] < minSales) {  // new lowest?
                minSales = weeklySales[i];
                worstDay = daysOfWeek[i];
            }
        }

        System.out.println("\n--- Bests and Worsts ---");
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");
    }
}
