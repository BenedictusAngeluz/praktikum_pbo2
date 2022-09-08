import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Kubus;

public class Main {
    public static void main(String[] args) {
        System.out.println("BANGUN DATAR\n");

        Lingkaran lingkaran = new Lingkaran(12);
        System.out.println(lingkaran.getClass().getSimpleName() + " : ");
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        lingkaran.printInfo();

        Persegi persegi = new Persegi(1);
        System.out.println(persegi.getClass().getSimpleName() + " : ");
        persegi.hitungLuas();
        persegi.hitungKeliling();
        persegi.printInfo();

        PersegiPanjang persegipanjang = new PersegiPanjang(6, 8);
        System.out.println(persegipanjang.getClass().getSimpleName() + " : ");
        persegipanjang.hitungLuas();
        persegipanjang.hitungKeliling();
        persegipanjang.printInfo();

        System.out.println("\nBANGUN RUANG\n");

        Balok balok = new Balok(2, 4, 6);
        System.out.println(balok.getClass().getSimpleName() + " : ");
        balok.hitungLuas();
        balok.hitungKeliling();
        balok.hitungVolume();
        balok.printInfo();

        Bola bola = new Bola(12);
        System.out.println(bola.getClass().getSimpleName() + " : ");
        bola.hitungLuas();
        bola.hitungKeliling();
        bola.hitungVolume();
        bola.printInfo();

        Kubus kubus = new Kubus(14);
        System.out.println(kubus.getClass().getSimpleName() + " : ");
        kubus.hitungLuas();
        kubus.hitungKeliling();
        kubus.hitungVolume();
        kubus.printInfo();
    }
}