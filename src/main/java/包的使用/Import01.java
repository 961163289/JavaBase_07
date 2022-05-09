package 包的使用;

import java.util.Arrays;

//注意:
//老韩建议：我们需要使用到哪个类,就导入哪个类即可,不建议使用 * 导入
//import java.util.Scanner; //表示只会引入 java.util  包下的 Scanner
//import java.util.*;       //表示将 java.util 包下的所有类都引入(导入)
public class Import01 {
    public static void main(String[] args) {
        //使用系统提供的 Arrays 完成 数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        //比如对其进行排序
        //传统方法是: 编写排序(冒泡)
        //系统提供了相关的类,可以方便完成排序
        Arrays.sort(arr);
        //输出排序结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
