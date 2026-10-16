package uts.SistemRawaInapRumahSakit;

public class Kasir {

    public void cetakTagihan(Kamar kamar) {
        if (kamar == null) {
            System.out.println("Kamar tidak valid.");
            return;
        }

        Pasien pasien = kamar.getPasien();

        if (pasien == null) {
            System.out.println("Kamar " + kamar.getNomorKamar()
                    + " kosong, tidak ada tagihan");
            return;
        }

        String jenisPasien;

        if (pasien instanceof PasienUmum) {
            jenisPasien = "Umum";
        } else if (pasien instanceof PasienBPJS) {
            jenisPasien = "BPJS";
        } else {
            jenisPasien = "Tidak diketahui";
        }

        System.out.println("=== Tagihan Kamar "
                + kamar.getNomorKamar() + " ===");

        System.out.println(pasien.getNama() + " ("
                + pasien.getIdPasien() + ") - " + jenisPasien);

        System.out.println("DPJP: " + pasien.getDpjp().getNama()
                + " (" + pasien.getDpjp().getSpesialisasi() + ")");

        System.out.println("Lama inap: "
                + pasien.getLamaInap() + " malam");

        System.out.println("Total: "
                + (long) pasien.hitungTotalBiaya());

        System.out.println();
    }
}
