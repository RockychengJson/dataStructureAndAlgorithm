package search;

public class BinarySearch {

    /**
     * 递归版简单二分查找
     * 假设数组按照从小到大排序
     *
     * @param array
     * @param target
     * @return
     */
    public int binarySearchRecursion(int[] array, int target) {
        return bSearch(array, target, array.length - 1, 0);
    }

    private int bSearch(int[] array, int target, int high, int low) {
        if (low > high)
            return -1;
        int mid = low + (high - low) >> 1;
        if (array[mid] == target)
            return mid;
        else if (target < array[mid]) {
            return bSearch(array, target, mid - 1, low);
        } else {
            return bSearch(array, target, high, mid + 1);
        }
    }

    /**
     * 非递归版简单二分查找
     *
     * @param array
     * @param target
     * @return
     */
    public int simpleBinarySearch(int[] array, int target) {
        int low = 0, high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) >> 1;
            if (array[mid] == target)
                return mid;
            else if (array[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


}
