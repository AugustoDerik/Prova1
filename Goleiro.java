package prova1;

import java.util.ArrayList;

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
	}

	public int AAG(int v, int flex, int ag, int c, int f, int eq) {

		velocidade = v;
		flexibilidade = flex;
		agilidade = ag;
		coordenacao = c;
		forca = f;
		equilibrio = eq;

		int AAG = (v * 3) + (flex * 2) + (ag * 3) + (c * 2) + (f) + (eq * 2) / 8;

		return AAG;
	}

	public void addChute(Chute c) {
		listaChute.add(c);
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

}
