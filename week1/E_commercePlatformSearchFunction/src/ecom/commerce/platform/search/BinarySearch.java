package ecom.commerce.platform.search;


import java.util.Arrays;

public class BinarySearch {
    public static int search(Product[] products, String targetName) {
        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));

        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = products[mid].productName.compareToIgnoreCase(targetName);

            if (result == 0) return mid;
            if (result < 0) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}