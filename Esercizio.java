package it.edu.iisgubbio.CiaoMondo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class triangoloEquilatero extends Application {

	Label lAlejandro=new Label("Alejandro romero ordonez sei bellissimo, baciamoci");
	Label lmaialino=new Label("Menichetti miaialino polacco")
	TextField tLato=new TextField();
	 TextField tAltezza= new TextField();
	 Label lRisultato=new Label();
	 Label lNome=new Label("Anwar Belkheir, Alejandro Ordonez  Romero, Gabriele Menichetti, Daniele Morelli");
	 Label lData=new Label("2023");
	public void start (Stage finestra) {
		Button bArea=new Button("Calcolo area");
		Button bPerimetro=new Button("Calcolo perimetro");
		GridPane griglia=new GridPane();
		
		griglia.add(tLato, 0,1 );
		griglia.add(tAltezza, 0, 2);
		griglia.add(bArea, 0,3);
		griglia.add(lRisultato, 0, 5);
		griglia.add(bPerimetro, 0, 4);
		griglia.add(lNome, 0, 6);
		griglia.add(lData, 2, 7);

		Scene scena=new Scene(griglia);
		finestra.setTitle("Triangolo equilatero");
		finestra.setScene(scena);
		finestra.show();
		
		bArea.setOnAction(e->area());
		bPerimetro.setOnAction(e->perimetro());
		
				
		
	}
	public void perimetro() {
		double perimetro;
		double lato= Integer.parseInt(tLato.getText());	
		String risposta="";
		
		perimetro= (lato*3);
		risposta=""+perimetro;
		lRisultato.setText(risposta);	
	}
	public void area() {
		double area;
		double lato= Integer.parseInt(tLato.getText());
		double altezza= Integer.parseInt(tAltezza.getText());
		
		String risposta="";
		
		area= (lato*altezza)/2;
		risposta=""+area;
		lRisultato.setText(risposta);
	}
	public static void main(String []args) {
		launch(args);
		
	}
}
