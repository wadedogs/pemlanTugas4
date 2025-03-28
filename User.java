public class User {

    private String nama;
    private String noPelanggan;
    private String pin;
    private int saldo;

    private boolean aktivasi =true;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoPelanggan(String noPelanggan) {
        this.noPelanggan = noPelanggan;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setAktivasi(boolean aktivasi) {
        this.aktivasi = aktivasi;
    }

    public String getNama() {
        return nama;
    }

    public String getNoPelanggan() {
        return noPelanggan;
    }

    public String getPin() {
        return pin;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean getAktivasi() {
        return aktivasi;
    }

    public static void tampilkanInfo(String nama, String noPelanggan, String tipePelanggan, int saldo) {
        System.out.println("Selamat Datang " + nama);
        System.out.println("Nomer Pelanggan: " + noPelanggan);
        System.out.println("Tipe: " + tipePelanggan);
        System.out.println("Saldo Anda: " + saldo);
        System.out.println("Selamat Berbelanja (^_^) ");
    }
}
