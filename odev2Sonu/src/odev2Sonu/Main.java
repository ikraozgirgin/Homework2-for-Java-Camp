package odev2Sonu;

public class Main {

	public static void main(String[] args) {
	int sonuc =islem(2, 5);
	String sehir = sehirEkle();
	System.out.println(sehir);
	System.out.println(sonuc);
	
	int sonuc2 = topla2(2, 3, 4 , 5, 6, 10);
	System.out.println(sonuc2);
	
	int[] numbers1 = {1, 2, 3};
	int[] numbers2 = {4, 5, 6};
	
	numbers2 = numbers1;
	numbers1[0]=10;
	System.out.println(numbers2[0]);
	
	DortIslem dortIslem = new DortIslem();
	int sonuc1 = dortIslem.Bol(15,5);
	System.out.println(sonuc1);

		Product product1  = new Product(1, "Laptop", "Asus",5000);
		String kod = product1.getKod();
		System.out.println(kod);
		
	}
	
	public static int islem(int sayi1, int sayi2) {
		return sayi1*sayi1 +sayi2;
	}
	
	public static String sehirEkle() {
		return "Ankara";
	}
	
	
	public static int topla2(int... sayilar) {
		 
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam+=sayi;

		}
		return toplam;
	}
	
	

	
	
}
