package helloworldwithgradle;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class LoginScene extends Scene {
	
	Label lbUserName = new Label("Nome do Usuario:");
	TextField txtUserName = new TextField("Digite o username aqui...");

	public LoginScene(VBox vbox, double width, double height) {
		super(vbox, width, height);
		
		vbox.getChildren().add(lbUserName);
		vbox.getChildren().add(txtUserName);
	}

}

