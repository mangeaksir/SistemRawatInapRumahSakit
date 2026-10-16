package uts.SistemRawaInapRumahSakit;

public class Dokter {
    private String idDokter;
    private String nama;
    private String spesialisasi;

    public Dokter(String idDokter, String nama, String spesialisasi) {
        this.idDokter = idDokter;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public String getIdDokter() {
        return idDokter;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }
}