package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class vettoriMedia extends Application {

	TextField tNumero = new TextField();
	TextField tDimensione = new TextField();

	Button bAlloca = new Button("ALLOCA");
	Button bInserisci = new Button("INSERISCI");
	Button bStampa = new Button("STAMPA");

	Label lElenco = new Label();
	Label lMedia = new Label();
	Label lConta = new Label("");

	int numTempi;
	int vettore[];
	int posizione;
	int conta;
	int somma;
	int media;
	String risposta;

	public void start(Stage finestra) {

		GridPane griglia = new GridPane();

		griglia.add(tNumero, 0, 0);
		griglia.add(tDimensione, 1, 0);
		griglia.add(bAlloca, 0, 1);
		griglia.add(bInserisci, 0, 2);
		griglia.add(bStampa, 0, 3);
		griglia.add(lElenco, 0, 4, 2, 1);
		griglia.add(lMedia, 0, 5);
		griglia.add(lConta, 1, 3);

		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.setPadding(new Insets(10));

		bAlloca.setOnAction(e -> alloca());
		bInserisci.setOnAction(e -> inserisci());
		bStampa.setOnAction(e -> stampa());

		Scene scena = new Scene(griglia);

		finestra.setTitle("Vettori");
		finestra.setScene(scena);
		finestra.show();

	}

	public void alloca() {
		numTempi = Integer.parseInt(tDimensione.getText());
		vettore = new int[numTempi];
		posizione = 0;
		conta = Integer.parseInt(tDimensione.getText());
		lConta.setText("" + conta);

	}

	public void inserisci() {

		

		if (posizione < numTempi) {
			vettore[posizione++] = Integer.parseInt(tNumero.getText());
			tNumero.setText("");
			conta -= 1;
			lConta.setText("" + conta);
			
		}

	}

	public void stampa() {
		
	
		String s="";
		for (int i = 0; i < numTempi; i++) {
			s=s+vettore[i] +"-";
			somma=somma+vettore[i];
		}
		lElenco.setText(s);

		media = somma / numTempi;
		risposta = "" + media;
		lMedia.setText(risposta);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
