public class TestLaptop {
    public static void main(String[] args) {
        Laptop lab1 = new Laptop();
        lab1.kodeInventaris = "LAB-JTI-017";
        lab1.merk = "Lenovo ThinkPad E14";
        lab1.ramGB = 8;

        lab1.tampilSpesifikasi();
        System.out.println("RAM setelah upgrade : " + lab1.upgradeRam(8) + " GB");

        System.out.println("\n--- Pengecekan Ulang Spesifikasi ---");
        lab1.tampilSpesifikasi();

        int hari = 3;
        System.out.println("Biaya sewa (" + hari + " hari) : Rp" + lab1.hitungHargaSewa(hari));
    }
}