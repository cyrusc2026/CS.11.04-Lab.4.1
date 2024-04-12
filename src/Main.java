public class Main {

    // 1. parenthesesCheck
static boolean parenthesesCheck(String str){
    int len = str.length();
    int count = 0;
    if (len < 2) return false;
    for (int i =0; i < len; i++){
        if (str.charAt(i)==('(')) {
            count++;
        }
        if (str.charAt(i)==(')')&&count>0) count--;
        if (count < 0) return false;
    }
    return true;
}

    // 2. reverseInteger
static int reverseInteger(int num){
    int answer = 0;
    while (num>0){
        answer = answer*10 + num%10;
        num = num/10;
    }
    return answer;
}

    // 3. encryptThis
static String encryptThis(String str){
    String[] words = str.split("");
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < words.length; i++){
        StringBuilder temp = new StringBuilder(words[i]);
        if (temp.length() < 2){
            answer.append(Integer.parseInt(temp.substring(0)));
            if (i != words.length-1) answer.append(" ");
        }
        temp.setCharAt(0,(char) Integer.parseInt(temp.substring(0)));
        char tempchar = temp.charAt(1);
        temp.setCharAt(1,temp.charAt(temp.length()-1));
        temp.setCharAt(temp.length()-1,tempchar);
        answer.append(temp);
        if (i != words.length-1) answer.append(" ");
    }
    return answer.toString();
}

    // 4. decipherThis
    static String decipherThis(String str){
        String[] words = str.split("");
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < words.length; i++){
            StringBuilder temp = new StringBuilder(words[i]);
            if (!Character.isDigit(temp.charAt(3))) {
                int ASCII = Integer.parseInt((temp.substring(0,2)));
                temp.setCharAt(0,(char) (ASCII));
                char tempchar = temp.charAt(temp.length() - 1);
                temp.setCharAt(temp.length() - 1, temp.charAt(2));
                temp.setCharAt(2, tempchar);
                answer.append(temp);
                if (i != words.length - 1) answer.append(" ");
            } else {
                int ASCII = Integer.parseInt((temp.substring(0,3)));
                temp.setCharAt(0,(char) (ASCII));
                char tempchar = temp.charAt(temp.length() - 1);
                temp.setCharAt(temp.length() - 1, temp.charAt(3));
                temp.setCharAt(3, tempchar);
                answer.append(temp);
                if (i != words.length - 1) answer.append(" ");
            }
        }
        return answer.toString();
    }

}