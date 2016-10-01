//split example:
// :	{ "boo", "and", "foo" }
// o	{ "b", "", ":and:f" }
// case: " 1" "    "
public class ReverseWordsInaString {
    public String reverseWords(String s) {
        if(s == "" || s.length() == 0) {
            return "";
        }
        String[] str = s.split(" ");
        String result = "";
        for(int i=str.length-1; i>=0; i--) {
            result += str[i];
            result += " ";
        }
        return result == ""? "" : result.substring(0, result.length()-1);
    }
}