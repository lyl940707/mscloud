package structure.sort;


import java.text.SimpleDateFormat;
import java.util.Date;

// 冒泡排序
public class MaopaoClient {
    public static void main(String[] args) {

        int[] sort = new int[]{1,2,3,4,5};
        int[] sort2=new int[80000];
        for(int i=0;i<sort2.length;i++){
            sort2[i]=(int) (Math.random()*800000);
        }
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        System.out.println("开始前"+ sdf.format(date));
        sort(sort2);
        date=new Date();
        System.out.println("结束后"+ sdf.format(date));
    }
    public static void sort(int[] sort){
        int temp = 0;
        boolean flag = false;//标志位，如果中间有一次没有变化，则认为已经排序完成
        int count = 0;//记录跑过几次，优化效果
        for (int i = 0; i < sort.length - 1; i++) {
            count++;
            for (int j = 0; j < sort.length - 1 - i; j++) {
                if (sort[j] <= sort[j + 1]) {
                    flag = true;
                    temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
            if (flag) {
                flag = false;
            } else {
                break;
            }
        }
    }

}
