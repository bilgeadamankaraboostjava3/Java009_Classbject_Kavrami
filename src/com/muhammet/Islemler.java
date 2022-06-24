package com.muhammet;

public class Islemler {
	
	//Java Members
	// Gözünüze bir durum çarpmalý????
	// sýnýf üyelerinin tanýmlanma zorunluluðu yoktur. çünkü default deðerler ile çalýþýrlar
	// yani. -> int sayi; // 
	int sayi1;  // 0
	double dSayi; // 0.0
	String ifade; // null
	
	int sayi3;
	int sayi4;
	
	public void yeniIslem(int s1,int s2) {
		int  sayi5 = s1;
		int sayi6 = s2;
		int toplam = sayi5 + sayi6;
	}
	
	public void ToplamSatic() {
		int toplam = sayi3 + sayi4;
	}
	
	public void Topla() {
		int toplam = sayi1 + sayi2;
	}
	
	public void ifadeDegistir() {
		ifade = "bu olsun";
	}
	public void ifadeDegistir2() {
		ifade = "ifade bu olsun";
	}
	
	
	
	
	int sayi2;
}
