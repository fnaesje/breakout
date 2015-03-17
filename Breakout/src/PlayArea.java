

import javafx.scene.layout.Pane;

public class PlayArea extends Pane {
	public final int WIDTH = 600;
	public final int HEIGHT = 400;
	Racket r;
	Ball b;
	BlockOfBricks bob;
	public PlayArea() {
		this.setPrefWidth(WIDTH); // Forces Main window's width to this width
		this.setPrefHeight(HEIGHT); // Forces Main window's height to this height
		b = new Ball(this); // Make a Ball that bounces
		r = new Racket(this); // Make a Racket to hit the Ball
		getChildren().addAll(r,b);  // Add racket and ball to playarea
		this.setStyle("-fx-border-color: black");
		bob = new BlockOfBricks(this, 10, 10);
		
		// The mouse is moved in the PlayArea Pane,
		// so the action listener must be defined here
		// but the racket itself is responsible to move itself...
		setOnMouseMoved(e -> {r.move(e);});
			

	} 
}
