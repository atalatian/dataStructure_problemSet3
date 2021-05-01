import java.util.Arrays;

public class Question4bc {
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

    static int[] bubbleSortOneDimensional(int[] arr, int size){
        int i,j,temp;
        for (i=0; i<size-1; i++){
            for (j=0; j<size-i-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
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

    static int binarySearch(int[] arr, int size, int item){
        int first = 0;
        int last = size-1;
        while (first <= last){
            int mid = (first+last)/2;
            if (arr[mid] == item){
                return mid;
            }else if (item < arr[mid]){
                last = mid-1;
            }else {
                first = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int ld1 = 10;
        int ld2 = 5;
        int[][] array = new int[ld1][ld2];
        int[][] createdArray = createArray(array, ld1, ld2, 0, 0);
        int[] newArray = makeOneDimensional(createdArray, ld1, ld2);
        System.out.println(Arrays.toString(bubbleSortOneDimensional(newArray, ld1*ld2)));
        int number = 25;
        System.out.println(binarySearch(newArray, ld1*ld2, number));
    }

}
