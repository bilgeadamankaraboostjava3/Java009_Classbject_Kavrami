package com.muhammet;

public class Runner_Sinif {
	static Ogrenci ogrenci3; // null 
	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci();
		Ogrenci ogrenci2 = new Ogrenci();
		
		
		ogrenci1.ad = "Ahmet";
		ogrenci1.dogumTarihi = "01.05.2012";
		
		ogrenci2.ad = "Bahar";
		ogrenci2.dogumTarihi = "15.06.2012";

		ogrenci2.ad = ogrenci1.ad;
		System.out.println("2. ��renci ad...: "+ogrenci2.ad);
		
		//ogrenci2 = ogrenci1; // bu i�lemde nesne adresleri bir birine e�itlenir ve iki de�i�ken ayn� 
		// bellek adresini i�aret eder.
		
		ogrenci2.ad = "Deniz";
		
		System.out.println("1. ��renci");
		System.out.println("ad...: "+ ogrenci1.ad);
		System.out.println("veliad�...: "+ ogrenci1.veliadi);
		System.out.println("dt....: "+ ogrenci1.dogumTarihi);
		System.out.println("turkce...: "+ ogrenci1.turkceNotu);
		//System.out.println("mat...: "+ ogrenci1.MatematikNotu);
		System.out.println("----------------------------------");
		System.out.println("2. ��renci");
		System.out.println("ad...: "+ ogrenci2.ad);
		System.out.println("veliad�...: "+ ogrenci2.veliadi);
		System.out.println("dt....: "+ ogrenci2.dogumTarihi);
		System.out.println("turkce...: "+ ogrenci2.turkceNotu);
		//System.out.println("mat...: "+ ogrenci2.MatematikNotu);
		
		
		//ogrenci3.ad = "Hasan";// de�er atanmam�� (null) -> istisnaF�rlat�r.
		
	}

}
