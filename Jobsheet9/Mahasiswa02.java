package Jobsheet9;

public class Mahasiswa02 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa02(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
