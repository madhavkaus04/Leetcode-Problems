class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
    void solve(int[] a, int target, int start,
               List<Integer> list, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < a.length; i++) {
            if (a[i] > target)
                break;
            if (i > start && a[i] == a[i - 1])
                continue;
            list.add(a[i]);
            solve(a, target - a[i], i + 1, list, ans);
            list.remove(list.size() - 1);
        }
    }
} 
    
