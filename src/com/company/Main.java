package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));

    }
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (isValid(x) && isValid(y) && isValid(z)) {
            int LastX = x % 10;
            int LastY = y % 10;
            int LastZ = z % 10;
            if ((LastX == LastY) || (LastX == LastZ) || (LastY == LastZ) || (LastX == LastY && LastX == LastZ))
                return true;
            else
                return false;
        }
        else
            return false;
    }
        public static boolean isValid ( int num){
            if (num >= 10 && num <= 1000)
                return true;
            else
                return false;
        }
}
