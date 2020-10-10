public class Test {
    public static void main(String[] args) {
        // 2 produkcty które są przypisane do takiej samej kategorii
        Product product1 = new Product("jogurt naturalny","Z mleka od słowiańskich krów", 1.33,
                "mleczne", "Z mleka od słowiańskich krów");
        Product product2 = new Product("Kwaśne mleko", "Długo odstane", 2.59,
                product1.category.nameCategory, product1.category.description);
        Product product3 = new Product("Sok marchewkowo-jabłkowy 1L","Polskie jabłka i Rumuńska marchewka",
                5.66,"Soki", "Wyciskane mechanicznie");
        Product product4 = new Product("Soja 1kg","Bez GMO",12.99,null,null);

        SpecialOffer specialOffer = new SpecialOffer(product4, "Promocja świąteczna",
                "2020.10.11", "2020.10.12",  0.20);

        product1.showProductDetails(product1);
        product1.showProductDetails(product2);
        product1.showProductDetails(product3);
        product1.showProductDetails(product4);
        specialOffer.showSpecialOffers(specialOffer);







    }



}
