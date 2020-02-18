package merhaba022Serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Kisi implements Serializable {   // �imdi Kisi isimli ki�i bilgilerinin kaydedildi�i bir s�n�f olu�turuyoruz.
	                                          // bu s�n�f tipinde bir nesne olu�turaca��z.
											  // bu nesneyi serile�tirerek bir dosya �zerinde saklayaca��z.
											  // serile�tirilmi� bu nesneyi sakland��� dosyadan okuyarak elde edece�iz.
	
	private String ad;
	private String soyad;
	
	public Kisi (String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
	}
	
	public String getAd() {
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
}