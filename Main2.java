package com.company;
import java.util.Scanner ;
public class Main {

    public static void main(String[] args) {
        //num28() ;
        //num53() ;
        //num78() ;
        //num103() ;
        num128() ;
    }

    public static void num28() {
       //Дана последовательность целых чисел а1, а2, ..., an. Выяснить, какое число встречается раньше — положительное или отрицательное.
       Scanner sc = new Scanner(System.in) ;
      System.out.println("Enter the length of the sequence");
       int n = sc.nextInt();
       int[] a = new int[n];
       for(int i = 0 ; i < n ; i++) {
           System.out.println("Enter the " +(i+1)+ "th member of the sequence") ;
           a[i] = sc.nextInt();
           if (a[i]> 0) {
            System.out.println("A positive number is there before");
               break ;
           } else if(a[i]< 0) {
               System.out.println("A negative number is there before");
               break ;
           } else if(a[n-1] == 0){
               System.out.println("All numbers in the sequence are zero ");
           }
       }
   }

    public static void num53() {
       // Определить, сколько процентов от всего количества элементов последовательности целых чисел составляют нечетные элементы.

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the length of the sequence");
        int n = sc.nextInt();
        int nechet = 0 ;
        int[] ar = new int[n];
        for(int i = 0; i < n ; i++) {
            ar[i] = (int) (Math.random() * 29 +1);
            System.out.print(" "+ ar[i]+ " \t");
            if(ar[i]%2 == 1){
                nechet++;

            }
            }
        double N = (double) n ;
        double procent = (nechet / N) * 100;
        System.out.println("\n In a sequence of "+procent+"% odd numbers") ;
    }

    public static void num78() {
/*Дана непустая и упорядоченная по возрастанию последовательность целых чисел,
оканчивающаяся числом 10 000. Определить порядковый номер первого числа, большего
заданного n. Если таких чисел в последовательности нет, то на экран должно быть выведено соответствующее сообщение.
 */

        Scanner sc = new Scanner(System.in) ;
        int N = 10000 ;
        System.out.println("Enter the number n");
        int n = sc.nextInt();
        int[] ar = new int[N];
        for(int i = 0 ; i < N ; i++) {
            ar[i] = i+1 ;
        }
        for(int i = 0 ; i < N ; i++){
            if(n > ar[9999]){
                System.out.println("There is no number greater than n in the array");
                break;
            } else if (i > n) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void num103() {
/* Удалить элемент массива целых чисел, который делится на 5 и 8. Если таких элементов
нет, выдать сообщение «элементы для удаления не найдены», иначе удалить последний из найденных.
*/

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the length of the sequence");
        int n = sc.nextInt();
        int[] ar = new int[n];
        int Delete = -1 ;
        for(int i = 0; i < n ; i++) {
            ar[i] = (int) (Math.random() * 999 + 1);
           // System.out.print(" " + ar[i] + " \t");
            if(ar[i]%5 == 0 || ar[i]%8 == 0 ) {
                Delete = i  ;
            }
            if(i == n-1 && Delete != -1){

                for (int j = Delete ; j < ar.length ; j++){
                    ar[j-1] = ar[j] ;
                    ar[j] = 0;
                }
            }else if(i == n-1 && Delete == -1){
                System.out.println("items to delete not found");
            }
        }
        for(int i = 0; i < n ; i++) {
            System.out.print(" " + ar[i] + " \t");
        }
    }

    public static void num128() {
        //Дан массив вещественных чисел. Среди них есть равные. Найти его первый максимальный элемент и заменить его нулем.
        Scanner sc = new Scanner(System.in) ;
        double[] ar = new double[5];
        int Delete = 0 ;
        for(int i = 0; i < ar.length ; i++) {
            ar[i] = sc.nextDouble();
            System.out.print(" "+ ar[i]+ " \n");
        }
        for(int i = 0; i < ar.length ; i++) {
            if(ar[i]>ar[Delete]) {
                Delete = i ;
            }
            if(i == ar.length - 1) {
                ar[Delete] = 0 ;
            }
        }
        for(int i = 0; i < ar.length ; i++) {
            System.out.print(" " + ar[i] + " \t");
        }
    }
}