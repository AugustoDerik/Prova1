package prova1;

public class Chute {

	private int id;
	private int forca;
	private int quadrante;
	private int x;
	private int y;

	public void verificaQuadrante(int x, int y) {
		if (x <= 4 && x >= 0 && y <= 7 && y >= 0)
			quadrante = 1;
		if (x <= 4 && x >= 0 && y <= 16 && y >= 8)
			quadrante = 2;
		if (x <= 8 && x >= 5 && y <= 7 && y >= 0)
			quadrante = 3;
		if (x <= 8 && x >= 5 && y <= 16 && y >= 8)
			quadrante = 4;
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
