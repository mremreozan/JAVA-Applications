package merhaba018comparable;

import java.util.Comparator;

//�ArrayItemComparator� s�n�f�  �ArrayItem� tipindeki nesneleri �age� alan�na bakarak, k���kten b�y��e do�ru s�ralayacakt�r.

public class ArrayItemComparator implements Comparator<ArrayItem>{
	@Override
    public int compare(ArrayItem arg0, ArrayItem arg1) {
          // �lk parametrede gelen ya� de�eri, ikincisinden b�y�kse 1 de�eri, k���kse -1 de�eri d�nd�r�l�r.
          // Comparator s�n�f�n�n �al��ma mant��� 1,0,-1 de�erlerine bak�larak yap�l�r.
          /*
           *   1 de�eri arg0 > arg1 'den b�y�k oldu�unu belirtir.
           *   0 de�eri arg0 == arg1 ile e�it de�erde oldu�unu belirtir.
           *   -1 de�eri arg0 < arg1 'den k���k oldu�unu belirtir.
           */
          return arg0.getAge() > arg1.getAge() ? 1 : -1;

	}
}
