package application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Scale;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TipController {
	    
	public void logIn(){
		System.out.println("Login successful.");
	}
	public void billings(){
		System.out.println("Billings is the best town in the state.");
	}
	
	public void handle(WindowEvent event) {
	}
	
	@FXML 
	private TextField amountTextField;
	
	@FXML 
	private TextField totalTextField;
	
	@FXML 
	private void calculateButtonPressed(ActionEvent event) {
		Float mealAmount = Float.parseFloat(amountTextField.getText());
		//20% increase
		totalTextField.setText(String.valueOf(mealAmount * (1 + .20)));
	}
	
}