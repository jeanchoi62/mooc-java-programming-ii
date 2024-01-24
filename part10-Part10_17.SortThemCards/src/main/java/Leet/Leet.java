/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leet;

/**
 *
 * @author jeanmac
 */
public class Leet {
    public int[] plusOne(int[] digits) {
        int number = 0;
        int size = 10;
        // turn to real number
        for (int i = digits.length-1; i >= 0; i--) {
            int temp = digits[i];
            if (i == digits.length-1) {
                number += digits[i];
            } else {
                temp = temp * size;
                number += temp;
                size *= 10;
            }
        }
        number += 1;
        

        // 240 --> [2, 4, 0]

        String num = String.valueOf(number);
        System.out.println("NUM: " + num);
        int length = String.valueOf(number).length();
        System.out.println("String length: " + length);

        int[] list = new int[length];
        for (int i=0; i < length; i++) {
            list[i] = Integer.valueOf(num.charAt(i));
            System.out.println("INSIDE LOOP--- i: " + i + " num plain : " + Integer.valueOf(num.charAt(i)));
        }

        return list;
    }
    
    public static void main(String[] args) {
        Leet l = new Leet();
        int[] list = new int[] {2, 3, 9};
        System.out.println(l.plusOne(list));
        
    }
}
