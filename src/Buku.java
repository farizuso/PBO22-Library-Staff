public class Buku {
    int idbuku,halaman;
    String judul,TanggalTerbit;
    Penulis penulis;
    Penerbit penerbit;

    public Buku(int idbuku, int halaman, String judul, String tanggalTerbit, Penulis penulis, Penerbit penerbit) {
        this.idbuku = idbuku;
        this.halaman = halaman;
        this.judul = judul;
        this.TanggalTerbit = tanggalTerbit;
        this.penulis = penulis;
        this.penerbit = penerbit;


    }



    public void tampilkanbuku(){
        System.out.println("------Data Buku------");
        System.out.println("ID Buku:"+idbuku);
        System.out.println("Judul Buku:"+judul);
        System.out.println("Halaman Buku:"+halaman);
        System.out.println("Tanggal Terbit:"+TanggalTerbit);
        System.out.println("\n");
    }
}

