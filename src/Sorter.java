import java.util.Arrays;

public class Sorter {

    public int[] sort(int[] arr){
        if (arr.length > 1) {
            int length = arr.length;
            int middle = length / 2;
            int[] firstPart = Arrays.copyOf(arr, middle);
            int[] secondPart = Arrays.copyOfRange(arr, middle, arr.length);

            firstPart = sort(firstPart);
            secondPart = sort(secondPart);
            return merge(firstPart, secondPart);
        }
        return arr;
    }

    private int[] merge(int[] first, int[] second){
        int firstIndex = 0;
        int secondIndex = 0;
        int[] result = new int[first.length + second.length];
        for (int i = 0; i < result.length; i++) {
            if (secondIndex == second.length){
                result[i] = first[firstIndex];
                firstIndex++;
                continue;
            }
            if (firstIndex == first.length){
                result[i] = second[secondIndex];
                secondIndex++;
                continue;
            }
            if (first[firstIndex] > second[secondIndex]){
                result[i] = second[secondIndex];
                secondIndex++;
            } else {
                result[i] = first[firstIndex];
                firstIndex++;
            }
        }
        return result;
    }
}
