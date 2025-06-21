package ecom.commerce.platform.search;

public class EcommerceSearchDemo {
    public static void main(String[] args) {
        // Creating sample product array
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Watch", "Accessories")
        };

        String searchItem = "Shoes";

        // Run Linear Search
        int linearResult = LinearSearch.search(products, searchItem);
        System.out.println("Linear Search: Found at index " + linearResult);

        // Run Binary Search
        int binaryResult = BinarySearch.search(products, searchItem);
        System.out.println("Binary Search: Found at index " + binaryResult);
    }
}
