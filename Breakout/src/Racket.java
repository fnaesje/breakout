

import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Racket extends Rectangle {
	
	private PlayArea pa;
	public Racket(PlayArea pa) {
		// the getPrefXXX methods returns pixel dimension even if
		// the node is not displayed yet (if SET wit setPrefXXX...)
		super(pa.getPrefWidth()/2,(pa.getPrefHeight()/10)*8, 80, 20);
		this.pa = pa;
		this.setFill(Color.RED);
	}
	public void move(MouseEvent e) {
		if (getWidth() + getX() <= pa.getWidth())
			   setX(e.getX());
			else
			   setX(pa.getWidth() - getWidth());
		
	}
}
