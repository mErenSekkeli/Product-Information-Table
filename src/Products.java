
import java.io.Serializable;

public class Products implements Serializable{
    private String isim;
    private String kategori;
    private String fiyat;
    private String stok;

    public Products(String isim, String kategori, String fiyat, String stok) {
        this.isim = isim;
        this.kategori = kategori;
        this.fiyat = fiyat;
        this.stok = stok;
    }
    public Products() {
        
    }    
    

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
    
    
}
