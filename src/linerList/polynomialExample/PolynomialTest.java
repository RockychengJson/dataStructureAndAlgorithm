package linerList.polynomialExample;

import java.util.Scanner;

public class PolynomialTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String polynomialStr = scanner.nextLine();
        Polynomial polynomial = new Polynomial(polynomialStr);
        int sum = polynomial.calculate(1);
        System.out.println(sum);
    }
}
