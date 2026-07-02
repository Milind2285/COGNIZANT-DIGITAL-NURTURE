public class EcommerceSearch {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };

        System.out.println("Linear Search:");

        Product result1 = Search.linearSearch(products, "Watch");

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product not found");

        System.out.println();

        System.out.println("Binary Search:");

        Product result2 = Search.binarySearch(products, "Watch");

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product not found");
    }
}