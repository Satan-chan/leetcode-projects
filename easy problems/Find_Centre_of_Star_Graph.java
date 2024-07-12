class Solution {
    public int findCenter(int[][] edges) {
         if (edges == null || edges.length == 0) {
            return -1;
        }
        Set<Integer> commonSet = new HashSet<>();
        for (int num : edges[0]) {
            commonSet.add(num);
        }
        for (int i = 1; i < edges.length; i++) {
            Set<Integer> rowSet = new HashSet<>();
            for (int num : edges[i]) {
                rowSet.add(num);
            }
            commonSet.retainAll(rowSet);
            if (commonSet.isEmpty()) {
                return -1;
            }
        }
        return commonSet.iterator().next();

    }
}
