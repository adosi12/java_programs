public class SmallestLargestWord{
    public static void main(String[] args){ 
        String str ="Aditi is an intelligent girl.";
        String word = "", small = "", large="";
        String[] fina = new String[100];
        int len = 0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) != ' '){ 
                word+= str.charAt(i);
            }else{
                fina[len] = word; //add word to array final
                len++; //incr length
                word =""; //make it equal to empty string

            }
        }
        small = large=fina[0];
        for(int k=0; k<len ;k++){
            if(small.length()>fina[k].length()){
                small = fina[k];
            }
            if(large.length()<fina[k].length()){
                large = fina[k];
            }
        } 
        System.out.println("Smallest word: " + small);  
        System.out.println("Largest word: " + large);  
    }
}