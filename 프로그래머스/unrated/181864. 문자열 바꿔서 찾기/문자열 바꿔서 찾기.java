class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        String[] arr=myString.split("");
        for(int i=0;i<myString.length();i++){
            if(arr[i].equals("A"))
                arr[i]="B";
            else if(arr[i].equals("B"))
                arr[i]="A";
            answer+=arr[i];
        }
        return (answer.contains(pat))?1:0;
    }
}