import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * @author mahl
 * @date 2019-05-13
 */
public class BackTracingTest {

    static int[] array = {2, 4, 6, 8, 1, 3, 5, 7};

    public static void main(String[] args) {
        Arrays.sort(array);
        int target = 15;
        find(target, 0, Lists.newArrayList());
    }

    private static void find(int target, int start, List<Integer> temp) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            System.out.println(temp);
            return;
        }
        for (int j = start; j < array.length; j++) {
            if (array[j] > target) {
                break;
            }
            List<Integer> innerList = Lists.newArrayList(temp);
            innerList.add(array[j]);
            find(target - array[j], j + 1, innerList);
        }
    }
}
