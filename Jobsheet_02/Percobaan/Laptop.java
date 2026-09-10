public class Laptop {
    public String kodeInventaris;
    public String merk;
    public int ramGB;

    public void tampilSpesifikasi() {
        System.out.println("Kode Inventaris : " + kodeInventaris);
        System.out.println("Merk            : " + merk);
        System.out.println("RAM             : " + ramGB + " GB");
    }

    // Nilai ramGB (Soal 4)
    public int upgradeRam(int tambahanGB) {
        ramGB = ramGB + tambahanGB;
        return ramGB;
    }

    // Method hitung harga sewa (Soal 5)
    public int hitungHargaSewa(int jumlahHari) {
        return jumlahHari * 25000;
    }
}