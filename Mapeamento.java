package prova1;

public class Mapeamento {

	private String[][] posicao = new String[9][17];
	private int x, y;
	private int quadrante;

	public void mapear() {
		for (int i = 1, j = 1; j <= 15; j++)
			posicao[i][j] = "trave superior";
		for (int i = 1, j = 1; i <= 8; i++)
			posicao[i][j] = "trave esquerda";
		for (int i = 1, j = 15; i <= 8; i++)
			posicao[i][j] = "trave direita";
		for (int i = 0, j = 0; j <= 16; j++)
			posicao[i][j] = "bola fora";
		for (int i = 1, j = 0; i <= 8; i++)
			posicao[i][j] = "bola fora";
		for (int i = 0, j = 16; i <= 8; i++)
			posicao[i][j] = "bola fora";
		posicao[2][2] = "angulo";
		posicao[2][15] = "angulo";
	}

	public String getPosicao(int x, int y) {
		return posicao[x][y];
	}

	public void setPosicao(String[][] posicao) {
		this.posicao = posicao;
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

	public int getQuadrante() {
		return quadrante;
	}

	public void setQuadrante(int quadrante) {
		this.quadrante = quadrante;
	}

}
