package logic_1.hari1.pagi;

public class Operasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nilai1 = 2;
		int nilai2 = 5;
		int total = nilai1 + nilai2;
		
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Total: " + (nilai1+nilai2));
		System.out.println(nilai1 + nilai2);
		System.out.println(total);
		
		System.out.println("max memory : "+ rt.maxMemory()/1024);
		System.out.println("allocated memory: "+ rt.totalMemory()/1024);
		System.out.println("free memory: " + rt.freeMemory()/1024);
		System.out.println("used memory: " + ((rt.totalMemory()/1024) - (rt.freeMemory()/1024)));
		
		System.out.println();
		
		Operasi op = new Operasi();
		op.printAngka();
		
		

	}
	public int hitungAngka(int a,int b) {
		return a*b;
	}
	
	public void printAngka() {
		int result = hitungAngka(2,3);
		System.out.println(result);
	}

}
