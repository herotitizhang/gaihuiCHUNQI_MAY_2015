package GUI;

import java.awt.BorderLayout;
import java.net.Socket;

import javax.swing.JPanel;

public class ChessBoardPanel extends JPanel{
	
	private ChessBoard chessBoard;
	
	public void initializePanel(boolean moveFirst, Socket socket) {
		// switch to a chessboard TODO to be moved to somewhere else
		
		// set the layout
		chessBoard = new ChessBoard(moveFirst, socket);
//		this.setLayout(new BorderLayout());
		this.add(chessBoard);
		
		
	}

}
