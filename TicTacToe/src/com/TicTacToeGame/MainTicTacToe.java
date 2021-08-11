package com.TicTacToeGame;

public class MainTicTacToe {
	
	public static void main(String[] args) {
		TicTacToeGame game = new TicTacToeGame();
		char gameStatus = 'I';
		while (gameStatus == 'I') {
			char currentSymbol = 'X';
			game.printGame();
			int selectedCell = ReadUserInput.readUserIntInput("Enter cell number " + currentSymbol + " : ");
			game.playTurn(selectedCell, currentSymbol);
			
			
		}
		}
	}
