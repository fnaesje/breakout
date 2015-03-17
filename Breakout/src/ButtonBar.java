

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class ButtonBar extends HBox {
	Button level1 = new Button("Level 1"); // package visibility
	Button level2 = new Button("Level 2");
	Button level3 = new Button("Level 3");
	Label seconds = new Label("");
	
	public ButtonBar(Board b) {
		// super();
		setPadding(new Insets(5,5,5,5));
		getChildren().addAll(level1, level2, level3, seconds);
		setAlignment(Pos.CENTER);
	}

}
