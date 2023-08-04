import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] result = processArray(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] processArray(int[] arr){
        for (int i = 0; i < arr.length; i ++) {
if (arr[i] % 2 != 0){
    arr[i] +=1;

        }
    }
        int[] result = Arrays.copyOfRange(arr,2,7);
        return result;
}
}