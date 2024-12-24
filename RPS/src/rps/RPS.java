/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rps;

import javax.swing.JOptionPane;

/**
 *
 * @author dwayn
 */
public class RPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            int randomNum = (int) (Math.random() * 3 + 1);
            String cpuAnswer = "";
            String userAnswer = "";
            
            switch(randomNum) {
            case 1:
                cpuAnswer = "Rock";
                userAnswer = JOptionPane.showInputDialog("Rock, Paper or Scissors?");
                if (userAnswer.equals("Paper")) {
                    System.out.println("CPU chose Rock, You WON!");
                } else if (userAnswer.equals("Scissors")) {
                    System.out.println("CPU chose Rock, you LOSE!");
                }
                break;
            case 2:
                cpuAnswer = "Paper";
                userAnswer = JOptionPane.showInputDialog("Rock, Paper or Scissors?");
                if (userAnswer.equals("Scissors")) {
                    System.out.println("CPU chose Paper, You WON!");
                } else if (userAnswer.equals("Rock")) {
                    System.out.println("CPU chose Paper, you LOSE!");
                }
                break;
            case 3:
                cpuAnswer = "Scissor";
                userAnswer = JOptionPane.showInputDialog("Rock, Paper or Scissors?");
                if (userAnswer.equals("Rock")) {
                    System.out.println("CPU chose Scissor, You WON!");
                } else if (userAnswer.equals("Paper")) {
                    System.out.println("CPU chose Scissor, you LOSE!");
                }
                break;
            }
        
    }
    
}
