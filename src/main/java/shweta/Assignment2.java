package shweta;

import java.util.Scanner;

class Matrix {
	int rows;
	int cols;
	int[][] aray;

	public void getAray() {
		for (int[] is : aray) {
			for (int i : is) {
				System.out.print(" " + i);
			}
			System.out.println("\n");
		}
	}

	public void setAray(Scanner scanner) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				aray[i][j] = scanner.nextInt();
			}
		}
	}

	public Matrix() {
		// TODO Auto-generated constructor stub
	}

	public Matrix(int rows, int cols) {
		super();
		this.rows = rows;
		this.cols = cols;
		aray = new int[rows][cols];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Matrix matrix = new Matrix(3, 3);
		matrix.setAray(scanner);
		matrix.getAray();
		scanner.close();
	}

}
