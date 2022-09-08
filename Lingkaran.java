package bangundatar;

public class Lingkaran extends BangunDatar {
    private float phi;
    private float r;

    public Lingkaran(float r) {
        this.r = r;
        this.phi = 22 / 7;
    }

    public void hitungLuas() {
        this.luas = phi * r * r;
    }

    public void hitungKeliling() {
        this.keliling = 2 * phi * r;
    }
}
