import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 0, 1, 3, 2, 6};
        System.out.println(Arrays.toString(new Sorter().sort(array)));
    }
}
