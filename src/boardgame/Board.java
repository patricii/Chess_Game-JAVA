package boardgame;

public class Board {
	
	private int rows;
	private int colunms;
	private Piece[][] pieces;
	
	public Board(int rows, int colunms) {
		if(rows < 1 || colunms < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row an 1 column!!!");
		}
		this.rows = rows;
		this.colunms = colunms;
		pieces = new Piece[rows][colunms];
	}

	public int getRows() {
		return rows;
	}

	public int getColunms() {
		return colunms;
	}

	public Piece piece(int row , int colunm) {
		if(!positionExist(row , colunm))
		{
			throw new BoardException("Error : Position not on the board!");
		}
		return pieces[row][colunm];
	}
	
	public Piece piece(Position position) {
		if(!positionExist(position))
		{
			throw new BoardException("Error : Position not on the board!");
		}
		return pieces[position.getRow()][position.getColunms()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on this position: " + position);
		}
		pieces[position.getRow()][position.getColunms()] = piece;
		piece.position = position;
	}
	
	public boolean positionExist(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < colunms;
		
	}
	
	public boolean positionExist(Position position) {
		
		return positionExist(position.getRow(),position.getColunms());

	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExist(position))
		{
			throw new BoardException("Error : Position not on the board!");
		}
		return piece(position) != null;
	}

}
