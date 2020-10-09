public class Test {
    public static void main(String[] args) {
        // 2 produkcty które są przypisane do takiej samej kategorii
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();

        product1.name = "jogurt naturalny";
        product1.description = "Z mleka od słowiańskich krów";
        product1.price = 1.33;
        product1.category.nameCategory = "mleczne";
        product1.category.description = "naturalne odzwierzęce";

        product2.name = "Kwaśne mleko";
        product2.description = "Długo odstane";
        product2.price = 2.59;
        product2.category.nameCategory = product1.category.nameCategory;
        product2.category.description = product1.category.description;

        product3.name = "Sok marchewkowo-jabłkowy 1L";
        product3.description = "Polskie jabłka i Rumuńska marchewka";
        product3.price = 5.66;
        product3.category.nameCategory = "Soki";
        product3.category.description = "Wyciskane mechanicznie";

        product4.name = "Soja 1kg";
        product4.description = "Bez GMO";
        product4.price = 12.99;

        SpecialOffer specialOffer = new SpecialOffer();
        specialOffer.product = product3;
        specialOffer.dateStart = "2020.10.11";
        specialOffer.dateStart = "2020.10.12";
        specialOffer.discount = 0.20;
        specialOffer.offerDescription = "Promocja świąteczna";

        product1.showProductDetails(product1);
        product1.showProductDetails(product2);
        product1.showProductDetails(product3);
        product1.showProductDetails(product4);






    }



}
