package methods2;

public class Main {

	public static void main(String[] args) {
    String mesaj = "Bugün hava çok güzel.";
    //String yeniMesaj = mesaj.substring(0,2);
    String yeniMesaj = sehirVer();  //Aynı fonksiyonlar birbiri üzerine tanımlanır.
    //Mesela string ile int tanımlanamaz.
    System.out.println(yeniMesaj);
    int sayi = topla(5,7); //sayi1 ve sayi2 ye ne atarsam onları toplayıp çıkartır.
    System.out.println(sayi);
    
    int toplam = topla2(2,3,4,5,6,10);
    System.out.println(toplam);
	}
   public static void ekle() {
	System.out.println("Eklendi.");   
	   
   }
   public static void sil() {
	System.out.println("Silindi.");
   }
   public static void guncelle() {
   System.out.println("Güncellendi."); 
	   
   }
   public static int topla(int sayi1, int sayi2) {
	return sayi1+sayi2;  // return döndür yani sayi1 ve sayi 2 yi toplayıp döndür.
	   
   }
   
   public static int topla2(int... sayilar) {
	int toplam =0;
	for(int sayi:sayilar) {
	toplam+=sayi;
	}
	return toplam;  //yukarıda tanımlanan toplam değişkenindeki sayılara dönerek toplama yapar. 
   }
   
   public static String sehirVer() {
	   
   return "Ankara" ;  //Ankarayı döndür.
	  
   }
}
