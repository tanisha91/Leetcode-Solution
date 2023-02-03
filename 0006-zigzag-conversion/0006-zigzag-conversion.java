class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || s.length() <= numRows) {
            return s;
        }

        final StringBuilder[] sb = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        int idx = 0; 
        int increment = 1;

        for (int i = 0; i < s.length(); i++) {
            sb[idx].append(s.charAt(i));
            if (idx == 0) {
                increment = 1;
            } else if (idx == numRows - 1) {
                increment = -1;
            }
            idx += increment;
        }

        StringBuilder ret = new StringBuilder();

        for (StringBuilder row: sb) {
            ret.append(row);
        }

        return ret.toString();
    }
}