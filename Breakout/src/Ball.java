
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Ball extends Circle {
	public final static double rad = 10;
	private double dx = 3, dy = 3;
	private PlayArea pa;
	private Timeline animation;

	  public Ball(PlayArea pa) {		
	    super(rad,rad,rad);
	    this.pa = pa;
	    setFill(Color.GREEN); // Set ball color
	    
	    // Create an animation for moving the ball
	    animation = new Timeline(
	      new KeyFrame(Duration.millis(50), e -> moveBall()));
	    animation.setCycleCount(Timeline.INDEFINITE);
	    animation.play(); // Start animation
	  }

	  public void play() {
	    animation.play();
	  }

	  public void pause() {
	    animation.pause();
	  }

	  public void increaseSpeed() {
	    animation.setRate(animation.getRate() + 0.1);
	  }

	  public void decreaseSpeed() {
	    animation.setRate(
	      animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
	  }

	  public DoubleProperty rateProperty() {
	    return animation.rateProperty();
	  }
	  
	  protected void moveBall() {
	    // Check boundaries of PlayArea
	    if (this.getCenterX() < rad || getCenterX() > pa.getWidth() - rad) {
	      dx *= -1; // Change ball move direction
	    }
	    if (this.getCenterY() < rad || this.getCenterY() > pa.getHeight() - rad) {
	      dy *= -1; // Change ball move direction
	    }

	    // Adjust ball position
	    this.setCenterX(getCenterX() + dx);
	    this.setCenterY(getCenterY() + dy);
	    
	  }

}
