package merhaba021Ccomperator;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Liste extends ArrayList<dizi> implements Serializable { // serializable de�i�kenlere ait de�erleri tekrar tekrar kullanabilmemizi sa�lar.
	
	String[] ad_listesi = {"furkan �zdemir", "emre ozan", "serdar uslu"};
	int[] yas_listesi = {33, 27, 38};
	int[] kidem_listesi = {15, 25, 20};
	
	public Liste() {
        listemiz();
	}
	
	private void listemiz() {                                  //dizi s�n�f� tipindeki nesnelerden liste yapar�z.
          for (int i = 0; i < ad_listesi.length; i++) {
                 String ismin = ad_listesi[i];
                 int yasin = yas_listesi[i];
                 int kidemin = kidem_listesi[i];
                 dizi item = new dizi();
                 item.setIsim(ismin);
                 item.setYas(yasin);
                 item.setKidem(kidemin);
                 super.add(item);
          }
    }
}
