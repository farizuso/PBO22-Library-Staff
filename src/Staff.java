public class Staff {
  int IdStuff;
  String NamaStuff,NIP,Password;

    public Staff(int idStuff, String namaStuff, String NIP, String password) {
    this.IdStuff = idStuff;
    this.NamaStuff = namaStuff;
    this.NIP = NIP;
    this.Password = password;
  }
    void tampilkan(){
    System.out.println("------Data Stuff------");
    System.out.println("ID Stuff:"+IdStuff);
    System.out.println("Nama Stuff:"+NamaStuff);
    System.out.println("NIP:"+NIP);
    System.out.println("Password:"+Password);
    System.out.println("\n");

  }
}









