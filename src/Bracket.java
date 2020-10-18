import java.util.Stack;

public class Bracket {
    public static boolean checkBracket(String str){
        String[] arr = str.split("");

        Stack<String> myS = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("(")){
                myS.push(arr[i]);
            }
            if(arr[i].equals(")")){
                if(myS.size() == 0){
                    return false;
                }
                myS.pop();
            }
        }
        if(myS.isEmpty()){
            return true;
        }
        return false;
    }
}
