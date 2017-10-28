// Berkas: TesInterface2.java

interface IntLampu {
    public static final int KEADAAN_HIDUP = 1;
    public static final int KEADAAN_MATI  = 0;

    public abstract void hidupkan();
    public abstract void matikan();
} // Akhir interface

interface IntLampuPenyuram extends IntLampu {
    public static final int POSISI_MAKSIMUM = 10;
    public static final int POSISI_MINIMUM  =  0;

    public abstract void redupkan();
    public abstract void buatLebihTerang();
} // Akhir interface

class LampuPenyuram implements IntLampuPenyuram {
    private int statusLampu = 0;

    public void hidupkan() {
	this.statusLampu = POSISI_MAKSIMUM;
	System.out.print("hidupkan(): ");
	System.out.print("lampu hidup. ");
	System.out.println("Posisi tombol: " +  this.statusLampu);
    }

    public void matikan() {
	this.statusLampu = POSISI_MINIMUM;
	System.out.print("matikan(): ");
	System.out.println("Lampu mati ");
    }

    public void redupkan() {
	if (this.statusLampu != POSISI_MINIMUM)
	    this.statusLampu--;

	System.out.print("redupkan(): ");
	if (this.statusLampu == POSISI_MINIMUM)
	    System.out.println("Lampu mati ");
	else {
	    System.out.print("Lampu hidup. ");
	    System.out.println("Posisi tombol: " + this.statusLampu);
	}
    }

    public void buatLebihTerang() {
	if (this.statusLampu != POSISI_MAKSIMUM)
	    this.statusLampu++;

	System.out.print("buatLebihTerang(): ");
	System.out.print("Lampu hidup. ");
	System.out.println("Posisi tombol: " + this.statusLampu);
    }
} // Akhir kelas

public class TesInterface2 {
    public static void main(String[] args) {

	LampuPenyuram lampuKamar = new LampuPenyuram();
	lampuKamar.hidupkan();
	lampuKamar.redupkan();
	lampuKamar.redupkan();
	lampuKamar.buatLebihTerang();
	lampuKamar.matikan();
	lampuKamar.buatLebihTerang();
    }
}
