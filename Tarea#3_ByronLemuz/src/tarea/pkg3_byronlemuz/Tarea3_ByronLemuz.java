/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg3_byronlemuz;
import java.util.Scanner;
/**
 *
 * @author lesly
 */
public class Tarea3_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    
    

public class RobotGame {
    static char[][] tablero = {
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', 'X', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' '},
            {' ', 'X', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' '},
            {' ', 'X', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' '},
            {' ', 'X', 'C', 'C', 'C', 'X', ' ', ' ', ' ', ' '},
            {' ', 'X', 'X', 'X', 'X', 'X', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', 'R', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', 'O', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    };
    static int posicionRobotX = 7;
    static int posicionRobotY = 8;
    static int cajasRecogidas = 0;
    static boolean objetivoAlcanzado = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movimientos = "";

        System.out.println("Ingresa los movimientos del robot separados por comas:");
        movimientos = scanner.nextLine();
        String[] movimientosArray = movimientos.split(",");

        for (String movimiento : movimientosArray) {
            moverRobot(movimiento);
            imprimirTablero();
            if (objetivoAlcanzado) {
                System.out.println("¡Felicidades! Has alcanzado el objetivo.");
                break;
            }
        }
        if (!objetivoAlcanzado) {
            System.out.println("Has perdido.");

    }
    
}

        private static void moverRobot(String movimiento) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void imprimirTablero() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }}