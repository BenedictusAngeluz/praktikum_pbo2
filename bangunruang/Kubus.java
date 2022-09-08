package bangunruang;

public class Kubus extends BangunRuang {
    private float s;

    public Kubus(float s) {
        this.s = s;
    }

    public void hitungLuas() {
        this.luas = 6 * s * s;
    }

    public void hitungKeliling() {
        this.keliling = 12 * s;
    }

    public void hitungVolume() {
        this.volume = s * s * s;
    }
}
