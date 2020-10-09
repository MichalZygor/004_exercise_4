public class Product {
    String name;
    double price;
    String description;
    Category category = new Category();


    void showProductDetails(Product productIn){
        System.out.println("Nazwa produkctu: " + productIn.name + ", cena: " + productIn.price + ", opis: "
                + productIn.description + ", kategoria i opis: " + productIn.category.nameCategory
                + " (" + productIn.category.description + ").");
    }
}
