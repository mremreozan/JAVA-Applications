package merhaba021Ccomperator;

import java.util.Comparator;

public class kidemkars�lasat�rma implements Comparator<dizi> {

	public int compare(dizi row1, dizi row2) {

		return row1.getKidem() > row2.getKidem() ? 1 : -1;     // k�dem baz�nda kar��la�t�rma
	}
}
