public class Penulis {
    String NamaPenulis;
    String EmailPenulis;

    public Penulis(String namaPenulis, String emailPenulis) {
        this.NamaPenulis = namaPenulis;
        this.EmailPenulis = emailPenulis;
    }


   public void tampilkanpenulis(){
        System.out.println("------Penulis------");
        System.out.println("Nama Penulis:"+NamaPenulis);
        System.out.println("Email:"+EmailPenulis);
        System.out.println("\n");
    }
}
