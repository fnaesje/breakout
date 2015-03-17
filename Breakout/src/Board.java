

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Board extends Application {
	private PlayArea pa = new PlayArea();  // The play area
	private BorderPane board = new BorderPane(); // Container for all panes (including play area)
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		board.setCenter(pa);
		board.setBottom(new ButtonBar(this));
		Scene scene = new Scene(board);
		primaryStage.setTitle("Breakout game");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false); // prevent resizing
		primaryStage.show();
	}
	public static void main(String[] args) {
	    launch(args);
	  }
}
