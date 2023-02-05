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

public class KelasDua {
	{
		System.out.println(5); //ini adalah non-static block tetapi tidak tereksekusi karena diluar main program
	}
	public static void main(String[] args) {
		System.out.println(6); //menampilkan angka 6
		KelasSatu satu = new KelasSatu(); //menjalankan constructor tanpa parameter
		KelasSatu dua = new KelasSatu(10); //menjalankan consructor dengan parameter
	}

}
