class Solution {
    public String clearStars(String s) {
        Queue<Pair<Character, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if(a.getKey()!=b.getKey()) {
                return Character.compare(a.getKey(), b.getKey());
            } else {
                return Integer.compare(b.getValue(), a.getValue());
            }
        });
        Set<Integer> skip = new HashSet<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!='*') {
                pq.offer(new Pair<>(s.charAt(i), i));
            } else {
                skip.add(pq.poll().getValue());
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if(!skip.contains(i) && s.charAt(i)!='*') {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
