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
public class B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập bậc của đa thức
        System.out.print("Nhap vao bac cua da thuc: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng để lưu trữ hệ số của đa thức
        int[] coefficients = new int[n + 1];

        // Nhập các hệ số của đa thức
        System.out.println("Nhập vào các hệ số của đa thức:");
        for (int i = 0; i <= n; i++) {
            System.out.print("a[" + i + "]: ");
            coefficients[i] = scanner.nextInt();
        }

        // Nhập giá trị của x
        System.out.print("Nhập giá trị của x: ");
        int x = scanner.nextInt();

        // Tính giá trị của đa thức
        int result = evaluatePolynomial(coefficients, x);

        // Hiển thị kết quả
        System.out.println("Giá trị của đa thức tại x = " + x + " là: " + result);

        scanner.close();
    }

    // Phương thức tính giá trị của đa thức
    public static int evaluatePolynomial(int[] coefficients, int x) {
        int result = 0;
        int powerOfX = 1;

        // Duyệt qua từng hệ số và tính giá trị của từng thành phần của đa thức
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * powerOfX;
            powerOfX *= x;
        }

        return result;
    }
}
