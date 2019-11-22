package logic_1.hari1.pagi;

public class Tabung {

	public float volume, kel, luas;
	public int r,t;
	public float phi = (float) 3.14;
	
	/*
	 * constructor tanpa parameter
	 */
	
	  public Tabung() {
	  
	 }
	
	
	public Tabung(float volume, float kel, float luas, int r, int t, float phi) {
		this.volume = volume;
		this.kel = kel;
		this.luas = luas;
		this.r = r;
		this.t = t;
		this.phi = phi;
	}
	
	public float hitungVolume(float phi, int r, int t) {
		return phi * r * r * t;
	}
	public float hitungKel(float phi, int r) {
		return 2*phi*r;
	}
	public float hitungLuas(float phi, int r) {
		return 2*phi*r*r;
	}
	public void cetakHasil() {
		double volume = hitungVolume(phi, 20, 40);
		System.out.println("Volume tabung: "+ volume);
		System.out.println();
		double kel = hitungKel(phi, 9);
		System.out.println("Keliling tabung: "+ kel);
		System.out.println();
		double luas = hitungLuas(phi, 9);
		System.out.println("Luas tabung: "+ luas);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tabung tb = new Tabung();
		tb.cetakHasil();
	}

	
	

}
