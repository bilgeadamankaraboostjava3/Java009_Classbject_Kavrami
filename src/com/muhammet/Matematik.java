package com.muhammet;

public class Matematik {
	
	int s1,s2,s3;
	/**
	 * 0-> kullan�c� yeni kay�t olmu�tur. aktif edilmeli
	 * 1-> aktif kullan�c�
	 * 2-> engellenmi� 
	 * 3-> ask�ya al�nm�� hesap
	 * -1-> silinmi� kay�t.
	 */
	int durum;
	
	/**
	 * Bu method, parantezleri i�inde verilen tam say� tipindeki say�lar� 
	 * toplayarak ekrana yazd�r�r.
	 * @param sayilar -> int t�r�nde say� girmelisiniz. ve say�lar aras�nda , kullanmal�s�n�z.
	 */
	public void Topla(int... sayilar) { //
		int toplam=0;
		for(int sayi : sayilar) // 1,5,9,11			
			toplam += sayi;
		System.out.println("girilen say�lar�n toplam�...: "+ toplam);
	}

	/**
	 * 
	 * @param sayilar
	 * @return -> double say�lar�n toplam�n� double tipinde geriye d�ner
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
		System.out.println("t�m say�lar� fark�....: "+ fark);
	}
	
	
	public Matematik yeniMatematikNesnesi() {
		return new Matematik();
	}
	
}
