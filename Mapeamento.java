package prova1;

public class Mapeamento {

	private String[][] posicao = new String[9][17];
	private int x, y;
	private int quadrante;

	public void mapear() {
		for (int i = 1, j = 1; j <= 15; j++)
			posicao[i][j] = "t";
		for (int i = 1, j = 1; i <= 8; i++)
			posicao[i][j] = "t";
		for (int i = 1, j = 15; i <= 8; i++)
			posicao[i][j] = "t";
		for (int i = 0, j = 0; j <= 16; j++)
			posicao[i][j] = "0";
		for (int i = 1, j = 0; i <= 8; i++)
			posicao[i][j] = "0";
		for (int i = 0, j = 16; i <= 8; i++)
			posicao[i][j] = "0";
		posicao[2][2] = "g";
		posicao[2][14] = "g";
	}

	public void imprimir() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				if (posicao[i][j] == null)
					System.out.print("- ");
				else
					System.out.print(posicao[i][j] + " ");
			}
			System.out.println();
		}
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
