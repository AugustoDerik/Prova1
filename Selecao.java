package prova1;

import java.util.ArrayList;

public class Selecao {

	private String nome;
	private ArrayList<Goleiro> listaGoleiro;

	public Selecao(String nome) {
		this.nome = nome;
		listaGoleiro = new ArrayList<Goleiro>();
	}

	public void addGoleiro(Goleiro g) {
		listaGoleiro.add(g);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Goleiro> getListaGoleiro() {
		return listaGoleiro;
	}

	public void setListaGoleiro(ArrayList<Goleiro> listaGoleiro) {
		this.listaGoleiro = listaGoleiro;
	}

	public void calculaGol(Selecao s) {
		for (Goleiro gol : s.getListaGoleiro()) {
			for (Chute ch : gol.getListaChute()) {
				gol.addGol(defesa(ch, gol, gol.sorteiaX(ch.getQuadrante()), gol.sorteiaY(ch.getQuadrante())));
			}

		}
	}

	public int defesa(Chute c, Goleiro g, int x, int y) {
		Mapeamento m = new Mapeamento();
		m.mapear();
		String mDefesa[][] = new String[9][17];
		int contadorDeGol = 0;
//		m.getPosicao(c.sorteiaX(c.verificaQuadrante(c.getX(), c.getY())),
//				c.sorteiaY(c.verificaQuadrante(c.getX(), c.getY())));
//		for (Goleiro goleiro : s.getListaGoleiro()) {
		for (Chute chute : g.getListaChute()) {
			for (int i = 0; i < mDefesa.length; i++) {
				for (int j = 0; j < mDefesa.length; j++) {
					if (i == chute.getX() && j == chute.getY()) {
						mDefesa[i][j] = "@";
						m.setPosicao(mDefesa);
						if (g.getDefesa(x, y) == mDefesa[i][j] && g.getForca() >= c.getForca())
							contadorDeGol++;
					}
				}
			}
		}
//		}

		return contadorDeGol;
	}

	public String titular(Selecao s) {
		int maior = 0;
		String nome = "";
		for (Goleiro goleiro : listaGoleiro) {
			if (goleiro.pontos(goleiro) > maior)
				maior = goleiro.pontos(goleiro);
			else if (goleiro.pontos(goleiro) == maior)
				nome = goleiro.getNome();
		}
		return nome;

	}

	public float calcularMediaDefendeu(ArrayList<Integer> lista) {
		int total = 0;
		float media = 0;
		for (int n : lista) {
			total += n;
		}
		media = (float) (total / 30) * 100;
		return media;
	}

	public float calcularMediaNaoDefendeu(ArrayList<Integer> lista) {
		int total = 0;
		float media = 0;
		for (int n : lista) {
			total += n;
		}
		media = (float) ((30 - total) / 30) * 100;
		return media;
	}
}
