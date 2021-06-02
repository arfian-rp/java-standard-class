import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] number = {
                1,2,3,5,71,4,63,768,2,56,99
        };
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.binarySearch(number,67));
        int[] result = Arrays.copyOf(number, 5);
        System.out.println(Arrays.toString(result));
        int[] result2 = Arrays.copyOfRange(number, 3, 5);
        System.out.println(Arrays.toString(result2));
    }
}
