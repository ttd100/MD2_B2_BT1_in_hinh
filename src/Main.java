import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle(The corner is square at 4 different angles: top-left, top-right, botton-left,botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("* * * * * * *");
                    }
                case 2:
                    System.out.println("Print the square triangle(The corner is square at 4 different angles: top-left, top-right, botton-left,botton-right)");
                    String type = input.next();
                    if (type.equals("top-left")) {
                        for (int i = 0; i <= 5; i++) {
                            for (int j = 5; j > i; j--) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                    }
                    if (type.equals("top-right")) {
                        for (int i = 1; i <= 8; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 8; k > i; k--) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                    }
                    if (type.equals("bottom-left")) {
                        for (int i = 1; i <= 8; i++) {
                            for (int j = 1; j < i; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println("");
                        }
                    }
                    if (type.equals("bottom-right")) {
                        for (int i = 8; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 8; k > i; k--) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    }
                case 3:
                    int star = 1;
                    for (int i = 1; i < 4; i++) {
                        for (int k = 4 - i; k > 0; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < star; j++) {
                            System.out.print("*");
                        }
                        star += 2;
                        System.out.println("");
                    }
                    break;
//                        for (int i = 1; i <=3 ; i++) {
//                            for (int j = 3; j >i ; j--) {
//                                System.out.print(" ");
//                            }
//                            for (int k = 1; k <=(i*2-1); k++) {
//                                System.out.print("*");
//                            }System.out.println("");
//                        }
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}