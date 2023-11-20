package Azterketa;

import java.util.ArrayList;
import java.util.Scanner;

public class Azterketa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int zbki;
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		do {
			System.out.print("Sartu zenbaki bat: ");
			zbki = sc.nextInt();
			lista.add(zbki);
			
		} while (zbki != 0);
		
		int batuketa = 0;
        for (int i : lista) {
            batuketa += i;
        }

        double batbes = (double) batuketa / (lista.size()-1);

        System.out.println("Batazbestekoa da: " + batbes);
	}

}
