package uts.SistemRawaInapRumahSakit;

public class PasienUmum extends Pasien {
    private static final double biayaAdmin = 150000;

    public PasienUmum(String idPasien, String nama,
                      int lamaInap, Dokter dpjp) {
        super(idPasien, nama, lamaInap, dpjp);
    }

    @Override
    public double hitungTotalBiaya() {
        return hitungBiayaDasar() + biayaAdmin;
    }
}