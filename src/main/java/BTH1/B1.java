/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH1;

import java.util.Scanner;

/**
 *
 * @author quang
 */
public class B1 {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int input;
        int v = 0;

        System.out.print("Enter the prediction number: ");
        input = scanner.nextInt();
        v++;

        do {
            if (input < randomNumber) {
                System.out.println("The number you guessed is smaller");
            } else if (input > randomNumber) {
                System.out.println("The number you guessed is larger");
            } else {
                System.out.println("You guessed it right");
            }
            input = scanner.nextInt();
        } while (input != randomNumber);

        System.out.printf("randomNumber is %d", randomNumber);
        scanner.close();
    }
}
