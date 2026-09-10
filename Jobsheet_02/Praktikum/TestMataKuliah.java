public class TestMataKuliah {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "RTI253008";
        mk1.namaMK = "Pemrograman Berbasis Objek";
        mk1.sks = 2;
        mk1.nilaiAngka = 3.7;

        MataKuliah mk2 = new MataKuliah();
        mk2.kodeMK = "RTI253001";
        mk2.namaMK = "Desain dan Pemrograman Web";
        mk2.sks = 3;
        mk2.nilaiAngka = 4.0;

        MataKuliah mk3 = new MataKuliah();
        mk3.kodeMK = "RTI253012";
        mk3.namaMK = "Basis Data";
        mk3.sks = 3;
        mk3.nilaiAngka = 3.3;

        mk1.tampilData();
        System.out.println();
        mk2.tampilData();
        System.out.println();
        mk3.tampilData();

        double totalBobot = mk1.hitungBobotNilai()
                + mk2.hitungBobotNilai()
                + mk3.hitungBobotNilai();
        System.out.println();
        System.out.println("Total Bobot Nilai : " + totalBobot);
    }
}