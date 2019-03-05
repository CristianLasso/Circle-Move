package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import thread.Threads;

public class CircleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane pane;
    
    @FXML
    private Rectangle shape;

    @FXML
    private Button move;

    @FXML
    private Button stop;
    
    private Threads t;
    
    @FXML
    void move(ActionEvent event) {
    	t = new Threads(this);
    	t.start();
    	
    	stop.setDisable(false);
    	move.setDisable(true);
    }
    
	@FXML
    void stop(ActionEvent event) {
    	stop.setDisable(true);
    	move.setDisable(false);
    	t.s();
    	
    }
    
    public boolean rigth(boolean r) {
    	if(r) {
    		shape.setLayoutX(shape.getLayoutX()+5);
    		shape.setRotate(shape.getRotate()+4);
    		System.out.println("Derecha");
    	}
    	if(shape.getLayoutX()>=pane.getWidth()-shape.getWidth()) {
			r = false;
		}
		return r;
    }
    
    public boolean left(boolean r) {
    	if(!r) {
    		shape.setLayoutX(shape.getLayoutX()-5);
    		shape.setRotate(shape.getRotate()-4);
    		System.out.println("Izquierda");
    	}
    	if(shape.getLayoutX()<=0) {
			r = true;
		}	
		return r;
    }

    @FXML
    void initialize() {
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'Circle.fxml'.";
        assert shape != null : "fx:id=\"shape\" was not injected: check your FXML file 'Circle.fxml'.";

    }
}

