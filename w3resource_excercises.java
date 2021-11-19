// Ejercicios de https://www.w3resource.com/java-exercises/basic/index.php

import java.util.Scanner;

class Ejercicio5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Primer número: ");
        int n1 = in.nextInt();

        System.out.println("Segundo número: ");
        int n2 = in.nextInt();

        System.out.println("Resultado: " + n1*n2);


    }
}

class Ejercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");

        int number = input.nextInt();

        for (int i = 0; i<10; i++){

            System.out.println(number + " x " + (i+1) + " = " + number*(i+1));

        }

    }
}

class Ejercicio8 {
    public static void main(String[] args) {

        System.out.println("   J    a   v     v  a\n   J   a a   v   v  a a\nJ  J  aaaaa   V V  aaaaa\n JJ  a     a   V  a     a");

    }
}

class Ejercicio9 {
    public static void main(String[] args) {

        System.out.println((25.5*3.5-3.5*3.5)/(40.5-4.5));

    }
}

class Ejercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Radius = ");
        float r = input.nextFloat();

        System.out.println("Perimeter = " + (2*Math.PI*r) + "\nArea = " + (Math.PI*Math.pow(r,2)));

    }
}

class Ejercicio17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Binary 1: ");
        String b1 = input.next();
        System.out.println("Binary 2: ");
        String b2 = input.next();

        int ib1 = Integer.parseInt(b1,2);
        int ib2 = Integer.parseInt(b2,2);
        int sum = ib1+ib2;

        System.out.println("Resultado: " + Integer.toBinaryString(sum));

    }
}

class Ejercicio18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Binary 1: ");
        String b1 = input.next();
        System.out.println("Binary 2: ");
        String b2 = input.next();

        int ib1 = Integer.parseInt(b1,2);
        int ib2 = Integer.parseInt(b2,2);
        int mult = ib1*ib2;

        System.out.println("Resultado: " + Integer.toBinaryString(mult));

    }
}

class Ejercicio19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Decimal: ");
        int b1 = input.nextInt();

        System.out.println("Resultado: " + Integer.toBinaryString(b1));

    }
}

class Ejercicio20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Decimal: ");
        int n = input.nextInt();

        System.out.println("Resultado: " + Integer.toHexString(n));

    }
}

class Ejercicio31 {
    public static void main(String[] args) {

        System.out.println("Java version: " + System.getProperty("java.version"));

    }
}

class Ejercicio32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("First number: ");
        int n1 = input.nextInt();

        System.out.println("Second number: ");
        int n2 = input.nextInt();

        if (n1>n2) System.out.println(n1 + " > " + n2);
        if (n1>=n2) System.out.println(n1 + " >= " + n2);
        if (n1<=n2) System.out.println(n1 + " <= " + n2);
        if (n1<n2) System.out.println(n1 + " < " + n2);
        if (n1!=n2) System.out.println(n1 + " != " + n2);
        if (n1==n2) System.out.println(n1 + " == " + n2);

    }
}

class Ejercicio33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Number: ");
        String n = input.next();
        int sum=0;

        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }


        System.out.println("Digit sum is: " + sum);

    }
}

class Ejercicio37 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Text: ");
        String s = input.nextLine();
        String output = "";

        for (int i = s.length()-1; i >= 0; i--) {
            output += s.charAt(i);
        }


        System.out.println("Resultado: " + output);

    }
}

class Ejercicio38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Text: ");
        String s = input.nextLine();
        int letters=0,numbers=0,other=0,spaces=0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (Character.isLetter(c)){
                letters++;
            } else if (Character.isSpaceChar(c)){
                spaces++;
            } else if (Character.isDigit(c)){
                numbers++;
            } else {
                other++;
            }

        }

        System.out.println("letters: " + letters + "\nspaces: " + spaces + "\nnumbers: " + numbers + "\nother: " + other);

    }
}

class Ejercicio48 {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if(i%2==1) System.out.println(i);
        }

    }
}

class Ejercicio49 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Number: ");
        int s = input.nextInt();

        System.out.println(s%2==0);

    }
}

class Ejercicio50 {
    public static void main(String[] args) {

        String three="",five="",both="";
        for (int i = 1; i < 100; i++) {
            if(i%3==0) three+=i+", ";
            if(i%5==0) five+=i+", ";
            if(i%3==0 && i%5==0) both+=i+", ";
        }

        System.out.println("by 3:\n"+three);
        System.out.println("by 5:\n"+five);
        System.out.println("by both:\n"+both);

    }
}