package methods;

public class Main {  //Amaç aynı komutları diğer sekmelerde tekrar yazmakla uğraşmamak

	public static void main(String[] args) {
		sayiBulma();
		sayiBulma();
		sayiBulma();
		sayiBulma();
		
	}
    public static void sayiBulma() {
    	int[] sayilar = new int[] {4,6,9,11,50};
		int aranacak = 4;
		boolean mevcutMi = false;
		for (int sayi : sayilar) {
			if (sayi==aranacak) {
			mevcutMi=true;
			break;
			}
	
		}
		String mesaj = "";
		if (mevcutMi) {
			mesaj = "Sayı mevcuttur:"+aranacak;
			mesajVer(mesaj);
		} else {
			System.out.println("Sayı mevcut değildir:"+aranacak);
		}
		
    	
    }
    public static void mesajVer(String mesaj) {//Amaç system out kodunu tekrar yazmamak
    	//Parametreli metod
    	
    	System.out.println(mesaj);
    	
    	
    	
    	
    	
    }
}
