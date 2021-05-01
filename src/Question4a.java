import java.util.Arrays;

public class Question4a {
    static int[][] createArray(int[][] arr, int ld1, int ld2, int cd1, int cd2){
        if (cd2 >= ld2){
            cd1 += 1;
            cd2 = 0;
        }
        if (cd1 >= ld1){
            return arr;
        }
        int number = (int)(Math.floor(Math.random()*41));
        arr[cd1][cd2] = number;
        return createArray(arr, ld1, ld2, cd1, cd2 + 1);
    }

    static int[] makeOneDimensional(int[][] arr, int ld1, int ld2){
        int [] newArray = new int[ld1*ld2];
        int c = 0;
        for (int i=0; i<ld1; i++){
            for (int j=0; j<ld2; j++){
                newArray[c] = arr[i][j];
                c += 1;
            }
        }
        return newArray;
    }

    static int[] insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int ld1 = 10;
        int ld2 = 5;
        int[][] array = new int[ld1][ld2];
        int[][] createdArray = createArray(array, ld1, ld2, 0, 0);
        System.out.println(Arrays.toString(insertionSort
                (makeOneDimensional(createdArray, ld1, ld2))));
    }
}
