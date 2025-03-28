import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        User silver = new User();
        User gold = new User();
        User platinum = new User();
        String tipePelanggan = "";
        Transaksi transaksi = new Transaksi();

        silver.setNama("Sigit Rendang");
        silver.setNoPelanggan("3897642011");
        silver.setPin("admin1234");
        silver.setSaldo(50000000);
        silver.setAktivasi(true);

        gold.setNama("Denis Useless");
        gold.setNoPelanggan("5613465780");
        gold.setPin("admin4321");
        gold.setSaldo(1500000);
        gold.setAktivasi(true);

        platinum.setNama("Jamal Febrianto");
        platinum.setNoPelanggan("7496857431");
        platinum.setPin("admin1324");
        platinum.setSaldo(2250000);
        platinum.setAktivasi(true);

        System.out.println("SELAMAT DATANG");
        System.out.println("SELAMAT BERBELANJA ");
        System.out.println();
        System.out.println("Pilih opsi : ");
        System.out.println("1. Pembelian");
        System.out.println("2. Top-up");
        System.out.println("3. Keluar");
        System.out.println();
        int pilihan = masukan.nextInt();
        if (pilihan == 1 || pilihan == 2) {
            System.out.println("Masukkan Nomer Pelanggan dan Pin Anda");
            for (int i = 0; i < 3; i++) {
                String case1 = masukan.next();
                if (case1.equals(silver.getNoPelanggan())) {

                    for (int j = 0; j < 3; j++) {
                        String case2 = masukan.next();
                        if (case2.equals(silver.getPin())) {
                            tipePelanggan = "Silver";
                            System.out.println();
                            User.tampilkanInfo(silver.getNama(), silver.getNoPelanggan(), tipePelanggan,
                                    silver.getSaldo());
                            break;
                        } else if (j == 2) {
                            System.out.println("Pin Salah");
                            System.out.println("Akun Anda Kami Blokir!");
                            silver.setAktivasi(false);
                        } else {
                            System.out.println("Pin Salah");
                        }
                    }
                    if (tipePelanggan.equalsIgnoreCase("Silver")) {
                        break;
                    }

                } else if (case1.equals(gold.getNoPelanggan())) {

                    for (int j = 0; j < 3; j++) {
                        String case2 = masukan.next();
                        if (case2.equals(gold.getPin())) {

                            tipePelanggan = "gold";
                            System.out.println();
                            User.tampilkanInfo(gold.getNama(), gold.getNoPelanggan(), tipePelanggan, gold.getSaldo());
                            break;
                        } else if (j == 2) {
                            System.out.println("Pin Salah");
                            System.out.println("Akun Anda Kami Blokir!");
                            gold.setAktivasi(false);
                        } else {
                            System.out.println("Pin Salah");
                        }
                    }
                    if (tipePelanggan.equalsIgnoreCase("gold")) {
                        break;
                    }
                } else if (case1.equals(platinum.getNoPelanggan())) {

                    for (int j = 0; j < 3; j++) {
                        String case2 = masukan.next();
                        if (case2.equals(platinum.getPin())) {
                            tipePelanggan = "platinum";
                            System.out.println();
                            User.tampilkanInfo(platinum.getNama(), platinum.getNoPelanggan(), tipePelanggan,
                                    platinum.getSaldo());
                            break;
                        } else if (j == 2) {
                            System.out.println("Pin Salah");
                            System.out.println("Akun Anda Kami Blokir!");
                            platinum.setAktivasi(false);
                        } else {
                            System.out.println("Pin Salah");
                        }
                    }
                    if (tipePelanggan.equalsIgnoreCase("platinum")) {
                        break;
                    }

                } else if (i == 2) {
                    System.out.println("User tidak dapat ditemukan!");
                    System.exit(0);
                } else {
                    System.out.println("Nomer Pelanggan salah, Pastikan Anda Memasukkan Nomer Dengan Benar!");
                }
            }

            if (pilihan == 1) {
                System.out.println();
                System.out.println("Barang apa yang anda beli?");
                String barang = masukan.next();
                System.out.println("Berapa Harganya?");
                int harga = masukan.nextInt();
                System.out.println("Berapa jumlah barang yang anda beli?");
                int jumlah = masukan.nextInt();
                transaksi.detailBelanja(barang, harga, jumlah);

                if (tipePelanggan.equalsIgnoreCase("Silver")) {
                    int saldoBaru = transaksi.silverReceipt(silver.getSaldo(), harga, jumlah);
                    silver.setSaldo(saldoBaru);
                } else if (tipePelanggan.equalsIgnoreCase("Gold")) {
                    int saldoBaru = transaksi.goldReceipt(gold.getSaldo(), harga, jumlah);
                    gold.setSaldo(saldoBaru);
                } else if (tipePelanggan.equalsIgnoreCase("Platinum")) {
                    int saldoBaru = transaksi.platinumReceipt(platinum.getSaldo(), harga, jumlah);
                    platinum.setSaldo(saldoBaru);
                }
            } else if (pilihan == 2) {
                System.out.println("Masukkan Nominal Saldo yang Ingin diisi");
                int saldoTp = masukan.nextInt();
                if (tipePelanggan.equalsIgnoreCase("Silver")) {
                    silver.setSaldo(silver.getSaldo() + saldoTp);
                    System.out.println("Top-up Berhasil");
                    System.out.println("Saldo Anda Sekarang " + silver.getSaldo());
                } else if (tipePelanggan.equalsIgnoreCase("Gold")) {
                    gold.setSaldo(gold.getSaldo() + saldoTp);
                    System.out.println("Top-up Berhasil");
                    System.out.println("Saldo Anda Sekarang " + gold.getSaldo());
                } else if (tipePelanggan.equalsIgnoreCase("Platinum")) {
                    platinum.setSaldo(platinum.getSaldo() + saldoTp);
                    System.out.println("Top-up Berhasil");
                    System.out.println("Saldo Anda Sekarang " + platinum.getSaldo());
                }
            }
        }else if (pilihan == 3) {
            System.out.println("Terima Kasih dan Sampai Jumpa '_' ");
            System.exit(0);
        }else {
            System.out.println(" __[_]__");
            System.out.println("  ('_')  Are You Kidding Me?");
            System.out.println("  /( )Z ");
            System.out.println("   | | ");
        }
    }
}
