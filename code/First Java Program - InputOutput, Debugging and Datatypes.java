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


## Write Java programs for the following:

1. Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();

    if (number % 2 == 0) {
      System.out.println("The number is even");
    } else {
      System.out.println("The number is odd");
    }
  }
}


2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = in.nextLine();
    System.out.println("Hello " + name + "!");
  }
}

3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Priciple: ");
    double p = in.nextDouble();
    System.out.print("Enter Interest Rate: ");
    double r = in.nextDouble();
    System.out.print("Enter Number of Months: ");
    int n = in.nextInt();

    double SI = p * r * n / 100;
    System.out.println("The SI is: " + SI);
  }
}

4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter second number: ");
    int num2 = input.nextInt();
    System.out.print("Enter operator: ");
    char op = input.next().charAt(0);
    int result = 0;

    if (op == '+') {
      result = num1 + num2;
    } else if (op == '-') {
      result = num1 - num2;
    } else if (op == '*') {
      result = num1 * num2;
    } else if (op == '/') {
      result = num1 / num2;
    }
    System.out.println("the result is: " + result);
  }
}


5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int n = in.nextInt();
    System.out.print("Enter second number: ");
    int m = in.nextInt();

    if (n > m) {
      System.out.print("the bigger number is :" + n);
    } else
      System.out.print("the bigger number is : " + m);
  }
}

6. Input currency in rupees and output in USD.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the amount: ");
    double inr = in.nextDouble();

    double usd = inr / 74.45;

    System.out.println("The amount in USD is: " + usd);

  }
}


7. To calculate Fibonacci Series up to n numbers.




8. To find out whether the given String is Palindrome or not.


9. To find Armstrong Number between two given number.