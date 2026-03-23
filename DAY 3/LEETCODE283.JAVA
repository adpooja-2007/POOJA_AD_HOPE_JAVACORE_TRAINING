public class LEETCODE283 {

    public void moveZeroes(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        LEETCODE283 obj = new LEETCODE283();

        int[] arr = {0, 1, 0, 3, 12};

        obj.moveZeroes(arr);

        System.out.print("Array after moving zeroes: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}