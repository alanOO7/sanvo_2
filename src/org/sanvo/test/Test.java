package org.sanvo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by alan_007@foxmail.com on 2017/4/26.
 */
public class Test {
    public ArrayList<Integer> list = new ArrayList<Integer>();   //用于存放求取子集中的元素
    //求取数组链表中元素和
    public int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for(int i = 0;i < list.size();i++)
            sum += list.get(i);
        return sum;
    }
    /*
      * 参数step：选中数组A中第step个元素为子集元素
      * 函数功能：求取数组A中一个子集元素，其相加之和等于m
      */
    public void getSubSet(int[] A, int m, int step) {
        while(step < A.length) {
            list.add(A[step]);   //递归执行语句，向数组链表中添加一个元素
            if(getSum(list) == m)   //链表中元素和等于m
                System.out.println(list);
            step++;
            getSubSet(A, m, step);
            list.remove(list.size() - 1);   //回溯执行语句，删除数组链表最后一个元素
        }
    }


    public static void main(String[] args) {
        Test test = new Test();
//        int[] A = new int[6];
//        for(int i = 0;i < 6;i++) {
//            A[i] = i + 1;
        int[] A={ 1, -3, -2, 4, 5, 6, -7, 8, 9 };
//        int[] arr = { 3171320,-6457700,5105144,-6853000,290356,-2945900 };
        test.getSubSet(A, 8 ,0);
    }



}
