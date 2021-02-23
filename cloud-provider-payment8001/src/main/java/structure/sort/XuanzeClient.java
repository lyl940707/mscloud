package structure.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

// 选择排序
public class XuanzeClient {
    public static void main(String[] args) {
        int[] sort=new int[]{2,1,4,3,9,6,7,5,122,10};
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
        for(int i=0;i<sort.length-1;i++){
            int minIndex=i;
            int min=sort[i];
            for(int j=i+1;j<sort.length;j++){
                if(min>sort[j]){
                    min=sort[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                sort[minIndex]=sort[i];
                sort[i]=min;
            }
//            System.out.println(Arrays.toString(sort));
        }
    }
}
