/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author HP
 */
public class mainFrame extends JFrame{
    public void init(){
        setTitle("Welcome");
        setSize(400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        mainFrame myFrame=new mainFrame();
        myFrame.init();
    }
}
