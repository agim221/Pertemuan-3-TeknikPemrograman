package Pertemuan3;

/**
 * Studi Kasus 2 : UpinIpin
 * Dalam studi kasus ini kita mempelajari cara penggunaan this() untuk memanggil sebuah constructor
 * di dalam sebuah class
 * 
 * @author muhamad agim
 * @since 5-2-2023
 *	@version 1.0
 *
 */

public class Item {
	private String name;
	private Item() {
		name = "Ipin";
	}
	public Item(String name) {
		this();  //proses pemanggilan constructor dengan parameter sehingga nama di isi oleh kata ipin
		System.out.println(this.name);
	}
}
