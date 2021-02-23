package structure.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

//插入排序
public class CharuClient {
    public static void main(String[] args) {
        //int[] sort = new int[]{2, 1, 4, 3, 9, 6, 7, 5, 122, 10};
        int[] sort2 = new int[80000];
        for (int i = 0; i < sort2.length; i++) {
            sort2[i] = (int) (Math.random() * 800000);
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println("开始前" + sdf.format(date));
        sort(sort2);
        date = new Date();
        System.out.println("结束后" + sdf.format(date));

    }

    public static void sort(int[] sort) {
        for (int i = 1; i < sort.length; i++) {
            // 要插入的数，从第二个数开始插入
            int insertVal = sort[i];
            // 与前一个数开始比较
            int insertIndex = i - 1;
            // 如果要插入的数比前一个数小，就继续往前比，知道
            while (insertIndex >= 0 && insertVal < sort[insertIndex]) {
                sort[insertIndex + 1] = sort[insertIndex];
                insertIndex--;
            }
//            if(insertIndex + 1!=i){
                sort[insertIndex + 1] = insertVal;
//            }

        }


    }
}
