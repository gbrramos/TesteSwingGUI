package com.example.springui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.BorderLayout;

import javax.swing.*;

@SpringBootApplication
public class SpringuiApplication {

	public SpringuiApplication() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Controladora Rasp Control");
		frame.pack();
		frame.setVisible(true);
    }

	public static void main(String[] args) {
		new SpringuiApplication();

		SpringApplication.run(SpringuiApplication.class, args);
	}

}
