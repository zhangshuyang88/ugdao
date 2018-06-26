package com.ugdao.ugdao.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ugdao.ugdao.R;

import java.nio.channels.SelectableChannel;

public class SuanFaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suan_fa);


        paiXu();

        search();

//        StringBuffer 线程安全

//        StringBuilder 线程不安全


    }

    /**
     * 查找
     */
    private void search() {

        int[] arr = {5, 4, 8, 6, 3};
        //二分查找

        int a = bSearch(arr);


    }

    private int bSearch(int[] arr) {

        //必须是有序数组，才能用二分查找法，如果不是有序的用顺序查找法进行查找。

        int key = 6;
        int low = 0;
        int hight = arr.length - 1;

        while (low < hight) {

            int middle = (low + hight) / 2;

            if (arr[middle] == key) {

                return middle;
            } else if (arr[middle] < key) {

                low = middle + 1;

            } else {
                hight = middle - 1;

            }

        }


        return -1;

    }

    private void paiXu() {

        int[] arr = {5, 8, 6, 7, 4};

        //冒泡排序
        bubbing(arr);

        //选择排序
        SelectBubbing(arr);


    }

    private void SelectBubbing(int[] arr) {

        // 第一次选择后最小的数出现在最小的索引处。
        int minIndex = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) { //这里判断大的索引的地方与小索引的比值，如果是小的就互换位置。

                    int temp = arr[minIndex];

                    arr[minIndex] = arr[j]; //让小的索引处赋值小的值

                    arr[j] = temp;  //因为j是大的索引处，所以复制一个大数

                }


            }


        }


    }

    private void bubbing(int[] arr) {

        //第一排序后就会出现最大的数据
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;

                }

            }
        }

        for (int i = 0; i < arr.length; i++) {

            Log.e("AAA", "bubbing: " + arr[i]);
        }


    }


}
