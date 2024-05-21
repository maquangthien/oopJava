/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author quang
 */
public class B3_DocFile {

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter email: ");
//        String emailAddress = scanner.nextLine();
//        String name = emailAddress.split("@")[0];
////     phương thức split("@") để chia chuỗi địa chỉ email thành một mảng các phần, sử dụng ký tự "@" làm dấu phân cách
//        System.out.println("name is mail is: " + name);
//        System.out.println("Enter String: ");
//        String string = scanner.nextLine();
//        int count = 0;
//        for (char c : string.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                count++;
//            }
//        }
//        System.out.println("Count upperCase in String is : " + count);
//
//        scanner.close();

        //Đọc dữ liệu từ một tập tin văn bản input.txt, thay thế tất cả các ký hiệu {file} thành
        //chuỗi “tập tin” và ghi kết kết quả vào tập tin output.txt.
        // file main->new folder resources
        //projecrs sẽ hiển thị 1 folder nằm trong Other Sources có tên src/main/resources
        File f;
        f = new File("src/main/resources/data.txt");
        try (Scanner fileScanner = new Scanner(f)) {
            String s = fileScanner.nextLine();
            System.out.println(s);
            fileScanner.close();
        }
        
    }
}
