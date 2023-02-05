package Pertemuan3;

/**
 * Studi Kasus 3
 * Dalam studi kasus ini kita mempelajari tentang urutan eksekusi static block, no-static block
 * dan constructor, cara kerja static block, dan juga perbedaan consructor yang ada parameternya
 * dan tidak ada parameternya
 * @author muhamad agim
 * @since 02-05-2023
 * @version 1.0
 *
 */

class KelasSatu {
	{
		System.out.println(11); //non-blcok berada diurutan ke 2 ekseskusi setelah static block
	}
	
	static {
		System.out.println(2); //static block berada diurutan ke 1 eksekusi tetapi hanya jalan satu kali
	}
	
	public KelasSatu(int i) { // constructor berada diurutan ke 3 eksekusi setelah non-static block dan akan menjalankan construct dengan parameter
		System.out.println(3);  
	}
	
	public KelasSatu() { // akan menjalan construct tanpa berisi parameter
		System.out.println(4);
	}
}