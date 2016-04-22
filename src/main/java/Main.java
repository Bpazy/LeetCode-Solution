import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] old = {1, 2, 1};
        System.out.println(Arrays.toString(old));
        System.out.println(s.containsNearbyDuplicate(old, 1));
    }
}
