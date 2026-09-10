public class MyObjectsDemo {
    public static void main(String[] args) {
        KipasAngin kipas = new KipasAngin();
        kipas.setMerk("Cosmos");
        kipas.tambahKecepatan(3);
        kipas.matikanKipas();

        System.out.println();

        LampuBelajar lampu = new LampuBelajar();
        lampu.setWarna("Putih");
        lampu.nyalakanLampu();
        lampu.matikanLampu();

        System.out.println();

        BukuTulis bukuCatatan = new BukuTulis();
        bukuCatatan.setJudul("Java");
        bukuCatatan.setJumlahHalaman(58);
        bukuCatatan.setJenisGaris("Bergaris");
        bukuCatatan.bukaHalaman(12);
        bukuCatatan.tulisCatatan("Inheritance");
        bukuCatatan.robekKertas();

        System.out.println();

        BukuKamus kamusInggris = new BukuKamus();
        kamusInggris.setJudul("Kamus Lengkap");
        kamusInggris.setJumlahHalaman(1200);
        kamusInggris.setBahasaTerjemahan("Inggris - Indonesia");
        kamusInggris.bukaHalaman(150);
        kamusInggris.cariKata("Inheritance");
        kamusInggris.tandaiHalamanKata("Inheritance", 150);
    }
}
