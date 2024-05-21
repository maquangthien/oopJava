/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH1;
//
//Cho mảng gồm n số nguyên. Lập trình giải các bài toán sau

import java.util.Arrays;
import java.util.Scanner;

//a) Tính tổng các số nguyên tố.
//b) Tìm số dương lớn nhất và số âm bé nhất trong dãy. Trong trường hợp không có số
//âm hay số dương nào trong dãy thì in ra *.
//c) Tìm số nguyên tố nhỏ nhất trong mảng.
//d) Sắp xếp các số nguyên tố tăng dần, các số còn lại giữ nguyên vị trí.
//e) Nhập x, tìm vị trí xuất hiện của x bằng tìm kiếm nhị phân.
public class B4 {
    
    // a) Tính tổng các số nguyên tố
    public static int sumOfPrimes(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        return sum;
    }
    
     // Kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // b) Tìm số dương lớn nhất và số âm bé nhất trong dãy
    public static void findMaxMin(int[] arr) {
        int maxPositive = Integer.MIN_VALUE;
        int minNegative = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > 0 && num > maxPositive) {
                maxPositive = num;
            }
            if (num < 0 && num < minNegative) {
                minNegative = num;
            }
        }

        String maxPosStr = (maxPositive != Integer.MIN_VALUE) ? String.valueOf(maxPositive) : "*";
        String minNegStr = (minNegative != Integer.MAX_VALUE) ? String.valueOf(minNegative) : "*";

        System.out.println("Largest positive number: " + maxPosStr);
        System.out.println("Smallest negative number: " + minNegStr);
    }

    // c) Tìm số nguyên tố nhỏ nhất trong mảng
    public static int findMinPrime(int[] arr) {
        int minPrime = Integer.MAX_VALUE;
        for (int num : arr) {
            if (isPrime(num) && num < minPrime) {
                minPrime = num;
            }
        }
        return minPrime;
    }

//    // d) Sắp xếp các số nguyên tố tăng dần, các số còn lại giữ nguyên vị trí
//    public static void sortPrimes(int[] arr) {
//        int[] primes = Arrays.stream(arr)
//                             .filter(ArrayProblems::isPrime)
//                             .sorted()
//                             .toArray();
//
//        int primeIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (isPrime(arr[i])) {
//                arr[i] = primes[primeIndex++];
//            }
//        }
//    }


    // e) Tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int x) {
        Arrays.sort(arr); // Tìm kiếm nhị phân yêu cầu mảng phải được sắp xếp
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Không tìm thấy
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // a) Tính tổng các số nguyên tố
        int sumPrimes = sumOfPrimes(arr);
        System.out.println("Sum prime number: " + sumPrimes);

        // c) Tìm số nguyên tố nhỏ nhất trong mảng
        int minPrime = findMinPrime(arr);
        if (minPrime != Integer.MAX_VALUE) {
            System.out.println("smallest prime number: " + minPrime);
        } else {
            System.out.println("there are no prime numbers");
        }

//        // d) Sắp xếp các số nguyên tố tăng dần, các số còn lại giữ nguyên vị trí
//        sortPrimes(arr);
//        System.out.println("Mảng sau khi sắp xếp các số nguyên tố tăng dần: " + Arrays.toString(arr));

        // e) Nhập x, tìm vị trí xuất hiện của x bằng tìm kiếm nhị phân
        System.out.print("Enter search number: ");
        int x = scanner.nextInt();
        int pos = binarySearch(arr, x);
        if (pos != -1) {
            System.out.println("location appears " + x + " is: " + pos);
        } else {
            System.out.println("not foud " + x );
        }

        scanner.close();
    }

    

   
    
}
