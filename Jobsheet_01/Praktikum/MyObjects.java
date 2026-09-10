// Kipas Angin
class KipasAngin {
    String merk;
    int kecepatan;

    void setMerk(String merkBaru) {
        merk = merkBaru;
    }

    void tambahKecepatan(int tambah) {
        kecepatan += tambah;
        System.out.println("Kecepatan kipas " + merk + " bertambah menjadi: " + kecepatan);
    }

    void matikanKipas() {
        kecepatan = 0;
        System.out.println("Kipas angin telah dimatikan.");
    }
}

// Lampu Belajar
class LampuBelajar {
    String warnaLampu;
    boolean statusMenyala;

    void setWarna(String warna) {
        warnaLampu = warna;
    }

    void nyalakanLampu() {
        statusMenyala = true;
        System.out.println("Lampu belajar warna " + warnaLampu + " berhasil dinyalakan.");
    }

    void matikanLampu() {
        statusMenyala = false;
        System.out.println("Lampu belajar telah dimatikan.");
    }
}

// Buku
class Buku {
    String judul;
    int jumlahHalaman;

    void setJudul(String judulBaru) {
        judul = judulBaru;
    }

    void setJumlahHalaman(int halaman) {
        jumlahHalaman = halaman;
    }

    void bukaHalaman(int nomorHalaman) {
        System.out.println("Membuka buku '" + judul + "' pada halaman: " + nomorHalaman);
    }
}

// Buku Tulis
class BukuTulis extends Buku {
    String jenisGaris;

    void setJenisGaris(String garis) {
        jenisGaris = garis;
    }

    void tulisCatatan(String teks) {
        System.out.println("Menulis pada buku tulis " + jenisGaris + ": " + teks);
    }

    void robekKertas() {
        if (jumlahHalaman > 0) {
            jumlahHalaman--;
            System.out.println("Satu lembar kertas dirobek. Sisa halaman: " + jumlahHalaman);
        }
    }
}

// Buku Kamus
class BukuKamus extends Buku {
    String bahasaTerjemahan;

    void setBahasaTerjemahan(String bahasa) {
        bahasaTerjemahan = bahasa;
    }

    void cariKata(String kata) {
        System.out.println("Mencari arti kata '" + kata + "' dalam kamus " + bahasaTerjemahan + "...");
    }

    void tandaiHalamanKata(String kata, int halaman) {
        System.out.println("Menandai letak kata '" + kata + "' pada halaman " + halaman);
    }
}
