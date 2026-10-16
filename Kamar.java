package uts.SistemRawaInapRumahSakit;

public class Kamar {
    private int nomorKamar;
    private double tarifPerMalam;
    private Pasien pasien;

    public Kamar(int nomorKamar, double tarifPerMalam) {
        if (nomorKamar <= 0 || tarifPerMalam < 0) {
            throw new IllegalArgumentException("Data kamar tidak valid");
        }

        this.nomorKamar = nomorKamar;
        this.tarifPerMalam = tarifPerMalam;
        this.pasien = null;
    }

    public boolean isKosong() {
        return pasien == null;
    }

    public boolean tempati(Pasien p) {
        if (p == null || !isKosong()) {
            return false;
        }

        p.setTarifPerMalam(tarifPerMalam);
        pasien = p;
        return true;
    }

    public void kosongkan() {
        pasien = null;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public double getTarifPerMalam() {
        return tarifPerMalam;
    }

    public Pasien getPasien() {
        return pasien;
    }
}