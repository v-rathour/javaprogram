import java.util.*;
public class HashMapCode {
    static class HashMap<k,v>{
        private class Node{
            k key;
            v value;
            public Node(k key , v value){
                this.key=key;
                this.value=value;
            }
        }
        private int n; // n- numbre of nodes
        private int N; // N - number of buckets
        private LinkedList<Node> buckets[];
        @SuppressWarnings ("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        public int hashFunction(k key){
            int bi=key.hashCode();
            return Math.abs(bi)%N;


        }
        private int searchInull(k key,int bi){
            LinkedList<Node> list=buckets[bi];
            int di=0;
            for (int i = 0; i <list.size() ; i++) {
                if(list.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBucket[]=buckets;
            buckets=new LinkedList[N+2];
            for (int i = 0; i < N+2; i++) {
                buckets[i]=new LinkedList<>();
            }
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> list=oldBucket[i];
                for (int j = 0; j <list.size() ; j++) {
                    Node node=list.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(k key,v value){
            int bi=hashFunction(key);
            int di=searchInull(key,bi);
            if(di==-1){
                buckets[bi].add(new Node(key,value));
                n++;
            }else{
                Node node=buckets[bi].get(di);
                node.value=value;
            }
            double lambda=(double) n/N;
            if(lambda>2.0){
                // rehashing
               rehash();
            }

        }
        public boolean containskey(k key){
            int bi=hashFunction(key);
            int di=searchInull(key,bi);
            if(di==-1){
                return false;
            }else{
                return true;
            }
        }
        public v remove(k key){
            int bi=hashFunction(key);
            int di=searchInull(key,bi);
            if(di==-1){
                return null;
            }else{
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public ArrayList<k> keySet(){
            ArrayList<k> keys=new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> list=buckets[i];
                for (int j = 0; j < list.size(); j++) {
                    Node node=list.get(j);
                    keys.add(node.key);
                }

            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
        public v get(k key){
            int bi=hashFunction(key);
            int di=searchInull(key,bi);
            if(di==-1){
                return null;
            }else{
                Node node=buckets[bi].get(di);
                return node.value;
            }
        }

    }
    public static void main(String[] args) {
        HashMap<String , Integer> map=new HashMap<>();
        map.put("india",190);
        map.put("America",200);
        map.put("pakistan",50);

        ArrayList<String> list=map.keySet();
        for(String str:list){
            System.out.println(str+"="+map.get(str));
        }

    }

}
