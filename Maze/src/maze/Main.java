package maze;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Main {

	//Maze game created by Kevin George
	//APCS 2016 bois
	
	JFrame Window = new JFrame("Maze");
    JButton Begin = new JButton("Play");
    JButton Exit = new JButton("Exit");   
    ArrayList<String> map = new ArrayList<String>();
    int WindowWidth = 00; //Width of each button/item on display
    int WindowHeight = 50;//Height of each button/item on display
    int WindowY = 500; //Button/item location on display
    int width = 500;
    int height = 500;
	
	public Main(){
		Window.setResizable(false);
        Window.setSize(width, height);
        Window.setLayout(null);
        Window.setLocationRelativeTo(null);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Begin.setSize(WindowWidth,WindowHeight);
        Begin.setLocation(10, WindowY);
        Window.add(Begin);
        Window.setVisible(true);
        Begin.addActionListener(new ActionListener(){

        	@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Window.setVisible(true);
			}
        	
        });	
        
        
		
	}
	public static void main(String args[]){
    	new Main();
    	
    }
		
		
	}

	


	    
	    
	
	

