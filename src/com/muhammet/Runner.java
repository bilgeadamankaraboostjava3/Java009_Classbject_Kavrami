package com.muhammet;

public class Runner {

	public static void main(String[] args) {
		
		// package -> Java Paketleri
		// MonolitikMimari
		
		// Deðiþken tanýmlama
		int sayi;
		
		// Deðiþken Tanýmlama
		Islemler islemler;
		
		// 1. yol
		//         nesne tanýmlanýr. bu iþlem bellekte heap alanýnda atama yapar. 
		islemler = new Islemler();	
		
		int sayi2 = 5;
		
		islemler.sayi2 = sayi2;
		//2. yol
		Islemler islemler2 = new Islemler();
		islemler2 = islemler;
		islemler.sayi1 = 5;
		System.out.println("iþlemler->sayi1...: "+islemler.sayi1);
		System.out.println("iþlemler2->sayi1..: "+islemler2.sayi1);
		
	}

}
