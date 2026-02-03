class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        int len = values.size();
        int[] result = new int[len];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < len; i++) {
            int currVal = values.get(i);
            while (!st.isEmpty() && values.get(st.peek()) < currVal)
                result[st.pop()] = currVal;
            st.push(i);
        }
        return result;
    }
}
