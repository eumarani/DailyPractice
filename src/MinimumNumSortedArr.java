public class MinimumNumSortedArr {

    public static int minimum(int[] arr) {
        int left = 0, right = arr.length - 1;
        if (arr[left] < arr[right]) {
            return arr[left];
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid > 0 && arr[mid] < arr[mid + 1]) {
                return arr[mid];
            }

            if (mid < right && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            if (arr[mid] <= arr[left]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        throw new IllegalArgumentException("minimum is not found");
    }

    public static void main(String[] args){
        int[] arr1={5,6,1,2,3,4};
        int[] arr2={1,2,3,4};
        int[] arr3={4,5,2,3};
        System.out.println(minimum(arr1));
        System.out.println(minimum(arr2));
        System.out.println(minimum(arr3));

    }
}


