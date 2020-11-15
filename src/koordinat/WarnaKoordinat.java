package koordinat;

/**
 * @author
 * NAMA     : Anggawan Ridho
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class WarnaKoordinat extends Koordinat {
    public String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna){
        super(x,y);
        this.namaWarna = namaWarna;
    }

    public String getNamaWarna(){
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna){
        this.namaWarna = namaWarna;
    }
}
