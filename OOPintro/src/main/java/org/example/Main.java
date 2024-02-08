package org.example;

import org.example.entities.*;

public class Main {
    public static void main(String[] args) {

        /* int sayi1= 10;
        int sayi2= 20;
        sayi1 = sayi2;
        sayi2 = 100;

         */
        /*

        int[] sayilar1 = new[] {1, 2, 3};
        int[] sayilar2 = new[] {10, 20, 30};
        sayilar1=sayilar2;

        sayilar2[0] = 1000;

         */
        /*
        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();
        customer.id = 1;
        customer.City = "Ankara";


        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.TaxNumber = "10000";
        company.CompanyName = "Arçelik";
        company.id = 100;

        CustomerManager customerManager2 = new CustomerManager(new Person()  );
        Person person = new Person();
        person.FirstName =
        person.NationalIdendity = "";

        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();

         */
// IoC Container - araştır
CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
customerManager.GiveCredit();




    }
}