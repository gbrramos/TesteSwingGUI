package javaspringui.test.springswinggui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class SpringswingguiApplication {

	
    public GUI(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
    }

	public static void main(String[] args) {
		new GUI();
		SpringApplication.run(SpringswingguiApplication.class, args);
	}

}
