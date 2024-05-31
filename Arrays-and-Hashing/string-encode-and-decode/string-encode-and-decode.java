class Solution {

   public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            // Find the separator '#'
            while (str.charAt(j) != '#') {
                j++;
            }
            // Length of the next string
            int length = Integer.parseInt(str.substring(i, j));
            // Move i to the start of the string
            i = j + 1 + length;
            // Extract the string
            strs.add(str.substring(j + 1, i));
        }
        return strs;
    }
}
