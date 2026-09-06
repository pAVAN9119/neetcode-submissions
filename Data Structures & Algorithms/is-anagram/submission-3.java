class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length())return false;
        // HashMap<Character,Integer> map = new HashMap<>();
        // int i=0;


        // while(i<s.length()){
        //     if(map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i), map.get(s.charAt(i))+1);
        //     }
        //     else{
        //         map.put(s.charAt(i),1);
        //     }
        //     i++;
        // }
        // i=0;
        // while(i<t.length()){
        //     if(map.containsKey(t.charAt(i))){
        //         if(map.get(t.charAt(i)) == 0)return false;
        //         map.put(t.charAt(i), map.get(t.charAt(i))-1);
        //     }
        //     i++;
        // }
        // Set<Character> keys = map.keySet();
        // for(Character key : keys){
        //     if(map.get(key) != 0)return false;
        // }
        // return true;




















        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        for(int i=0; i<t.length(); i++){

            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
            }
            else{
                return false;
            }
        }

        Set<Character> keys = map.keySet();

        for(Character key : keys){
            if(map.get(key) != 0) return false;
        }
        return true;




















    }
}
