class Solution {

    public String getSortedString(String s){
        int[] characters = new int[26];
        int j=0;
        while(j < s.length()){
            char ch = s.charAt(j);
            characters[ch - 'a']++;
            j++;
        }
        StringBuilder st = new StringBuilder();

        for(int i=0; i<characters.length; i++){
            if(characters[i] != 0){
                st.append((char)('a' + i));
                st.append(characters[i]);
            }
        }
        return st.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String key = getSortedString(strs[i]);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        
        List<List<String>> list = new ArrayList<>();
        Set<String> keys = map.keySet();

        for(String key : keys){
            list.add(map.get(key));
        }

        return list;
    }
}



// HashMap<Character, Integer>[] maps = new HashMap<>[strs.length];
        // for(int i=0; i<strs.length; i++){
        //     maps[i] = new HashMap<Character, Integer>();
        //     int j=0;
        //     while(j < strs[i].length()){
        //         char ch = strs[i].charAt(j);
        //         int val = maps[i].getOrDefault(ch, 0);
        //         //maps[i].put(strs[i].charAt(j), maps[i].getOrDefault(maps[i].get(strs[i].charAt(j)), 0 ) + 1 );
        //         maps[i].put(ch, val+1);
        //         j++;
        //     }
        // }


















