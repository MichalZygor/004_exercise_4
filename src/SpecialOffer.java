public class SpecialOffer {
    String offerDescription;
    String dateStart;
    String dateEnd;
    double discount;
    Product product;


    SpecialOffer(Product productIn, String offerDescriptionIn, String dateStartIn, String dateEndIn, double discountIn){
        offerDescription = offerDescriptionIn;
        dateStart = dateStartIn;
        dateEnd = dateEndIn;
        discount = discountIn;
        product = new Product(productIn.name, productIn.description, productIn.price, productIn.category.nameCategory,
                productIn.category.description);
    }

    void showSpecialOffers(SpecialOffer specialOfferIn){
        System.out.println("Opis promocji: " + specialOfferIn.offerDescription + ", czas trwania od: "
                + specialOfferIn.dateStart + " do " + specialOfferIn.dateEnd + ", przecenia od kwoty standardowej to "
                + specialOfferIn.discount * 100 + "%");
        System.out.println("Nazwa produkctu: " + specialOfferIn.product.name + ", cena: " + specialOfferIn.product.price * (1-specialOfferIn.discount ) + ", opis: "
                + specialOfferIn.product.description + ", kategoria i opis: " + specialOfferIn.product.category.nameCategory
                + " (" + specialOfferIn.product.category.description + ").");

    }

}
