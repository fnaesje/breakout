
import java.util.ArrayList;

public class BlockOfBricks {
	final int spacing = 2;
	ArrayList<Brick> theBricks = new ArrayList<Brick>();
	private int numWidth, numHeight;
	private int brickWidth, brickHeight;
	public BlockOfBricks(PlayArea pa, int numHeight, int numWidth) {
		this.numWidth = numWidth;
		this.numHeight = numHeight;
		
		// calculate the size of the Bricks based on space available
		int totalWidth = (int) pa.getPrefWidth();
		int totalHeight = (int) pa.getPrefHeight() / 2;
		// provide some space around the bricks
		brickWidth = (totalWidth - (spacing * numWidth - 1))/ (numWidth + 2);
		brickHeight = totalHeight / (numHeight + 2);
		// Build the wall of Bricks
		int startX = brickWidth;
		int nowX = startX;
		int nowY = brickWidth;
		for (int i = 1; i <= numHeight * numWidth; i++) {
			Brick thisBrick = new Brick(nowX, nowY, brickWidth, brickHeight);
			theBricks.add(thisBrick);
			pa.getChildren().add(thisBrick);
			if (i % numWidth == 0) {
				nowX = startX;
				nowY += brickHeight + spacing;
			}
			else
				nowX += brickWidth + spacing;
		}
	
	}
}
