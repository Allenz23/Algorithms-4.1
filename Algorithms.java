import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        /*int odds = odds();
        int evens = evens();
        int dubs = dubs();
        int m500 = m500();
        int greatest = greatest();
        int smallest = smallest();
        int sum = sum();
        double avg = avg();
        int times = times(2);
        //int mode = mode();
        System.out.println("odds: " + odds);
        System.out.println("evens: " + evens);
        System.out.println("dubs: " + dubs);
        System.out.println("m500: " + m500);
        System.out.println("greatest: " + greatest);
        System.out.println("smallest: " + smallest);
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
        System.out.println("times: " + times);
        //System.out.println("mode: " + mode); */
        int mode = 0;
        int mostNum = 0;
        for (int i = 150; i<=150 ; i++){
            int temp = times(i);
            if (temp>mode){
                mode = temp;
                mostNum = i;
            }
        }
        System.out.println(mode);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }
    public static int evens() throws FileNotFoundException {
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }
    public static int dubs() throws FileNotFoundException {
        s = new Scanner (f);
        int dubs = 0;
        int temp = 0;
        while (s.hasNext()) {
            temp = s.nextInt();
            if (temp<=99 && temp>=10){
                dubs++;
            }
        }
        return dubs;
    }
    public static int m500() throws FileNotFoundException {
        s = new Scanner (f);
        int m500 = 0;
        while (s.hasNext()) {
            if (s.nextInt()>500){
                m500++;
            }
        }
        return m500;
    }
    public static int greatest() throws FileNotFoundException {
        s = new Scanner (f);
        int greatest = 0;
        int temp = 0;
        while (s.hasNext()) {
            temp = s.nextInt();
            if (temp > greatest){
                greatest = temp;
            }
        }
        return greatest;
    }
    public static int smallest() throws FileNotFoundException {
        s = new Scanner (f);
        int smallest = 0;
        int temp = 0;
        while (s.hasNext()) {
            temp = s.nextInt();
            if (temp < smallest){
                smallest = temp;
            }
        }
        return smallest;
    }
    public static int sum() throws FileNotFoundException {
        s = new Scanner (f);
        int sum = 0;
        int temp = 0;
        while (s.hasNext()) {
            temp = s.nextInt();
            sum += temp;
        }
        return sum;
    }
    public static int length() throws FileNotFoundException {
        s = new Scanner (f);
        int length = 0;
        while (s.hasNext()) {
            s.nextInt();
            length++;
        }
        return length;
    }
    public static double avg() throws FileNotFoundException {
        double sum = sum();
        int length = length();
        return sum/length;
    }
    public static int times(int n) throws FileNotFoundException {
        s = new Scanner (f);
        int count = 0;
        while (s.hasNext()){
            if (n==s.nextInt()){
                count++;
            }
        }
        return count;
    }

    }
