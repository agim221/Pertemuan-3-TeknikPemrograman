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

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok; //stok menjadi private karena merupakan statemen
	public Barang(String kode, String nama, int stk) { //Consturctor untuk mengubah nilai kode_barang, nama_barang, dan stok
		kode_barang = kode;
		nama_barang = nama; 
		stok = stk;
	}
	public int getStok() { //getter stok untuk mengambil nilai variabel stok
		return stok;
	}
	public void setStok(int stok) { //setter stok untuk mengubah nilai variabel stok
		this.stok = stok;
	}
	
	
}