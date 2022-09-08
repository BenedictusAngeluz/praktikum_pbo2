package bangundatar;

public class Persegi extends BangunDatar {
    private float s;

    public Persegi(float s) {
        this.s = s;
    }

    public void hitungLuas() {
        this.luas = s * s;
    }

    public void hitungKeliling() {
        this.keliling = 4 * s;
    }
}