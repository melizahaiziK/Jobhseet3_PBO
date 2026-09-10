public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, int limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public int getJumlahPinjamna() {
        return jumlahPinjaman;
    }

    public void pinjam(int nominal) {
        if (jumlahPinjaman + nominal > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman = jumlahPinjaman + nominal;
        }
    }

    public void angsur(int nominal) {
        jumlahPinjaman = jumlahPinjaman - nominal;
    }
}
