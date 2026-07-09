package Recursion_Part2;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(solve("vviijjaayy",new StringBuilder(""),0,new boolean[26]));

    }



    public static String solve(String s,StringBuilder sb,int idx,boolean map[]){
        if(idx==s.length()){
            return sb.toString();
        }
        if(map[s.charAt(idx)-'a']==true){
            solve(s,sb,idx+1,map);
        }
        else{
            map[s.charAt(idx)-'a']=true;
            solve(s,sb.append(s.charAt(idx)),idx+1,map);
        }
        return sb.toString();
    }
}






