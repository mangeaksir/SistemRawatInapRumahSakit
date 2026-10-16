package uts.SistemRawaInapRumahSakit;

public class Bangsal {
    private String namaBangsal;
    private Kamar[] kamar;
    private Dokter kepalaBangsal;

    public Bangsal(String namaBangsal, int jumlahKamar,
                   double tarifPerMalam, Dokter kepalaBangsal) {
        if (jumlahKamar <= 0 || tarifPerMalam < 0
                || kepalaBangsal == null) {
            throw new IllegalArgumentException("Data bangsal tidak valid");
        }

        this.namaBangsal = namaBangsal;
        this.kepalaBangsal = kepalaBangsal;
        this.kamar = new Kamar[jumlahKamar];

        for (int i = 0; i < jumlahKamar; i++) {
            kamar[i] = new Kamar(i + 1, tarifPerMalam);
        }
    }

    public boolean rawatInap(Pasien p) {
        if (p == null) {
            return false;
        }

        for (Kamar k : kamar) {
            if (k.isKosong()) {
                return k.tempati(p);
            }
        }

        return false;
    }

    public boolean rawatInap(Pasien p, int nomorKamar) {
        if (p == null || nomorKamar < 1
                || nomorKamar > kamar.length) {
            return false;
        }

        return kamar[nomorKamar - 1].tempati(p);
    }

    public Kamar getKamar(int indeks) {
        if (indeks < 0 || indeks >= kamar.length) {
            return null;
        }

        return kamar[indeks];
    }

    public int getJumlahKamar() {
        return kamar.length;
    }

    public String getNamaBangsal() {
        return namaBangsal;
    }

    public Dokter getKepalaBangsal() {
        return kepalaBangsal;
    }
}