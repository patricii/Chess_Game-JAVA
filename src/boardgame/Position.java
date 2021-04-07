package boardgame;

public class Position {
	
	private int row;
	private int colunms;
	
	public Position() {
		super();
	}
	public Position(int row , int colunms) {
		this.row = row;
		this.colunms = colunms;
		
	}	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColunms() {
		return colunms;
	}
	public void setColunms(int colunms) {
		this.colunms = colunms;
	}
	
	public String ToString() {
		return row + ", " + colunms;
	}

}
