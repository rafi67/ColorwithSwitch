/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package color;

import java.util.*;

/**
 *
 * @author rafis
 */
public class Color {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter color code: ");
        String color = input.nextLine();
        switch(color) {
            case "100" -> System.out.println("Red");
             case "010" -> System.out.println("Green");
             case "001" -> System.out.println("Blue");
             case "011" -> System.out.println("Cyan");
              case "101" -> System.out.println("Megenta");
              case "110" -> System.out.println("Yallo");
              case "111" -> System.out.println("White");
              case "000" -> System.out.println("Black");
        }
    }
    
}
