import java.util.HashMap;
public class Subset {
    //Tests whether S is a subset of T
    public static String checkSubset(int[] S, int[] T){
        HashMap<Integer,Integer> map = new HashMap<>();

        //Store element of set T in the hash table
        for(int num : T){
            map.put(num, + 1);
        }
        //check if all elements of S are in set T
        for(int num : S){
            if(!map.containsKey(num)|| map.get(num)==0){
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args){
        int[] S = {32,3};
        int[] T = {1,2,3,52,32,54};

        System.out.println(checkSubset(S,T));
    }
}
