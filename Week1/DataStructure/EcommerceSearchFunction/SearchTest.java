import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {
    public static void main(String[] args) {
        Product[] productList = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Smartphone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Notebook", "Stationery"),
            new Product(105, "Backpack", "Accessories")
        };

        String target = "Shoes";

        System.out.println("Linear Search on Unsorted List:");
        int linearIndex = SearchEngine.linearSearch(productList, target);
        if (linearIndex != -1) {
            System.out.println("Product found: " + productList[linearIndex]);
        } else {
            System.out.println("Product not found.");
        }

        // Sort products for binary search
        Product[] sortedList = Arrays.copyOf(productList, productList.length);
        Arrays.sort(sortedList, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));

        System.out.println("\nBinary Search on Sorted List:");
        int binaryIndex = SearchEngine.binarySearch(sortedList, target);
        if (binaryIndex != -1) {
            System.out.println("Product found: " + sortedList[binaryIndex]);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\nAnalysis:");
        System.out.println("- Linear Search: O(n), suitable for small datasets.");
        System.out.println("- Binary Search: O(log n), much faster but requires sorted data.");
        System.out.println("- Binary Search is preferred for large catalogs due to speed.");
    }
}
