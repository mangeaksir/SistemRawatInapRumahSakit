package uts.SistemRawaInapRumahSakit;

public abstract class Pasien {
    private String idPasien;
    private String nama;
    private int lamaInap;
    private Dokter dpjp;
    private double tarifPerMalam;

    public Pasien(String idPasien, String nama, int lamaInap, Dokter dpjp) {
        if (dpjp == null || lamaInap <= 0) {
            throw new IllegalArgumentException("Data pasien tidak valid");
        }

        this.idPasien = idPasien;
        this.nama = nama;
        this.lamaInap = lamaInap;
        this.dpjp = dpjp;
        this.tarifPerMalam = 0;
    }

    public double hitungBiayaDasar() {
        return tarifPerMalam * lamaInap;
    }

    public abstract double hitungTotalBiaya();

    void setTarifPerMalam(double tarifPerMalam) {
        this.tarifPerMalam = tarifPerMalam;
    }

    public String getIdPasien() {
        return idPasien;
    }

    public String getNama() {
        return nama;
    }

    public int getLamaInap() {
        return lamaInap;
    }

    public Dokter getDpjp() {
        return dpjp;
    }
}