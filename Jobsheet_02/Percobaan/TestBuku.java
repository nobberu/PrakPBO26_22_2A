public class TestBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.isbn = "978-979-29-6104-2";
        buku1.judul = "Dasar Pemrograman Berbasis Objek";
        buku1.penulis = "Abdul Kadir";
        buku1.penerbit = "Andi Offset";
        buku1.tahunTerbit = 2021;
        buku1.tampilInfoBuku();

        System.out.println();

        Buku buku2 = new Buku();
        buku2.isbn = "978-602-03-3160-7";
        buku2.judul = "Pemrograman Java untuk Pemula";
        buku2.penulis = "R.H. Sianipar";
        buku2.penerbit = "Informatika";
        buku2.tahunTerbit = 2020;
        buku2.tampilInfoBuku();

        System.out.println();

        Buku buku3 = new Buku();
        buku3.isbn = "978-623-01-0812-4";
        buku3.judul = "Struktur Data Terapan";
        buku3.penulis = "Adam Kurniawan";
        buku3.penerbit = "Andi Offset";
        buku3.tahunTerbit = 2022;
        buku3.tampilInfoBuku();
    }
}