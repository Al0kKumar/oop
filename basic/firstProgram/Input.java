package basic.firstProgram;

import java.util.Scanner;

public class Input {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the val of first num ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the val of second num ");
        int secNum = sc.nextInt();

        System.out.println(firstNum + secNum);

        boolean flag = sc.nextBoolean();
        float val = sc.nextFloat();

        sc.close();
    }
}
