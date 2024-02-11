package org.example;

public class Main {

    public static void main(String[] args) {


        Product produc1 = new Product();
        produc1.setName("Delonghi Kahve Makinesi");
        produc1.setDiscount(7);
        produc1.setUnitPrice(7500);
        produc1.setUnitsInStock(3);
        produc1.setImageUrl("image1.jpg");

        Product produc2 = new Product();
        produc2.setName("Smeg Kahve Makinesi");
        produc2.setDiscount(7);
        produc2.setUnitPrice(7500);
        produc2.setUnitsInStock(3);
        produc2.setImageUrl("image2.jpg");

        Product produc3 = new Product();
        produc3.setName("Kitchen Aid Kahve Makinesi");
        produc3.setDiscount(7);
        produc3.setUnitPrice(7500);
        produc3.setUnitsInStock(3);
        produc3.setImageUrl("image3.jpg");

        Product[] products = {produc1,produc2,produc3};

        System.out.println("<ul>");
        for (Product product: products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0522222222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiroğ");

        CorparateCustomer corparateCustomer = new CorparateCustomer();
        corparateCustomer.setId(2);
        corparateCustomer.setCompanyName("Kodlama.io");
        corparateCustomer.setPhone("0533333333");
        corparateCustomer.setTaxNumber("11111111");
        corparateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corparateCustomer};






    }
}