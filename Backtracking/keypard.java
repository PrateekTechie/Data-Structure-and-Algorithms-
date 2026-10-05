package Backtracking;
public class keypard {
    final static char[][] l =  {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
{'j','k','l'},{'m','n','o'},{'p','q','r','s'},
{'t','u','v'},{'w','x','y','z'}};
     public static void lettercombination(String D) {
        int n = D.length();
        if(n ==0) {
            System.out.println("");
            return;
        }
           bfs(0,n,new StringBuilder(),D);
        
     }
     public static void bfs(int i,int n,StringBuilder sb,String D) {  // i is the positon and n is the lenght
        //base case
        if( i == n) {
            System.out.println(sb.toString());
            return;
            
        } else {
            char[] letters = l[D.charAt(i) - '0'];
            for(int j =0;j<letters.length;j++) {
                bfs(i+1,n,sb.append(letters[j]),D);
            }
        }
       
        }
         public static void main(String args[]) {
            lettercombination("23");
     }

} 
