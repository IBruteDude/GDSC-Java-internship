import java.util.List;
import java.util.stream.Collectors;

class Exercises {
    public static void main(String[] args) {
        List<Product> dummyData = Product.addDummyData();

        // Exercise 1
        List<Product> books = dummyData
                .stream()
                .filter((Product product) -> {
                    return product.getCategory().equals("Books");
                })
                .toList();
        System.out.println("Books:\n" + books.toString());

        // Exercise 2
        List<Product> booksOver100 = dummyData
                .stream()
                .filter((Product product) -> {
                    return product.getPrice() > 100 && product.getCategory().equals("Books");
                })
                .toList();
        System.out.println("Books with price higher than 100:\n" + books.toString());

        // Exercise 3
        List<Product> toysOnSale = dummyData
                .stream()
                .filter((Product product) -> {
                    return product.getCategory().equals("Toys");
                })
                .map((Product product) -> {
                    return product.withPrice(product.getPrice() * 0.9);
                })
                .toList();
        System.out.println(books.toString());

        // Exercise 4
        List<Product> cheapestBooks = books
                .stream()
                .filter((Product product) -> {
                    return product.getCategory().equals("Toys");
                })
                .map((Product product) -> {
                    return product.withPrice(product.getPrice() * 0.9);
                })
                .toList();
        System.out.println(books.toString());
    }
}
