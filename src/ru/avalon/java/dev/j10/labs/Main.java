package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.stream.IntStream;
import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Main {
    
        public static void randomizer(int[] array){    
        RandomInitializer random = new RandomInitializer(-50, +50);
        random.initialize(array);
        System.out.println("Массив случайных чисел от -50 до +50: " + Arrays.toString(array));
        } 

    public static void main(String[] args) {
        int[] array = new int[20];
        
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     */
            
        FibonacciInitializer fibonacci = new FibonacciInitializer();
        fibonacci.initialize(array);
        System.out.println("Числа Фибоначчи: " + "\n" + Arrays.toString(array));
            
            /*
	     * 2. Найти сумму элементов массива.
	     */
        
        int sum = IntStream.of(array).sum();
        System.out.println("Сумма элементов массива чисел Фибоначчи: " + sum + "\n");
            
	    /* 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     */
        
        randomizer(array);    
   
	    /* 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     */
        
        BubbleSort bubble = new BubbleSort();
        bubble.sort(array);
        System.out.println("Сортировка массива пузырьковой сортировкой: " + Arrays.toString(array) + "\n");    
        
        /* 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */
        
        randomizer(array);
        
        /* 6. Отсортировать массив с использованием
         *    сортировки выбором.
         */
        
        SelectionSort selection = new SelectionSort();
        selection.sort(array);
        System.out.println("Сортировка выбором: " + Arrays.toString(array) + "\n");     
        
        /* 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */
        
        randomizer(array);
        
        /* 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
        
        ShellSort shell = new ShellSort();
        shell.sort(array);
        System.out.println("Сортировка массива методом Шелла: " + Arrays.toString(array) + "\n");
        
    }
}
