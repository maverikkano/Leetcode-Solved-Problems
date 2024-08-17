class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character,Integer> sMap = getFrequencyMap(s);
        Map<Character,Integer> tMap = getFrequencyMap(t);
        
        boolean bool = sMap.equals(tMap);

        return bool;
    }

    public static Map<Character,Integer> getFrequencyMap(String str) {

        Map<Character,Integer> map = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            } else {
                map.put(str.charAt(i), 0);
            }
        }

        return map;
    }
}