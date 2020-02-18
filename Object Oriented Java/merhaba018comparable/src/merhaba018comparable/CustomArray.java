package merhaba018comparable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/*
�CustomArray� s�n�f ise �ArrayItem� tipindeki nesneleri tutacak olan s�n�ft�r. Bu s�n�f �ArrayList� s�n�f�ndan kal�t�m alm��t�r. 
B�ylece �CustomArray� s�n�f�na Collection �zelli�i kazand�r�lm��t�r.
*/
	@SuppressWarnings("serial")
	public class CustomArray extends ArrayList<ArrayItem> implements Serializable{
	 
	       private String[] nameList = {"Ali", "Mehmet", "Ahmet", "Veli", "Hasan", "Ay�e", "Fatma", "Zeynep", "Emine", "G�ls�m", "Jale"};
	       
	       public CustomArray() {
	             createDemoList();
	       }
	       
	       // Random olarak "ArrayItem" tipinde nesnelerden olu�an bir liste haz�rlan�r.
	       // Haz�rlanm�� olan liste Comparable s�n�f yard�m�yla k���kten b�y��e s�ralanacakt�r.
	       // "createDemoList" metodu sadece s�n�f i�inde kullan�laca�� i�in "private" olarak yaz�lm��t�r.
	       private void createDemoList() {
	             Random rnd = new Random();
	             for (int i = 0; i < nameList.length; i++) {
	                    String name = nameList[i];
	                    ArrayItem item = new ArrayItem();
	                    item.setName(name);
	                    item.setAge(rnd.nextInt(1000));
	                    super.add(item);
	             }
	       }
	       
	       // ArrayItem tipinde nesne eklemek i�in haz�rlanm�� olan metod tan�m�d�r.
	       // "super" anahtar kelimesi ile kal�t�m ald��� "ArrayList" s�n�f�n�n "add" metodunu �al��t�r�r.
	       public void addItem(ArrayItem item) {
	             super.add(item);
	       }
	       
	       // ArrayItem tipinde nesne almak i�in haz�rlanm�� olan metod tan�m�d�r.
	       // "super" anahtar kelimesi ile kal�t�m ald��� "ArrayList" s�n�f�n�n "get(index)" metodunu �al��t�r�r.
	       public ArrayItem getItem(int index) {
	             return super.get(index);
	       }
	       
	       // ArrayItem tipinde bir dizi olu�turmak i�in haz�rlanm��t�r.
	       public ArrayItem[] getArray() {
	             return super.toArray(new ArrayItem[0]);
	       }
	}

	