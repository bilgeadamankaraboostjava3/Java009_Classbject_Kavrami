package com.muhammet;

public class Runner {

	public static void main(String[] args) {
		
		// package -> Java Paketleri
		// MonolitikMimari
		
		// De�i�ken tan�mlama
		int sayi;
		
		// De�i�ken Tan�mlama
		Islemler islemler;
		
		// 1. yol
		//         nesne tan�mlan�r. bu i�lem bellekte heap alan�nda atama yapar. 
		islemler = new Islemler();	
		
		int sayi2 = 5;
		
		islemler.sayi2 = sayi2;
		//2. yol
		Islemler islemler2 = new Islemler();
		islemler2 = islemler;
		islemler.sayi1 = 5;
		System.out.println("i�lemler->sayi1...: "+islemler.sayi1);
		System.out.println("i�lemler2->sayi1..: "+islemler2.sayi1);
		
	}

}
