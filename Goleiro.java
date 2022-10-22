package prova1;

import java.util.ArrayList;
import java.util.Random;

public class Goleiro {

	private int id;
	private String nome;
	private ArrayList<Chute> listaChute;
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenacao;
	private int forca;
	private int equilibrio;
	private int AAG;
	private ArrayList<Integer> gol;
	private String defesa[][] = new String[9][17];

	public Goleiro(int id, String nome, int v, int flex, int ag, int c, int f, int eq) {
		this.id = id;
		this.nome = nome;
		velocidade = v;
		flexibilidade = flex;
		agilidade = ag;
		coordenacao = c;
		forca = f;
		equilibrio = eq;
		listaChute = new ArrayList<Chute>();
		gol = new ArrayList<Integer>();

		AAG = (int) ((v * 3) + (flex * 2) + (ag * 3) + (c * 2) + (f) + (eq * 2)) / 8;
	}

//	public int AAG(int v, int flex, int ag, int c, int f, int eq) {
//
//		velocidade = v;
//		flexibilidade = flex;
//		agilidade = ag;
//		coordenacao = c;
//		forca = f;
//		equilibrio = eq;
//
//		int AAG = ((v * 3) + (flex * 2) + (ag * 3) + (c * 2) + (f) + (eq * 2)) / 8;
//
//		return AAG;
//	}

	public void addChute(Chute c) {
		listaChute.add(c);
	}

	public void addGol(int x) {
		gol.add(x);
	}

	public int sorteiaX(int quadrante) {
		int x = 0;
		if (quadrante == 1 || quadrante == 2)
			x = random(0, 4);
		if (quadrante == 3 || quadrante == 4)
			x = random(5, 8);
		return x;
	}

	public int sorteiaY(int quadrante) {
		int y = 0;
		if (quadrante == 1 || quadrante == 3)
			y = random(0, 7);
		if (quadrante == 2 || quadrante == 4)
			y = random(8, 16);
		return y;
	}

	public int random(int min, int max) {
		Random random = new Random();
		return random.nextInt(min, max);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Chute> getListaChute() {
		return listaChute;
	}

	public void setListaChute(ArrayList<Chute> listaChute) {
		this.listaChute = listaChute;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getFlexibilidade() {
		return flexibilidade;
	}

	public void setFlexibilidade(int flexibilidade) {
		this.flexibilidade = flexibilidade;
	}

	public int getAgilidade() {
		return agilidade;
	}

	public void setAgilidade(int agilidade) {
		this.agilidade = agilidade;
	}

	public int getCoordenacao() {
		return coordenacao;
	}

	public void setCoordenacao(int coordenacao) {
		this.coordenacao = coordenacao;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getEquilibrio() {
		return equilibrio;
	}

	public void setEquilibrio(int equilibrio) {
		this.equilibrio = equilibrio;
	}

	public int getAAG() {
		return AAG;
	}

	public void setAAG(int aAG) {
		AAG = aAG;
	}

	public ArrayList<Integer> getGol() {
		return gol;
	}

	public void setGol(ArrayList<Integer> gol) {
		this.gol = gol;
	}

	public String getDefesa(int x, int y) {
		return defesa[x][y];
	}

	public void setDefesa(String defesa[][]) {
		this.defesa = defesa;
	}

	public int pontos(Goleiro g) {
		int total = 0;
		for (int n : g.getGol()) {
			total += n;
		}
		return total;
	}

	public void ondeAcertou(Goleiro g) {
		Mapeamento m = new Mapeamento();

		int trave = 0;
		int fora = 0;
		int angulo = 0;

		for (Chute chute : g.getListaChute()) {
			if (m.getLugar(chute.getX(), chute.getY()) == "0")
				fora++;
			if (m.getLugar(chute.getX(), chute.getY()) == "t")
				trave++;
			if (m.getLugar(chute.getX(), chute.getY()) == "t")
				angulo++;
		}

		System.out.println("Chutes que acertaram a trave: " + trave);
		System.out.println("Chutes que foram para fora: " + fora);
		System.out.println("Chutes no ângulo: " + angulo);
	}

}
