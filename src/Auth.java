public class Auth {
    static Staff staffLogged = null;

    public static Staff getStaffLogged(){
        return staffLogged;
    }
    public static boolean login(String nik,String password){
        //contoh Login hanya 1 user
        if((Library.staffAktif.NIP.equals(nik)) &&
        (Library.staffAktif.Password.equals(password))){
    //Login Berhasil
    staffLogged = Library.staffAktif;
    return true;
    } else{
        // nik atau password salah
        return false;
        }
    }
    public static void logout(){
        staffLogged = null;
    }
}
