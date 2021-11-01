package com.example.springui;

import java.util.stream.IntStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


@SpringBootApplication
public class SpringuiApplication extends Application{

	
	public static void main(String[] args) {
		launch(args);
		// SpringApplication.run(SpringuiApplication.class, args);
		// System.out.println("ok");
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setTitle("Controladora Rasp Control");
		Circle circleCancelaEntrada = new Circle();
		Circle circleTriggerEntrada = new Circle();
		Circle circleCancelaSaida = new Circle();
		Circle circlePortaoInterno = new Circle();
		Circle circlePortaoExterno = new Circle();
		Circle circlePresencaEntrada = new Circle();
		Circle circlePresencaSaida = new Circle();
		Circle circleTriggerSaida = new Circle();
		Rectangle rtgAction = new Rectangle();
		Label lblCancelaEntrada = new Label();
		Label lblPresencaEntrada = new Label();
		Label lblPresencaSaida = new Label();
		Label lblPortaoInterno = new Label();
		Label lblPortaoExterno = new Label();
		Label lblCancelaSaida = new Label();
		Label lblTriggerEntrada = new Label();
		Label lblTriggerSaida = new Label();
		Label lblAction = new Label();
		StackPane layout = new StackPane();

		circlePresencaEntrada.setRadius(8);
        circlePresencaEntrada.setFill(Color.web("#f00", 1.0));
        circlePresencaEntrada.setStroke(Color.web("#000", 1.0));
        circlePresencaEntrada.setTranslateX(-160);
        circlePresencaEntrada.setTranslateY(-100);

		lblPresencaEntrada.setTranslateX(-77);
        lblPresencaEntrada.setTranslateY(-100);
        lblPresencaEntrada.setText("Presença de Entrada");

		circleCancelaEntrada.setRadius(8);
        circleCancelaEntrada.setFill(Color.web("#f00", 1.0));
        circleCancelaEntrada.setStroke(Color.web("#000", 1.0));
        circleCancelaEntrada.setTranslateX(-160);
        circleCancelaEntrada.setTranslateY(-70);

        lblCancelaEntrada.setTranslateX(-80);
        lblCancelaEntrada.setTranslateY(-70);
        lblCancelaEntrada.setText("Cancela de Entrada");

        circlePortaoExterno.setRadius(8);
        circlePortaoExterno.setFill(Color.web("#f00", 1.0));
        circlePortaoExterno.setStroke(Color.web("#000", 1.0));
        circlePortaoExterno.setTranslateX(-160);
		circlePortaoExterno.setTranslateY(-40);

        lblPortaoExterno.setTranslateX(-90);
		lblPortaoExterno.setTranslateY(-40);
        lblPortaoExterno.setText("Portao Externo");

        circlePortaoInterno.setRadius(8);
        circlePortaoInterno.setFill(Color.web("#f00", 1.0));
        circlePortaoInterno.setStroke(Color.web("#000", 1.0));
        circlePortaoInterno.setTranslateX(-160);
        circlePortaoInterno.setTranslateY(-10);

        lblPortaoInterno.setTranslateY(-10);
		lblPortaoInterno.setTranslateX(-90);
        lblPortaoInterno.setText("Portao Interno");

		circleCancelaSaida.setRadius(8);
        circleCancelaSaida.setFill(Color.web("#f00", 1.0));
        circleCancelaSaida.setStroke(Color.web("#000", 1.0));
        circleCancelaSaida.setTranslateX(-160);
        circleCancelaSaida.setTranslateY(20);

        lblCancelaSaida.setTranslateX(-85);
        lblCancelaSaida.setTranslateY(20);
        lblCancelaSaida.setText("Cancela de Saída");

		circlePresencaSaida.setRadius(8);
        circlePresencaSaida.setFill(Color.web("#f00", 1.0));
        circlePresencaSaida.setStroke(Color.web("#000", 1.0));
        circlePresencaSaida.setTranslateX(-160);
        circlePresencaSaida.setTranslateY(50);

		lblPresencaSaida.setTranslateX(-80);
        lblPresencaSaida.setTranslateY(50);
        lblPresencaSaida.setText("Presença de Saida");

		lblTriggerEntrada.setTranslateX(90);
		lblTriggerEntrada.setTranslateY(-40);
        lblTriggerEntrada.setText("Trigger Entrada");

		circleTriggerEntrada.setRadius(8);
        circleTriggerEntrada.setFill(Color.web("#f00", 1.0));
        circleTriggerEntrada.setStroke(Color.web("#000", 1.0));
        circleTriggerEntrada.setTranslateX(20);
		circleTriggerEntrada.setTranslateY(-40);

		lblTriggerSaida.setTranslateX(84);
		lblTriggerSaida.setTranslateY(-10);
        lblTriggerSaida.setText("Trigger Saída");

		circleTriggerSaida.setRadius(8);
        circleTriggerSaida.setFill(Color.web("#f00", 1.0));
        circleTriggerSaida.setStroke(Color.web("#000", 1.0));
        circleTriggerSaida.setTranslateX(20);
        circleTriggerSaida.setTranslateY(-10);

        rtgAction.setWidth(250);
        rtgAction.setHeight(50);
        rtgAction.setStroke(Color.web("#000"));
        rtgAction.setFill(Color.web("#fff"));
        rtgAction.setTranslateY(110);
		
		lblAction.setText("Portões fechados");
		lblAction.setTranslateY(110);
		lblAction.setTranslateX(0);

		layout.getChildren().add(circlePresencaEntrada);
		layout.getChildren().add(circleCancelaEntrada);
		layout.getChildren().add(circlePresencaSaida);
		layout.getChildren().add(lblPresencaSaida);
		layout.getChildren().add(lblCancelaEntrada);
		layout.getChildren().add(lblCancelaSaida);
		layout.getChildren().add(lblPresencaEntrada);
		layout.getChildren().add(circleCancelaSaida);
		layout.getChildren().add(lblPortaoInterno);
		layout.getChildren().add(circlePortaoInterno);
		layout.getChildren().add(lblPortaoExterno);
		layout.getChildren().add(circleTriggerEntrada);
		layout.getChildren().add(circleTriggerSaida);
		layout.getChildren().add(circlePortaoExterno);
		layout.getChildren().add(lblTriggerEntrada);
		layout.getChildren().add(lblTriggerSaida);
		layout.getChildren().add(rtgAction);
		layout.getChildren().add(lblAction);

		Scene scene = new Scene(layout, 480, 320);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
