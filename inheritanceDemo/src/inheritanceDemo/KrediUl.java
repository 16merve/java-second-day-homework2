package inheritanceDemo;

public class KrediUl {
public void KrediHesapla(BaseKrediManager baseKrediManager) {
	//base temel olduğu için mainde öğretmen kredi ve tarım kredi de olsa kod çalışır.Çünkü extends yaptığımız için.
	baseKrediManager.Hesapla();
}
}
