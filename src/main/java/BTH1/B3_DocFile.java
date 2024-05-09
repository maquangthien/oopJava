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
public class B3_DocFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email: ");
        String emailAddress = scanner.nextLine();
        String name = emailAddress.split("@")[0];
//     phương thức split("@") để chia chuỗi địa chỉ email thành một mảng các phần, sử dụng ký tự "@" làm dấu phân cách
        System.out.println("name is mail is: " + name);
        System.out.println("Enter String: ");
        String string = scanner.nextLine();
        int count = 0;
        for (char c : string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
                System.out.println("Count upperCase in String is : " + count);

        scanner.close();

    }

}
