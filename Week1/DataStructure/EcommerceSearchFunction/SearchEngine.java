public class SearchEngine {

    /**
     * Performs a linear search on the unsorted product array.
     * Best Case: O(1) - First element is the match
     * Average/Worst Case: O(n)
     */
    public static int linearSearch(Product[] products, String targetName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(targetName)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs binary search on a sorted array of products by name.
     * Best/Average/Worst Case: O(log n)
     */
    public static int binarySearch(Product[] sortedProducts, String targetName) {
        int left = 0, right = sortedProducts.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = sortedProducts[mid].getProductName().compareToIgnoreCase(targetName);

            if (compare == 0) return mid;
            if (compare < 0) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}
