1. Print Hello World! 

class Main {
    public static void main(String[] args) {
      System.out.println("Hello World!");
    }
  }


2. Take a number from the user and display the number 

  import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("Enter the number- ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    System.out.println("the number is " + number);
  }
}


3. Take two numbers from user and print the sum of two numbers 

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("Enter first number- ");
    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    System.out.print("Enter second number- ");
    int num2 = input.nextInt();

    int sum = num1 + num2;

    System.out.println("The sum of number is - " + sum);
  }
}

4. Take input in c and display in f 

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("Enter the temperature in C- ");
    Scanner input = new Scanner(System.in);
    int c = input.nextInt();
    int f = 0;

    f = c * 9 / 5 + 32;

    System.out.println("the temperature in F is- " + f);
  }
}