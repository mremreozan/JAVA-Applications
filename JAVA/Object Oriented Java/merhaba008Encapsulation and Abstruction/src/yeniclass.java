
public class yeniclass extends insan {
	
	void deneme() {           // burada public yazd���m�zda hata veriyor, ��nk� fonksiiyonun return type'�n� yazmam���z.
		boy=180;                   // boy inheritance ile bize geldi. gelen bu bilgiye de�er verebiliyoruz.
		System.out.println(boy);
	}
	
	public static void main(String[] args) {
		yeniclass veli =new yeniclass();
		veli.deneme();
	}

}
