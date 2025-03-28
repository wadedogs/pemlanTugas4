public class Transaksi {
    public void detailBelanja(String barang, int harga, int jumlah) {
        System.out.println("Barang  : " + barang);
        System.out.println("Harga   : " + harga);
        System.out.println("Jumlah  : " + jumlah);
    }

    public static int silverReceipt(int saldo, int harga, int jumlah) {
        if (saldo >= 10000) {
            if (saldo >= (harga * jumlah) && (harga * jumlah > 1000000)) {
                saldo -= (harga * jumlah);
                saldo += (harga * jumlah * 0.05);
                System.out.println("Transaksi Berhasil!");
                System.out.println("Saldo Anda Sekarang: " + saldo);
                System.out.println();
            } else if (saldo >= (harga * jumlah) && (harga * jumlah < 1000000)) {
                saldo -= (harga * jumlah);
                System.out.println("Transaksi Berhasil!");
                System.out.println("Saldo Anda Sekarang: " + saldo);
                System.out.println();
            } else {
                System.out.println("Saldo anda tidak cukup");
                System.out.println();
            }
        } else {
            System.out.println("Saldo anda tidak cukup");
            System.out.println();
        }
        return saldo;
    }

    public static int goldReceipt(int saldo, int harga, int jumlah) {
        if (saldo >= 10000) {
            if (saldo >= (harga * jumlah) && (harga * jumlah > 1000000)) {
                saldo -= (harga * jumlah);
                saldo += (harga * jumlah * 0.07);
                System.out.println("Transaksi Berhasil!");
                System.out.println("Saldo Anda Sekarang: " + saldo);
                System.out.println();
            } else if (saldo >= (harga * jumlah) && (harga * jumlah < 1000000)) {
                saldo -= (harga * jumlah);
                saldo += (harga * jumlah * 0.02);
                System.out.println("Transaksi Berhasil!");
                System.out.println("Saldo Anda Sekarang: " + saldo);
                System.out.println();
            } else {
                System.out.println("Saldo anda tidak cukup");
                System.out.println();
            }
        } else {
            System.out.println("Saldo anda tidak cukup");
            System.out.println();
        }
        return saldo;
    }

    public static int platinumReceipt(int saldo, int harga, int jumlah) {
        if(saldo >= 10000) {
            if (saldo >= (harga*jumlah) && (harga*jumlah >1000000)) {
                saldo -= (harga*jumlah);
                saldo += (harga*jumlah*0.1);
                System.out.println("Transaksi Berhasil!");
                System.out.println("Saldo Anda Sekarang: " + saldo);
                System.out.println();
            }else if (saldo >= (harga*jumlah) && (harga*jumlah < 1000000)) {
                saldo -= (harga*jumlah);
                saldo += (harga*jumlah*0.05);
                System.out.println("Transaksi Berhasil!");
                System.out.println("Saldo Anda Sekarang: " + saldo);
                System.out.println();
            }else {
                System.out.println("Saldo anda tidak cukup");
                System.out.println();
            }
        }else {
                System.out.println("Saldo anda tidak cukup");
                System.out.println();
        }
        return saldo;
    }
}
