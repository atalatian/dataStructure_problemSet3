import java.util.Arrays;

public class Question1 {
    static int[] bubbleSort(int[] arr, int size){
        int i,j,temp,count;
        for (i=0; i<size-1; i++){
            count = 0;
            for (j=0; j<size-i-1; j++){
                if (arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }else {
                    count += 1;
                    if (count == size-i-1){
                        return arr;
                    }
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {8,6,5};
        System.out.println(Arrays.toString(bubbleSort(arr, arr.length)));
    }
}
