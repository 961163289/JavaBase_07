package 断点调试;

import java.util.Arrays;

//演示执行到下一个断点，同时支持动态的下断点.
public class Debug04 {
    public static void main(String[] args) {
        int[] arr = {1,-1,10,-20,100};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("hello 100");
        System.out.println("hello 200");
        System.out.println("hello 300");
        System.out.println("hello 400");
    }
}
