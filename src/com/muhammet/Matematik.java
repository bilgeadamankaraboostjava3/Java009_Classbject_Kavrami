package com.muhammet;

public class Matematik {
	
	int s1,s2,s3;
	/**
	 * 0-> kullanýcý yeni kayýt olmuþtur. aktif edilmeli
	 * 1-> aktif kullanýcý
	 * 2-> engellenmiþ 
	 * 3-> askýya alýnmýþ hesap
	 * -1-> silinmiþ kayýt.
	 */
	int durum;
	
	/**
	 * Bu method, parantezleri içinde verilen tam sayý tipindeki sayýlarý 
	 * toplayarak ekrana yazdýrýr.
	 * @param sayilar -> int türünde sayý girmelisiniz. ve sayýlar arasýnda , kullanmalýsýnýz.
	 */
	public void Topla(int... sayilar) { //
		int toplam=0;
		for(int sayi : sayilar) // 1,5,9,11			
			toplam += sayi;
		System.out.println("girilen sayýlarýn toplamý...: "+ toplam);
	}

	/**
	 * 
	 * @param sayilar
	 * @return -> double sayýlarýn toplamýný double tipinde geriye döner
	 */
	public double Topla(double... sayilar) {
		int toplam =0;
		for(double sayi : sayilar)
			toplam += sayi;
		return toplam;
	}
	
	public void Cikart(int... sayilar) {
		int fark=0;
		for(int sayi : sayilar)
			fark -= sayi;
		System.out.println("tüm sayýlarý farký....: "+ fark);
	}
	
	
	public Matematik yeniMatematikNesnesi() {
		return new Matematik();
	}
	
}
