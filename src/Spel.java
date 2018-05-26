import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.*;
import javafx.scene.control.Button;

public class Spel extends Application{

    public static void main(String[]args) {

        launch(args);
    }

    public void start(Stage stage) {
    	
    	// BJ bouw de startknop
    	Button btn = new Button();
        btn.setText("Start spel");
        btn.setLayoutX(270);
        btn.setLayoutY(180);
        
		btn.setOnAction(new EventHandler<ActionEvent>()
	    {
	        public void handle(ActionEvent e)
	        {           
	        	// BJ maak de 20x20 GridPane aan en teken de gridlines
	            GridPane grid = new GridPane();
	            grid.setGridLinesVisible(true);
	            
	            final int numCols = 20 ;
	            final int numRows = 20 ;
	            for (int i = 0; i < numCols; i++) {
	                ColumnConstraints colConst = new ColumnConstraints();
	                colConst.setPercentWidth(100.0 / numCols);
	                grid.getColumnConstraints().add(colConst);
	            }
	            for (int i = 0; i < numRows; i++) {
	                RowConstraints rowConst = new RowConstraints();
	                rowConst.setPercentHeight(100.0 / numRows);
	                grid.getRowConstraints().add(rowConst);         
	            }
	        	
	            Button btn2 = new Button();
	            Button btn3 = new Button();
	            Button btn4 = new Button();
	            Button btn5 = new Button();
	            Button btn6 = new Button();
	            Button btn7 = new Button();
	            Button btn8 = new Button();
	            
	            Rectangle rekt = new Rectangle(20,20);
	            Speler speler1 = new Speler(3);
	            
	            btn2.setPrefSize(25, 15);
	            btn3.setPrefSize(25, 15);
	            btn4.setPrefSize(25, 15);
	            btn5.setPrefSize(25, 15);
	            btn6.setPrefSize(25, 15);
	            btn7.setPrefSize(25, 15);
	            btn8.setPrefSize(25, 15);
	            
	            grid.add(speler1, 0,0);
	            grid.add(rekt, 10, 11);
	            grid.add(btn2, 1,1);
	            grid.add(btn3, 2,8); 
	            grid.add(btn4, 4,6); 
	            grid.add(btn5, 7,9); 
	            grid.add(btn6, 7,10); 
	            grid.add(btn7, 14,3); 
	            grid.add(btn8, 18,6); 	                        
	        
	            
	        	Scene scene2 = new Scene(grid, 600, 600);
	        	stage.setScene(scene2);
	        	stage.setResizable(false);
	            stage.show();	            
	        }
	    });
		
        
        
        // BJ bouw de start tekst
        Text startText = new Text();
        startText.setText("Het spel zal automatisch beginnen over 5 seconden");
        startText.setLayoutX(180);
        startText.setLayoutY(170);
        
        // BJ bouw de game naam tekst
        Text gameNaamText = new Text();
        gameNaamText.setText("HAPPER GAME - FICTION");
        gameNaamText.setLayoutX(180);
        gameNaamText.setLayoutY(80);
        gameNaamText.setFont(Font.font("Digital-7", 24));

        // BJ maak de Pane aan en voeg de elementen toe
        Pane layout = new Pane();
        layout.getChildren().add(btn);
        layout.getChildren().add(startText);
        layout.getChildren().add(gameNaamText);

        //BJ maak de scene aan voeg deze toe aan de stage en toon deze
        Scene scene1 = new Scene(layout, 600, 300);
        stage.setScene(scene1);
        stage.setTitle("Happer");
        stage.setResizable(false);
        stage.show();
    }
}
