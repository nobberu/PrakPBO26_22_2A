public class TransaksiPeminjaman {
    public String idTransaksi;
    public String namaPeminjam;
    public String judulBuku;
    public int jumlahHariTerlambat;
    public double denda;

    public double hitungDenda() {
        double tarifDendaPerHari = 1000;
        denda = jumlahHariTerlambat * tarifDendaPerHari;
        return denda;
    }

    public void tampilDataTransaksi() {
        System.out.println("ID Transaksi   : " + idTransaksi);
        System.out.println("Nama Peminjam  : " + namaPeminjam);
        System.out.println("Judul Buku     : " + judulBuku);
        System.out.println("Hari Terlambat : " + jumlahHariTerlambat + " hari");
        System.out.println("Denda          : Rp" + hitungDenda());
    }
}