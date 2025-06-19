public class SortTest {

    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Asha", 1500.50),
            new Order(102, "Ravi", 3200.00),
            new Order(103, "Neha", 990.99),
            new Order(104, "Kabir", 4500.75),
            new Order(105, "Tina", 1800.20)
        };

        System.out.println("Original Orders:");
        for (Order o : orders) {
            System.out.println(o);
        }

        System.out.println("\nSorted by Bubble Sort:");
        SortAlgorithms.bubbleSort(orders);
        for (Order o : orders) {
            System.out.println(o);
        }


        orders = new Order[] {
            new Order(101, "Asha", 1500.50),
            new Order(102, "Ravi", 3200.00),
            new Order(103, "Neha", 990.99),
            new Order(104, "Kabir", 4500.75),
            new Order(105, "Tina", 1800.20)
        };

        System.out.println("\nSorted by Quick Sort:");
        SortAlgorithms.quickSort(orders, 0, orders.length - 1);
        for (Order o : orders) {
            System.out.println(o);
        }

        System.out.println("\nAnalysis:");
        System.out.println("- Bubble Sort is simple but slow: O(n^2) time.");
        System.out.println("- Quick Sort is efficient: O(n log n) average, but worst case O(n^2).");
        System.out.println("- Quick Sort is usually preferred in practice due to better performance.");
    }
}
