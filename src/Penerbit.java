public class Penerbit {
    String NamaPenerbit;
    String AlamatPenerbit;

    public Penerbit(String namaPenerbit, String alamatPenerbit) {
        this.NamaPenerbit = namaPenerbit;
        this.AlamatPenerbit = alamatPenerbit;
    }


    public void tampilkanpenerbit(){
        System.out.println("------Penerbit------");
        System.out.println("Nama Penerbit:"+NamaPenerbit);
        System.out.println("Alamat Penerbit:"+AlamatPenerbit);
    }
}
