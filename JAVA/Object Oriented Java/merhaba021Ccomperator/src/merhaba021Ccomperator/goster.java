package merhaba021Ccomperator;

import java.util.Collections;
import java.util.List;

public class goster {

	public static void main(String[] args) {
 
		List<dizi> hamliste = new Liste();
        
        System.out.println("S�ralanmam�� olan liste : ");
        for (int i = 0; i < hamliste.size(); i++) {
               dizi item = hamliste.get(i);
               System.out.println(item.getYas() + " -- " + item.getIsim()+" -- "+ item.getKidem());
	    }
        
        
        Collections.sort(hamliste, new yasikars�last�r());  // hamliste yi al kars�last�r s�n�f�na (bu s�n�fta yas kas��la�t�rmas� vard�r.) sok.
        
        System.out.println("Ya�a g�re s�ral� olan liste : ");
        for (int i = 0; i < hamliste.size(); i++) {
               dizi item = hamliste.get(i);
               System.out.println(item.getYas() + " -- " + item.getIsim()+" -- "+ item.getKidem());
        }
        
        Collections.sort(hamliste, new kidemkars�lasat�rma());  // hamliste yi al kidemkars�lasat�rma s�n�f�na sok.
        
        System.out.println("K�deme g�re s�ral� olan liste : ");
        for (int i = 0; i < hamliste.size(); i++) {
               dizi item = hamliste.get(i);
               System.out.println(item.getYas() + " -- " + item.getIsim()+" -- "+ item.getKidem());
        }
        
	}

}
