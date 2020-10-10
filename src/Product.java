public class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String nameIn, String descriptionIn, double priceIn, String categoryNameIn, String categoryDescriptionIn){
        name = nameIn;
        description = descriptionIn;
        price = priceIn;
        category = new Category(categoryNameIn, categoryDescriptionIn);
    }

    void showProductDetails(Product productIn){
        System.out.println("Nazwa produkctu: " + productIn.name + ", cena: " + productIn.price + ", opis: "
                + productIn.description + ", kategoria i opis: " + productIn.category.nameCategory
                + " (" + productIn.category.description + ").");
    }



}
