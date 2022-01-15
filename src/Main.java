import java.util.ArrayList;
import java.util.Scanner;

import packageHewan.Burung;
import packageHewan.Kucing;

public class Main {
	
	private static ArrayList<Burung> kumpulanBurung = new ArrayList<Burung>();
	private static ArrayList<Kucing> kumpulanKucing = new ArrayList<Kucing>();
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			int x = input.nextInt();
			if(x == 4) {
				System.out.println("Keluar while loop");
				break;
			} else {
				System.out.println("masih di while loop");
			}
		}
		
		
		Kucing kucingBaru = new Kucing();
		kumpulanKucing.add(kucingBaru);
		
	}
	
	private static void pemasukanDataBurung() {
		//input
		Burung burungBaru = new Burung();
		burungBaru.setName("Burungburung");
		kumpulanBurung.add(burungBaru);
	}
	
}
