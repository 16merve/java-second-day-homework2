package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product(id:1, name:"Laptop, description:"Asus Laptop", price:3000, stockAmount:2, renk:"Siyah") 
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.getId();
		//ilk yorum satırındaki tanımlama ile yukarıdaki tanımlama aynı sonucu verir. Ama product projesinde this. ile tanımlama yapmamız gerekiyor.
		//(Constracter)denir.
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		//System.out.println(product.name);
		
		System.out.println(product.getKod());
	}

}
