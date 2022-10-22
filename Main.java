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

	public static ArrayList<Goleiro> carregarGoleiro() {

		ArrayList<Goleiro> aux = new ArrayList<Goleiro>();

		Goleiro g1 = new Goleiro(1, "Pratik Skaggs", 5, 7, 8, 9, 6, 6);
		g1.setListaChute(carregarChute());
		aux.add(g1);
		Goleiro g2 = new Goleiro(2, "Uehudah Hack", 9, 6, 8, 8, 7, 10);
		g2.setListaChute(carregarChute());
		aux.add(g2);
		Goleiro g3 = new Goleiro(3, "Edison Drye", 5, 8, 5, 8, 10, 7);
		g3.setListaChute(carregarChute());
		aux.add(g3);
		Goleiro g4 = new Goleiro(4, "Ajani Harding", 6, 6, 5, 8, 7, 6);
		g4.setListaChute(carregarChute());
		aux.add(g4);
		Goleiro g5 = new Goleiro(5, "Orazio Hart", 5, 8, 7, 9, 9, 10);
		g5.setListaChute(carregarChute());
		aux.add(g5);
		Goleiro g6 = new Goleiro(6, "Tristan Karns", 9, 7, 10, 7, 7, 6);
		g6.setListaChute(carregarChute());
		aux.add(g6);
		Goleiro g7 = new Goleiro(7, "Niven Glaser", 10, 9, 7, 6, 5, 8);
		g7.setListaChute(carregarChute());
		aux.add(g7);
		Goleiro g8 = new Goleiro(8, "Derwyn Devers", 10, 7, 9, 5, 9, 5);
		g8.setListaChute(carregarChute());
		aux.add(g8);
		Goleiro g9 = new Goleiro(9, "Tod Phan", 10, 7, 7, 5, 5, 6);
		g9.setListaChute(carregarChute());
		aux.add(g9);
		Goleiro g10 = new Goleiro(10, "Eddie Hulse", 7, 6, 5, 9, 7, 5);
		g10.setListaChute(carregarChute());
		aux.add(g10);
		Goleiro g11 = new Goleiro(11, "Welford Yepez", 5, 8, 8, 7, 7, 8);
		g11.setListaChute(carregarChute());
		aux.add(g11);
		Goleiro g12 = new Goleiro(12, "Rishley Snyder", 6, 5, 6, 5, 7, 6);
		g12.setListaChute(carregarChute());
		aux.add(g12);
		Goleiro g13 = new Goleiro(13, "Milo Mccurdy", 10, 9, 8, 6, 10, 9);
		g13.setListaChute(carregarChute());
		aux.add(g13);
		Goleiro g14 = new Goleiro(14, "Carden Justus", 8, 5, 8, 5, 10, 7);
		g14.setListaChute(carregarChute());
		aux.add(g14);
		Goleiro g15 = new Goleiro(15, "Carlyon Gorby", 8, 5, 8, 8, 8, 6);
		g15.setListaChute(carregarChute());
		aux.add(g15);
		Goleiro g16 = new Goleiro(16, "Mungo Spangler", 8, 10, 9, 8, 9, 5);
		g16.setListaChute(carregarChute());
		aux.add(g16);
		Goleiro g17 = new Goleiro(17, "Whitmore Squires", 9, 10, 7, 9, 9, 10);
		g17.setListaChute(carregarChute());
		aux.add(g17);
		Goleiro g18 = new Goleiro(18, "Pedrog Mccurdy", 8, 5, 10, 5, 7, 7);
		g18.setListaChute(carregarChute());
		aux.add(g18);
		Goleiro g19 = new Goleiro(19, "Ridgley Leo", 8, 8, 8, 9, 9, 9);
		g19.setListaChute(carregarChute());
		aux.add(g19);
		Goleiro g20 = new Goleiro(20, "Bolton Tarin", 9, 8, 7, 6, 9, 10);
		g20.setListaChute(carregarChute());
		aux.add(g20);
		Goleiro g21 = new Goleiro(21, "Edison Loy", 7, 7, 5, 10, 10, 7);
		g21.setListaChute(carregarChute());
		aux.add(g21);
		Goleiro g22 = new Goleiro(22, "Delling Herndon", 7, 5, 5, 8, 9, 9);
		g22.setListaChute(carregarChute());
		aux.add(g22);
		Goleiro g23 = new Goleiro(23, "Senichi Iorio", 7, 7, 5, 8, 10, 5);
		g23.setListaChute(carregarChute());
		aux.add(g23);
		Goleiro g24 = new Goleiro(24, "Albin Kerner", 6, 7, 8, 8, 9, 9);
		g24.setListaChute(carregarChute());
		aux.add(g24);
		Goleiro g25 = new Goleiro(25, "Jivin Justus", 9, 10, 8, 7, 7, 5);
		g25.setListaChute(carregarChute());
		aux.add(g25);

		return aux;
	}

	public static void main(String[] args) {

		Mapeamento m = new Mapeamento();

		Selecao s1 = new Selecao("Itália");
		s1.setListaGoleiro(carregarGoleiro());
		Selecao s2 = new Selecao("Alemanha");
		s2.setListaGoleiro(carregarGoleiro());
		Selecao s3 = new Selecao("Brasil");
		s3.setListaGoleiro(carregarGoleiro());
		Selecao s4 = new Selecao("Espanha");
		s4.setListaGoleiro(carregarGoleiro());
		Selecao s5 = new Selecao("França");
		s5.setListaGoleiro(carregarGoleiro());

		System.out.println("Seleção: "+ s1.getNome());
		for (int i = 0; i < 5; i++) {
			s1.addGoleiro(carregarGoleiro().get(i));
			System.out.println(s1.getListaGoleiro().get(i).getNome()); 
		}
		
		System.out.println();
		System.out.println("Seleção: "+ s2.getNome());
		for (int i = 5; i < 10; i++) {
			s2.addGoleiro(carregarGoleiro().get(i));
			System.out.println(s2.getListaGoleiro().get(i).getNome()); 
		}
		
		System.out.println();
		System.out.println("Seleção: "+ s3.getNome());
		for (int i = 10; i < 15; i++) {
			s3.addGoleiro(carregarGoleiro().get(i));
			System.out.println(s3.getListaGoleiro().get(i).getNome()); 
		}
		
		System.out.println();
		System.out.println("Seleção: "+ s4.getNome());
		for (int i = 15; i < 20; i++) {
			s4.addGoleiro(carregarGoleiro().get(i));
			System.out.println(s4.getListaGoleiro().get(i).getNome()); 
		}
		
		System.out.println();
		System.out.println("Seleção: "+ s5.getNome());
		for (int i = 20; i < 25; i++) {
			s5.addGoleiro(carregarGoleiro().get(i));
			System.out.println(s5.getListaGoleiro().get(i).getNome()); 
		}

//		for (Goleiro s : s1.getListaGoleiro()) {
//			System.out.println(s1.getListaGoleiro().get(1).getNome());
//			
//		}
//		
//		System.out.println(s1.getListaGoleiro().get(1).getNome());
		
		m.mapear();
		m.imprimir();

		s1.calculaGol(s1);
		for (Goleiro goleiro : s1.getListaGoleiro()) {
			s1.calculaGol(s1);
			System.out.println(goleiro.pontos(goleiro));
			System.out.println(s1.titular(s1));
		}
		
		for (int i = 0; i < 25; i++) {
			s1.getListaGoleiro().get(i).ondeAcertou(s1.getListaGoleiro().get(i));
		}
	}

}
