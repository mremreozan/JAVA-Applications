package merhaba022Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Yaz {

	public static void main(String[] args) {

		try {
			Kisi kisi = new Kisi("emre", "ozan" );                            // Kisi  s�n�f� tipinde bir nesne olu�turduk.
			FileOutputStream dosya = new FileOutputStream("C:\\metin.txt");   // dosya m�z� olu�turduk.
			ObjectOutputStream yaz = new ObjectOutputStream(dosya);           // serile�tirme i�in nesneyi olu�turduk.
			yaz.writeObject(kisi);                                            // nesnemizi dosyaya yazd�k, serile�tirme ger�ekle�tirildi.
			yaz.close();                                                      // stream i kapatt�k, asl�nda bu stream i bir finally blo�unda kapatmak daha iyi olur.
			System.out.println("Process ends .....");
		}
		catch (Exception e) {
			System.out.println("Error in Serialization process\n"+e.getMessage());
		}
	}

}
