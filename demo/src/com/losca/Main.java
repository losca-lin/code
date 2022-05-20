package com.losca;

import java.util.Scanner;

/**
 * @author Losca
 * @date 2022/5/20 16:16
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int a  = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
