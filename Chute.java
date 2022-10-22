package prova1;

import java.util.Random;

public class Chute {

	private int id;
	private int forca;
	private int quadrante;
	private int x;
	private int y;

	public int verificaQuadrante(int x, int y) {
		if (x <= 4 && x >= 0 && y <= 7 && y >= 0)
			quadrante = 1;
		if (x <= 4 && x >= 0 && y <= 16 && y >= 8)
			quadrante = 2;
		if (x <= 8 && x >= 5 && y <= 7 && y >= 0)
			quadrante = 3;
		if (x <= 8 && x >= 5 && y <= 16 && y >= 8)
			quadrante = 4;
		return quadrante;
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

	public Chute(int id, int f, int q, int x, int y) {
		this.id = id;
		forca = f;
		quadrante = q;
		this.x = x;
		this.y = y;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getQuadrante() {
		return quadrante;
	}

	public void setQuadrante(int quadrante) {
		this.quadrante = quadrante;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
