class Solution {

    public String encode(List<String> strs) { //machine 1

        StringBuilder encoded = new StringBuilder();
        for(int i=0; i<strs.size(); i++){

            int j=0;
            String s = strs.get(i);
            encoded.append(s.length());
            encoded.append('#');

            while(j < s.length()){
                encoded.append(s.charAt(j));
                j++;
            }
        }
        return encoded.toString();
    }

    public List<String> decode(String str) { //machine 2
        
        List<String> list = new ArrayList<>();

        int i=0;
        while(i < str.length()){

            StringBuilder num = new StringBuilder();
            while(str.charAt(i) != '#'){
                num.append(str.charAt(i++));
            }

            int length = Integer.parseInt(num.toString());
            i++; //skipping '#'
            StringBuilder s = new StringBuilder();

            int j=0;
            while(j < length){
                s.append(str.charAt(i++));
                j++;
            }
            list.add(s.toString());
        }
        return list;
    }
}
