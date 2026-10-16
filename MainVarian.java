package uts.SistemRawaInapRumahSakit;

public class MainVarian {
    public static void main(String[] args) {

        Dokter dokterRina = new Dokter(
                "D001", "dr. Rina", "Penyakit Dalam");

        Dokter dokterAndi = new Dokter(
                "D002", "dr. Andi", "Paru");

        Bangsal bangsal = new Bangsal(
                "Melati", 3, 400000, dokterRina);

        PasienUmum budi = new PasienUmum(
                "RM-001", "Budi", 3, dokterAndi);

        PasienBPJS sari = new PasienBPJS(
                "RM-002", "Sari", 4, "0001234", dokterRina);

        bangsal.rawatInap(budi);

        bangsal.rawatInap(sari, 3);

        Kasir kasir = new Kasir();

        kasir.cetakTagihan(bangsal.getKamar(0));
        kasir.cetakTagihan(bangsal.getKamar(2));
        kasir.cetakTagihan(bangsal.getKamar(1));

        Dokter dokter = new Dokter("D001", "dr. Rina", "Umum");

        Pasien p = new PasienBPJS("RM-009", "Ani", 2, "000999", dokter);
        p.setTarifPerMalam(400000);

        System.out.println(p.hitungTotalBiaya());
    }
}