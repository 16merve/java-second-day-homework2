package methodOverloading;

public class DortIslem {
public int topla(int sayi1,int sayi2) {
	return sayi1+sayi2;	
}

public int topla(int sayi1,int sayi2,int sayi3) {
	return sayi1+sayi2;//sayi3 eklememe gerek yok çünkü ikisininde parametrelerinin farklı olması üste 2 sayı topla diyor burada ise 3 sayı topla diyor Buna overloading denir.
}
	
	
}
