public class TestTransaksiPeminjaman {
    public static void main(String[] args) {
        TransaksiPeminjaman trx1 = new TransaksiPeminjaman();
        trx1.idTransaksi = "TRX-001";
        trx1.namaPeminjam = "Nobbel Kaisar Bhumi";
        trx1.judulBuku = "Dasar Pemrograman Berbasis Objek";
        trx1.jumlahHariTerlambat = 0;

        TransaksiPeminjaman trx2 = new TransaksiPeminjaman();
        trx2.idTransaksi = "TRX-002";
        trx2.namaPeminjam = "Ahmad Fauzan";
        trx2.judulBuku = "Algoritma dan Struktur Data";
        trx2.jumlahHariTerlambat = 3;

        TransaksiPeminjaman trx3 = new TransaksiPeminjaman();
        trx3.idTransaksi = "TRX-003";
        trx3.namaPeminjam = "Siti Rahayu";
        trx3.judulBuku = "Pemrograman Web Modern";
        trx3.jumlahHariTerlambat = 10;

        trx1.tampilDataTransaksi();
        System.out.println();
        trx2.tampilDataTransaksi();
        System.out.println();
        trx3.tampilDataTransaksi();
    }
}