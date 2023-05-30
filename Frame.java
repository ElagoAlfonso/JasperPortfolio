package JasperPortfolio;

import javax.swing.JFrame;

import JasperPortfolio.Displayable;

class Frame extends JFrame implements Displayable { 
	
 protected int width;   // Width of the frame
 protected int height;  // Height of the frame

 public Frame(int width, int height) {
     this.width = width;
     this.height = height;
     setSize(width, height);                          // Set the size of the frame
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set the default close operation
 }

 @Override
 public void display() {
     setVisible(true);  // Make the frame visible
 }
}

