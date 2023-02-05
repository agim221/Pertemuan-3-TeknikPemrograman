package Pertemuan3;

/**
 * Studi Kasus3 : Barang & Inventory
 * Dalam studi kasus ini kita mempelejari tentang encapsulation sebuah statemen di dalam sebuah class
 * dan menggunakan getter dan setter untuk melihat dan mengedit statemen statemen tersebut..
 * 
 * @author muhamad agim
 *@since 5-2-2023
 *@version 1.0
 */

public class Inventory {
	Barang[] barangs;
	void initBarang() {
		barangs = new Barang[2];
		barangs[0] = new Barang("001", "Baju", 10); //membuang Barang di index array pertama
		barangs[1] = new Barang("002", "Celana", 20); //membuat barang di index array kedua
	}
	void showBarang() {//menampilkan stok yang ada
		System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")"); 
		System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}
	void pengadaan() {
		initBarang();
		barangs[0].setStok(barangs[0].getStok() + 20); //proses penambahan stok
		showBarang();
	}
	public static void main(String[] args) { 
		Inventory beli = new Inventory(); 
		beli.pengadaan();
	}
}