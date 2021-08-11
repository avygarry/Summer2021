package com.TicTacToeGame;
public class TicTacToeGame {
	public char[] cellValues;

	public void main(String[] args) {
	
	char[] cellValue = new char[9];
	cellValues = cellValue;
	}
	
	public void printGame() {
		System.out.println("\t\t 1  |  2  |  3  |");
		System.out.println("\t\t__________");
		System.out.println(" ");
		System.out.println("\t\t  4  |  5  |  6  |");
		System.out.println("\t\t__________");
		System.out.println(" ");
		System.out.println("\t\t  7  |  8  | 9  |");
		System.out.println("\t\t__________");
	}
	public char playTurn (int aCellNumber, char aSymbol) {
		if (cellValues[aCellNumber] == 'X' || cellValues[aCellNumber] == 'O') {
			return 'E';
		} else {
			cellValues[aCellNumber - 1] = aSymbol;
			return
		}
	}
	
	public char isGameOver() {
		if (cellValues[0] == 'X' && cellValues[1] == 'X' && cellValues[2] == 'X') {
			return 'W';
		} else if (cellValues[3] == 'X' && cellValues[4] == 'X' && cellValues[5] == 'X') {
			return 'W';
		} else if (cellValues[6] == 'X' && cellValues[7] == 'X' && cellValues[8] == 'X') {
			return 'W';
		} else if (cellValues[0] == 'X' && cellValues[3] == 'X' && cellValues[6] == 'X') {
			return 'W';
		} else if (cellValues[1] == 'X' && cellValues[4] == 'X' && cellValues[7] == 'X') {
			return 'W';
		} else if (cellValues[2] == 'X' && cellValues[5] == 'X' && cellValues[8] == 'X') {
			return 'W';
		} else if (cellValues[0] == 'X' && cellValues[4] == 'X' && cellValues[8] == 'X') {
			return 'W';
		} else if (cellValues[2] == 'X' && cellValues[4] == 'X' && cellValues[6] == 'X') {
			return 'W';
		}
		
		if (cellValues[0] == 'O' && cellValues[1] == 'O' && cellValues[2] == 'O') {
			return 'W';
		} else if (cellValues[3] == 'O' && cellValues[4] == 'O' && cellValues[5] == 'O') {
			return 'W';
		} else if (cellValues[6] == 'O' && cellValues[7] == 'O' && cellValues[8] == 'O') {
			return 'W';
		} else if (cellValues[0] == 'O' && cellValues[3] == 'O' && cellValues[6] == 'O') {
			return 'W';
		} else if (cellValues[1] == 'O' && cellValues[4] == 'O' && cellValues[7] == 'O') {
			return 'W';
		} else if (cellValues[2] == 'O' && cellValues[5] == 'O' && cellValues[8] == 'O') {
			return 'W';
		} else if (cellValues[0] == 'O' && cellValues[4] == 'O' && cellValues[8] == 'O') {
			return 'W';
		} else if (cellValues[2] == 'O' && cellValues[4] == 'O' && cellValues[6] == 'O') {
			return 'W';
		}
		return false;
	}
	

	public char[] getCellValues() {
		return cellValues;
	}

	public void setCellValues(char[] cellValues) {
		this.cellValues = cellValues;
	}
}
