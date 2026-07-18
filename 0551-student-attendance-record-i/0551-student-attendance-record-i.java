class Solution {
    public boolean checkRecord(String s) {
        int cnt1 = 0;
        int cnt2 = 0;

        for(char ch : s.toCharArray()) {
            if (ch == 'A') {
                cnt1++;
            }

            if (ch != 'L') {
                cnt2 = 0;
            }

            if (ch == 'L') {
                cnt2++;
            }

            if (cnt1 == 2 || cnt2 == 3) {
                return false;
            }
        }

        return true;
    }
}