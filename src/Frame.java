import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Frame {

	private static final int FRAME_WIDTH = 200;
	private static final int FRAME_HEIGHT = 120;

		
	private void createComponents()
	{
		Button btn = new Button();
		StackPane root = new StackPane();
		root.getChildren().add(btn);
	}
}
