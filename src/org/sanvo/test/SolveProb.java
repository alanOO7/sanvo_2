package org.sanvo.test;
import java.util.Arrays;

/**
 * Created by alan_007@foxmail.com on 2017/4/25.
 */
public class SolveProb {
    // Arrays.sort(arr);
    static int[] flag = new int[100];
    static int index = 0;// 记录当前
    public SolveProb() {
    }
    public static void numGroupAll(int[] arr, int start, int length, int sum) {
        if (sum == 0) {
            for (int j = 0; j < index; j++) {
                System.out.print(flag[j]);
            }
            System.out.println();
        }
        else if(sum>0) {
            for (int i = start; i < length; i++) {
                flag[index++] = arr[i];
                SolveProb.numGroupAll(arr, i + 1, length-1, sum - arr[i]);

            }
        }
        index--;   //若sum<0  则表示该数不满足条件，需要index--, 因为之前假设该数满足条件 index++找该数下一个数
    }

    public static void numGroup(int[] arr, int start, int length, int sum) {
        if (sum == 0) {
            for (int j = 0; j < index; j++) {
                System.out.print(flag[j]);
            }
            System.out.println();
        }
        else if(sum>0) {
            for (int i = start; i < length; i++) {
                int temp_sum=sum - arr[i];

                if(temp_sum>=0)
                {
                    flag[index++] = arr[i];
                    // System.out.println(index);
                    SolveProb.numGroup(arr, i + 1, length-1, sum - arr[i]);
                }
                else    //因为后面的数比这个大，若此时temp_sum小于0，则后面的数更不满足条件，不用再进行循环
                    break;
            }
        }
        index--;
        //  System.out.println(index);
    }


    public static void main(String[] args) {
       int[] arr = { 3171320, 6457700, 5105344, 6853000, 2903506, 42394, 2945900};
        int sum = 9629020;
//        int[] arr = { 1, 3, 2, 4, 5, 6, 7, 8, 9 };
//        int sum =5;

//        SolveProb.numGroupAll(arr, 0, arr.length, sum);//数组未排序

        Arrays.sort(arr);  //对数组进行排序后的话，可以用numGroup方法

        SolveProb.numGroup(arr, 0, arr.length, sum);
        ImportExecl poi=new ImportExecl();
    }

}
