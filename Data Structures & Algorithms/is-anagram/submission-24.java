class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars2);
        String stored1 = new String(chars);
        String stored2 = new String(chars2);
        if(stored1.equals(stored2))
            return true;
        else 
            return false;

    }

}
