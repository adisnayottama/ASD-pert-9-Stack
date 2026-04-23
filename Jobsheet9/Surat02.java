package Jobsheet9;

public class Surat02 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    public Surat02(String idsurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idsurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampil() {
        System.out.println(idSurat + " | " + namaMahasiswa + " | " + kelas + " | " + jenisIzin + " | " + durasi + "hari");
    }
}
