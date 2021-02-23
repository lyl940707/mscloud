package structure.array;

import java.io.Serializable;

// 数组 <======>稀疏数组
public class SparseArray implements Serializable {

    public static int[][] normalArray = new int[10][10];

    public static void main(String[] args) throws Exception {
        normalArray[1][1] = 1;
        normalArray[2][2] = 2;
        normalArray[3][3] = 3;

        System.out.println("原始数组");
        for (int[] normal : normalArray) {
            for (int t : normal) {
                System.out.printf("%d\t", t);
            }
            System.out.println();
        }
        int[][] sparseArray = toSparseArray(normalArray);
        System.out.println("稀疏数组");
        for (int[] sparse : sparseArray) {
            for (int t : sparse) {
                System.out.printf("%d\t", t);
            }
            System.out.println();
        }
        System.out.println("还原数组");
        int[][] reverseArray = toArray(sparseArray);
        for (int[] reverse : reverseArray) {
            for (int t : reverse) {
                System.out.printf("%d\t", t);
            }
            System.out.println();
        }
    }

    public static int[][] toSparseArray(int[][] n) throws Exception {
        int count = 1;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (n[i][j] != 0) {
                    count++;
                }
            }
        }
        int[][] sparseArray = new int[count][3];
        sparseArray[0][0] = normalArray.length;
        sparseArray[0][1] = normalArray[0].length;
        sparseArray[0][2] = count - 1;
        int count2 = 1;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (n[i][j] != 0) {
                    sparseArray[count2][0] = i;
                    sparseArray[count2][1] = j;
                    sparseArray[count2][2] = n[i][j];
                    count2++;
                }
            }
        }
        return sparseArray;
    }

    public static int[][] toArray(int[][] sparseArray) {
        int[][] reverseArray = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            reverseArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        return reverseArray;
    }
}
