package re.edu.medipol.yogva;

public class hesaplamalar {
	
	public static int faktoriyel(int n) {
		if(n == 1) return 1;
		return n * faktoriyel(n-1);
	}
	
	public static int faktoriyelloop(int n) {
		int sonuc =1;
		for(int i=n; i>1; i--) {
			sonuc = sonuc * i;
		}
		return sonuc;
	}
	
	public static int topla(int sayi1, int sayi2) {
		int sonuc = sayi1 + sayi2;
		return sonuc;
	}
	
	public static int cikart(int sayi1, int sayi2) {
		int sonuc = sayi1 - sayi2;
		return sonuc;
	}
	
	public static int carp(int sayi1, int sayi2) {
		int sonuc = sayi1 * sayi2;
		return sonuc;
	}
}
