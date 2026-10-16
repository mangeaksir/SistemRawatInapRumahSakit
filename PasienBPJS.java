package uts.SistemRawaInapRumahSakit;

public class PasienBPJS extends Pasien {
    private String nomorBPJS;

    public PasienBPJS(String idPasien, String nama,
                      int lamaInap, String nomorBPJS, Dokter dpjp) {
        super(idPasien, nama, lamaInap, dpjp);

        if (nomorBPJS == null || nomorBPJS.isBlank()) {
            throw new IllegalArgumentException("Nomor BPJS tidak valid");
        }

        this.nomorBPJS = nomorBPJS;
    }

    public String getNomorBPJS() {
        return nomorBPJS;
    }

    @Override
    public double hitungTotalBiaya() {
        return hitungBiayaDasar() * 0.10;
    }
}