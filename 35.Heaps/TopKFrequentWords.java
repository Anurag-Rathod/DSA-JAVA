import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
        String word;
        int freq;
        Pair(String word,int freq){
            this.word=word;
            this.freq=freq;
        }

        public int compareTo(Pair p){
            if(this.freq == p.freq){
                return p.word.compareTo(this.word);
            }
            return this.freq - p.freq;
        }
    }
public class TopKFrequentWords {
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(String key:map.keySet()){
            pq.offer(new Pair(key,map.get(key)));
            if(pq.size()>k){
                pq.poll();
            }
        }

        List<String> ans=new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(pq.poll().word);
        }
        Collections.reverse(ans);

        return ans;
    }
    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        List<String> res = topKFrequent(words,k); // ["i","love"]
        for(String s : res){
            System.out.print('"'+s+'"'+" ");
        }
    }
}
