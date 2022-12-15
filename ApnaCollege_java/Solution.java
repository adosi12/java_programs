class Solution {
    void solve(String digits,String output,int ind,List<String> req,String[] num){
        if(ind>=digits.length()){
            req.add(output);
            return;
        }
        String st=num[digits.charAt(ind)-'0'];
        for(int i=0;i<st.length();i++){
            output=output+st.charAt(i);
            solve(digits,output,ind+1,req,num);
            output=output.substring(0, output.length() - 1);
            
        }
    }
    
    public List<String> letterCombinations(String digits) {
        String num[]={"#","#","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> req=new ArrayList<>();
        String output="";
        if(digits.length()==0)
            return req;
        int ind=0;
        solve(digits,output,ind,req,num);
        return req;
    }
}