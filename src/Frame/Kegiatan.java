package Frame;

/**
 *
 * @author Laden
 */
public class Kegiatan {
    private String idKategori,idKegiatan = null,namaKegiatan,tanggalKegiatan,deskripsiKegiatan,isCheck;
    public Kegiatan(String idKategori, String idKegiatan, String namaKegiatan, String tanggalKegiatan, String deskripsiKegiatan, String isCheck) {
        this.idKategori = idKategori;
        this.idKegiatan = idKegiatan;
        this.namaKegiatan = namaKegiatan;
        this.tanggalKegiatan = tanggalKegiatan;
        this.deskripsiKegiatan = deskripsiKegiatan;
        this.isCheck = isCheck;
    }

    public String getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck;
    }
    
    public String getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getIdKegiatan() {
        return idKegiatan;
    }

    public void setIdKegiatan(String idKegiatan) {
        this.idKegiatan = idKegiatan;
    }

    public String getNamaKegiatan() {
        return namaKegiatan;
    }

    public void setNamaKegiatan(String namaKegiatan) {
        this.namaKegiatan = namaKegiatan;
    }

    public String getTanggalKegiatan() {
        return tanggalKegiatan;
    }

    public void setTanggalKegiatan(String tanggalKegiatan) {
        this.tanggalKegiatan = tanggalKegiatan;
    }

    public String getDeskripsiKegiatan() {
        return deskripsiKegiatan;
    }

    public void setDeskripsiKegiatan(String deskripsiKegiatan) {
        this.deskripsiKegiatan = deskripsiKegiatan;
    }
}
