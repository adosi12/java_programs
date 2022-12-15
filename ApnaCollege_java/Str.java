class Str{
    public static void main(String[] args){
        String str1="This is the thing";
        String str2="is";
        String str = str1.replaceAll(str2, "");
         
        System.out.print(str);
    }
}