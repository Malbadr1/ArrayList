import java.util.Arrays;
import java.util.Collections;

public class multi_array {
    public static void main(String[] args) {
       /* int array[][]={{1,2,3},{4,5,6},{7,8,9}};

        for (int col = 0; col < array[0].length; col++) {
            array[2][col]=0;

        }

        for (int[] i:array) {
            System.out.println(Arrays.toString(i));
        }*/

        int arr[]={1,5,2,4,3};


        for (int i:arr
             ) {arr[0]=0;

        }
        System.out.println(Arrays.toString(arr));

      Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr,3,4,9);
        System.out.println(Arrays.toString(arr));


        Collections.reverse(Collections.singletonList(arr));
        System.out.println(Arrays.toString(arr));
        int total=0;
        for (int i = 0; i < arr.length; i++) {

        }
        }


    }

