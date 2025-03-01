package lt.techin.praktinis;

import java.util.Scanner;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3, 2, 1, 4, 6, 5};


        System.out.println(getFirstElement(arr));
        System.out.println(getLastElement(arr));
        System.out.println(getMin(arr));
        System.out.println(getMax(arr));
        System.out.println(getSum(arr));
        System.out.println(getAverage(arr));
        System.out.println("Please enter number:");
        int enterFirstNumber = scanner.nextInt();
        System.out.println(countElements(arr, enterFirstNumber));
        System.out.println("Please enter number:");
        int enterSecondNumber = scanner.nextInt();
        System.out.println(contains(arr, enterSecondNumber));
        System.out.println("Please enter searching number:");
        int searchNumber = scanner.nextInt();
        System.out.println(searchNumber +" enter number index is " +lastIndexOf(arr, searchNumber));

    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        //TODO
        return arr[0];
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        //TODO
        return arr[arr.length-1];
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        //TODO
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr [i]<min){
                min = arr [i];
            }
        }
        return min;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        //TODO
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr [i]>max){
                max = arr [i];
            }
        }
        return max;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        //TODO
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        //TODO
        double average = (double) getSum(arr)/arr.length;
        return average;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        //TODO
        int counter = 0;
        for (int i = 0; i<arr.length; i++){
            if (n < arr[i]){
                counter++;
            }
        }
        return counter;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        //TODO
        for (int i = 0; i<arr.length; i++){
            if (n == arr[i]) {
                 return true;
            }
        }
        return false;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        //TODO
        for (int i = 0; i<arr.length; i++){
            if (n == arr[i]) {
                return i;
            }
        }
        return 0;
    }






}
