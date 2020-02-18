package merhaba040mergesort;

public class mergesort {
	 public int [] mergesort(int [] m)
	   {

	     int x=0;
	     int y=0;
	     int middle=m.length/2;
	     int left[] =new int [middle];
	     int right[] =new int [middle];
	     int result[] =new int[(m.length)];

	     if(m.length<= 1){
	       return m;
	     }

	     for(int i=0; i<middle; i++)
	     {
	       left[x]=m[i];
	       x++;
	     }
	     for(int i=middle; i<m.length; i++)
	     {
	       right[y]=m[i];
	       y++;
	     }
	     left=mergesort(left);
	     right=mergesort(right);
	     result=merge(left,right);
	     return result;
	   }
	 
/* Yukar�daki bu fonksiyon dikkat edilirse �zyinelemeli (recursive) bir kod olup paramatre olarak ald��� dizinin yan�nda bu dizi boyutunun 
 * yar�s� uzunlu�unda iki ilave dizi kullanm�� ve bu dizilere iki par�ay� ayr� ayr� koyarak yine s�ralamas� i�in kendi fonksiyonuna 
 * parametre olarak ge�irmi�tir. Sonda ise bu iki par�ay� birle�tiren bir merge() fonksiyonu �a��rm��t�r. 
 * ��te bu birle�tirme fonksiyonunun kodu a�a��da verilmi�tir:*/
	 
/*Yukar�daki kodun bir problemi, s�ralama i�lemi s�ras�nda 2 ve �zeri say�daki elemanl� dizileri kabul ediyor olmas�d�r. 
 * �rne�in 2,4,8,16 gibi eleman say�lar�ndaki diziyi kabul eder. Bunun sebebi, s�ralama fonksiyonuna gelen dizinin her durumda iki 
 * e�it par�aya b�l�nmesidir. Oysaki tek eleman say�s�na sahip dizilerde, b�l�nme sonucunda sorun ��kar. �rne�in 3 elemanl� bir diziyi 
 * iki par�aya b�ld���m�zde biri 2 di�eri 1 elemanl� iki dizi elde etmemiz gerekir.*/
	 
	 public int [] merge(int []left,int []right)
	 {
	   int result[] =new int [left.length + right.length];

	     int x=0;
	     int y=0;
	     int k=0;

	   while(left.length>x && right.length>y)

	   {

	     if(left[x] <= right[y])

	     {

	       result[k]=left[x];
	       x++;
	       k++;

	     }

	     else

	      {
	        result[k]=right[y];
	        y++;
	        k++;

	      }
	   }

	   if(left.length>x)

	   {
	     while(x < left.length)

	     {

	     result[k]=left[x];
	     x++;
	     k++;

	     }
	   }

	   if(right.length>y)

	   {
	     while(y < right.length)

	     {

	     result[k]=right[y];
	     y++;
	     k++;

	     }
	   }
	   return result;
	 }
	 
	 /*Yukar�daki koda dikkat edilecek olursa 3 ayr� durum i�in birle�tirme kodu yaz�lm��t�r:
Birinci durumda iki dizide de eleman bulunmaktad�r. Bu durumda iki dizideki en ba�taki say�lar kar��la�t�r�larak k���k olan sonu� dizisine 
kopyalanmaktad�r. �kinci ve ���nc� durumlarda ise dizilerden birisinde eleman kalmam��t�r. Bu durumlarda eleman kalan dizideki elemanlar 
do�rudan sonu� dizisine kopyalanabilir.*/
	 
	 

}
