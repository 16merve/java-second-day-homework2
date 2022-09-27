package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Product product1 = new Product();
		// set value değer atamak
		product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(4);
        product1.setUnitPrice(3500);
		product1.setUnitsInstock(5);
		product1.setImageUrl("image1.jpg");
		Product product2 = new Product();
		// set value değer atamak
		product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(3);
        product2.setUnitPrice(4500);
		product2.setUnitsInstock(2);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
		product3.setUnitsInstock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+ product.getName() + "<li>");
		}
		System.out.println("<ul>");
		
	   IndividualCustomer individualCustomer = new IndividualCustomer();
	   individualCustomer.setId(1);
	   individualCustomer.setPhone("055594739992");
	   individualCustomer.setCustomerNumber("2345");
	   individualCustomer.setFirstName("Merve");
	   individualCustomer.setLastName("Alemgir");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05443569843");
		corporateCustomer.setTaxNumber("1111111");
		corporateCustomer.setCustomerNumber("54321");
		
	
		
		
	}

}
