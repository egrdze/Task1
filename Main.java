package cs.vsu.ru.lyashenko_e_v;

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        printText("Введите сторону квадрата: ");
        double side = getSide();
        double squareArea = getSquareArea(side); // площадь квадрата
        double circleArea = getCircleArea(side / 2); // площадь круга
        double fragmentArea = getFragmentArea(squareArea, circleArea); // площадь фрагмента
        double smallSquareArea = getSmallSquareArea(side / 2); // площадь маленького квадратаё
        double area = getArea(fragmentArea, smallSquareArea);
        printText("Ответ: ");
        printText(Double.toString(area));
    }

    static void printText(String text) {
        System.out.println(text);
    }
    static double getSide() {
        Scanner scanner= new Scanner(System.in);
        return scanner.nextDouble();
    }
    static double getSquareArea(double side) {
        return Math.pow(side, 2);
    }
    static double getCircleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }
    static double getFragmentArea(double squareArea, double circleArea) {
        return (squareArea - circleArea) / 4;
    }
    static double getSmallSquareArea(double sideSmall) {
        return Math.pow(sideSmall, 2);
    }
    static double getArea(double fragmentArea, double smallSquareArea) {
        return fragmentArea + smallSquareArea;
    }
}