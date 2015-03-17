

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Brick extends Rectangle {
	private boolean isVisible;   // true means: should collide
	public Brick(int x, int y, int w, int h) {
		super(x,y,w,h);
		this.setFill(Color.LIGHTBLUE);
	}
	
}
