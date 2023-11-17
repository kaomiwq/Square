import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideOfTheSquare;
        int perimeter;

        System.out.println("Наша программа вычисляет периметр квадрата");
        System.out.println("Введите значение стороны квадрата: ");

        sideOfTheSquare = scanner.nextInt();

        perimeter = sideOfTheSquare * sideOfTheSquare;
        System.out.print("Периметр квадрата = "+perimeter+" единиц измерения");

    }
}