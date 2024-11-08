import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] n1) {
        List<String> ans = new ArrayList<>();
        int n = n1.length;
        int i = 0;

        while (i < n) {
            int start = n1[i];
            while (i < n - 1 && n1[i] + 1 == n1[i + 1]) {
                i++;
            }
            if (start != n1[i]) {
                ans.add(start + "->" + n1[i]);
            } else {
                ans.add(String.valueOf(start));
            }
            i++;
        }

        return ans;
    }
}