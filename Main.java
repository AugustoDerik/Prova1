package prova1;

import java.util.ArrayList;

public class Main {

	public static ArrayList<Chute> carregarChute() {

		ArrayList<Chute> aux = new ArrayList<Chute>();
		Chute c1 = new Chute(1, 2, 1, 4, 7);
		aux.add(c1);
		Chute c2 = new Chute(2, 6, 1, 3, 6);
		aux.add(c2);
		Chute c3 = new Chute(3, 9, 2, 4, 15);
		aux.add(c3);
		Chute c4 = new Chute(4, 5, 4, 6, 11);
		aux.add(c4);
		Chute c5 = new Chute(5, 3, 4, 8, 13);
		aux.add(c5);
		Chute c6 = new Chute(6, 3, 3, 6, 4);
		aux.add(c6);
		Chute c7 = new Chute(7, 4, 4, 5, 8);
		aux.add(c7);
		Chute c8 = new Chute(8, 7, 4, 7, 14);
		aux.add(c8);
		Chute c9 = new Chute(9, 8, 4, 7, 14);
		aux.add(c9);
		Chute c10 = new Chute(10, 4, 4, 6, 12);
		aux.add(c10);
		Chute c11 = new Chute(11, 2, 4, 5, 15);
		aux.add(c11);
		Chute c12 = new Chute(12, 7, 3, 6, 4);
		aux.add(c12);
		Chute c13 = new Chute(13, 3, 3, 8, 2);
		aux.add(c13);
		Chute c14 = new Chute(14, 9, 4, 7, 10);
		aux.add(c14);
		Chute c15 = new Chute(15, 10, 4, 7, 12);
		aux.add(c15);
		Chute c16 = new Chute(16, 5, 1, 4, 2);
		aux.add(c16);
		Chute c17 = new Chute(17, 3, 4, 5, 13);
		aux.add(c17);
		Chute c18 = new Chute(18, 10, 2, 4, 16);
		aux.add(c18);
		Chute c19 = new Chute(19, 10, 4, 5, 16);
		aux.add(c19);
		Chute c20 = new Chute(20, 10, 2, 3, 14);
		aux.add(c20);
		Chute c21 = new Chute(21, 9, 2, 1, 8);
		aux.add(c21);
		Chute c22 = new Chute(22, 4, 4, 8, 16);
		aux.add(c22);
		Chute c23 = new Chute(23, 8, 4, 6, 14);
		aux.add(c23);
		Chute c24 = new Chute(24, 7, 4, 7, 11);
		aux.add(c24);
		Chute c25 = new Chute(25, 6, 1, 0, 3);
		aux.add(c25);
		Chute c26 = new Chute(26, 5, 3, 6, 7);
		aux.add(c26);
		Chute c27 = new Chute(27, 3, 3, 8, 4);
		aux.add(c27);
		Chute c28 = new Chute(28, 4, 3, 6, 7);
		aux.add(c28);
		Chute c29 = new Chute(29, 10, 2, 2, 13);
		aux.add(c29);
		Chute c30 = new Chute(30, 7, 3, 5, 3);
		aux.add(c30);

		return aux;

	}
	
	public static ArrayList<Goleiro> carregarGoleiro(){
		
		ArrayList<Goleiro> aux = new ArrayList<Goleiro>();
		
		Goleiro g1 = new Goleiro(1, "Pratik Skaggs", 5,7,8,9,6,6);
		g1.setListaChute(carregarChute());
		aux.add(g1);
		Goleiro g2 = new Goleiro(2, "Uehudah Hack", 9,6,8,8,7,10);
		g2.setListaChute(carregarChute());
		aux.add(g2);
		Goleiro g3 = new Goleiro(3,"Edison Drye",5,8,5,8,10,7);
		g3.setListaChute(carregarChute());
		aux.add(g3);
		Goleiro g4 = new Goleiro(4,"Ajani Harding",6,6,5,8,7,6);
		g4.setListaChute(carregarChute());
		aux.add(g4);
//		Goleiro g5 = new Goleiro();
//		g5.setListaChute(carregarChute());
//		Goleiro g6 = new Goleiro();
//		g6.setListaChute(carregarChute());
//		Goleiro g7 = new Goleiro();
//		g7.setListaChute(carregarChute());
//		Goleiro g8 = new Goleiro();
//		g8.setListaChute(carregarChute());
//		Goleiro g9 = new Goleiro();
//		g9.setListaChute(carregarChute());
//		Goleiro g10 = new Goleiro();
//		g10.setListaChute(carregarChute());
//		Goleiro g11 = new Goleiro();
//		g11.setListaChute(carregarChute());
//		Goleiro g12 = new Goleiro();
//		g12.setListaChute(carregarChute());
//		Goleiro g13 = new Goleiro();
//		g13.setListaChute(carregarChute());
//		Goleiro g14 = new Goleiro();
//		g14.setListaChute(carregarChute());
//		Goleiro g15 = new Goleiro();
//		g15.setListaChute(carregarChute());
//		Goleiro g16 = new Goleiro();
//		g16.setListaChute(carregarChute());
//		Goleiro g17 = new Goleiro();
//		g17.setListaChute(carregarChute());
//		Goleiro g18 = new Goleiro();
//		g18.setListaChute(carregarChute());
//		Goleiro g19 = new Goleiro();
//		g19.setListaChute(carregarChute());
//		Goleiro g20 = new Goleiro();
//		g20.setListaChute(carregarChute());
//		Goleiro g21 = new Goleiro();
//		g21.setListaChute(carregarChute());
//		Goleiro g22 = new Goleiro();
//		g22.setListaChute(carregarChute());
//		Goleiro g23 = new Goleiro();
//		g23.setListaChute(carregarChute());
//		Goleiro g24 = new Goleiro();
//		g24.setListaChute(carregarChute());
//		Goleiro g25 = new Goleiro();
//		g25.setListaChute(carregarChute());
		
		return aux;
	}

	public static void main(String[] args) {
		
		Mapeamento m = new Mapeamento();
		m.mapear();
		m.imprimir();
		

	}

}
