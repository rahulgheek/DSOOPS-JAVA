import java.util.TreeMap;
class Solution {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<9;j++){
                if(j<=i || i+j>=8) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(i=3;i>=0;i--){
            for (j=8;j>=0;j--){
                if(i+j>=8||j<=i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//    static void findJudge(int n, int[][] trust) {
//        TreeMap<Integer,Integer> map = new TreeMap<>();
//
//        for(int[] arr : trust){
//            map.put(arr[0],arr[1]);
//        }
//        for(int i = 1;i<n;i++) {
//            System.out.println(map.get(i));
//        }
//    }
//
//    public static void main(String[] args) {
//        int[][] trust = {{1,3},{1,2},{2,3}};
//
//        findJudge(3,trust);
//    }
//}