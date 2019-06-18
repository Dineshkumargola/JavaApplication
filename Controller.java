package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controller implements Initializable{
	
	static int count = 1;
	Pane pane1 ;
	@FXML
	private Button Button1;
	private Label exitLabel;
	@FXML
	private AnchorPane anchor;
	
	@FXML
	private Pane loginPane;
	
	
	@FXML
	public void exit(MouseEvent e)
	{
		Platform.exit();
	}
	
	@FXML
	public void minimize(MouseEvent e) {
		Stage stage = (Stage) anchor.getScene().getWindow();
		stage.setIconified(true);
	}
	
	@FXML
	public void registerWindow(MouseEvent e) {
		
		count++;
		if(count%2 == 0) {
			loginPane.setLayoutX(800);
		}else {
			loginPane.setLayoutX(203);
		}
	}
	
	@FXML
	public void loginBtn(MouseEvent e){
		
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
			
		
	}

}
