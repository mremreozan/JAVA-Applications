package merhaba018comparable;

import java.util.Collections;
import java.util.List;

//A�a��daki gibi �main� metodu i�eren bir �TestUnit� s�n�f� olu�turulur.Listenin s�ralanmadan �nceki ve sonraki dizilimi g�sterilir.

public class TestUnit {

	public static void main(String[] args) {
        
        // S�ralama yap�lmam�� olan liste a�a��daki gibidir.
        List<ArrayItem> list = new CustomArray();
        
        System.out.println("S�ralanmam�� olan liste : ");
        for (int i = 0; i < list.size(); i++) {
               ArrayItem item = list.get(i);
               System.out.println(item.getAge() + " -- " + item.getName());


        }
        
        // Liste ve Comparator s�n�f�ndan bir nesne �rne�i sort algoritmas�na parametre olarak g�nderilir.
        // Comparator, "ArrayItem" tipindeki nesneleri s�ralayacak olan s�n�ft�r.
        // K���kten b�y��e do�ru s�ralama yap�l�r.
        Collections.sort(list, new ArrayItemComparator());
        
        System.out.println();
        System.out.println();
        
        System.out.println("S�ralanm�� olan liste : ");
        for (int i = 0; i < list.size(); i++) {
               ArrayItem item = list.get(i);
               System.out.println(item.getAge() + " -- " + item.getName());
        }
	}

}
