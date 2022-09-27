package classesWithAttributes;

public class Product {
	public Product(){
		System.out.println("Yapıcı blok çalıştı.");
	}
	//this.id=id;
	//this.renk=renk;
	//this.name=name;
	//this.price=price;
	//this.description=description;
	//this.stockAmount=stockAmount;
	//Yukarıdaki şekilde tanımlamamız gerekiyor.(Constracter için gerekli)Buna overload yani aşırı yükleme denir.
	//attribute | field
private int id;//ürünü tanımlayan eşsiz değer demektir.(TC kimlik no gibi)
String name;
String description;
double price;
int stockAmount;
String renk;
String kod;

//getter
public int getId() {//id okur yazamaz.
	return id;
}
//setter
public void setId(int id) {//set komutunda id yi oluşturacağımız için ()içinde id nin hangi tür olduğunu oluşturmamız gerek.
	//this.id=id;//this içerisinde bulunduğum class demek id ler karışmasın diye
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
public int getStockAmount() {
	return stockAmount;
}
public void setStockAmount(int stockAmount) {
	this.stockAmount = stockAmount;
}
public String getRenk() {
	return renk;
}
public void setRenk(String renk) {
	this.renk = renk;
}
public String getKod() {
	return this.name.substring(0,1)+ id;
}


}
