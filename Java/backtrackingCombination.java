import java.util.ArrayList;
import java.util.List;

public class backtrackingCombination {

    public static List<String> letterCombinations(String input) {
        List<String> result = new ArrayList<>();
        if (input == null || input.length() == 0) {
            return result;
        }

        String[] mapping = {
            "",     
            "",     
            "abc",  
            "def", 
            "ghi",  
            "jkl",  
            "mno",  
            "pqrs", 
            "tuv",  
            "wxyz"  
        };

        backtrack(result, input, mapping, 0, new StringBuilder());
        return result;
    }

    private static void backtrack(List<String> result, String input, String[] mapping, int i, StringBuilder temp) {
        
        if (i == input.length()) {
            result.add(temp.toString());
            return;
        }

        
        for (char letter : mapping[input.charAt(i) - '0'].toCharArray()) {
            temp.append(letter); 
            backtrack(result, input, mapping, i + 1, temp); 
            temp.deleteCharAt(temp.length() - 1); 
        }
    }

    public static void main(String[] args) {
        String input = "23";
        List<String> combinations = letterCombinations(input);
        System.out.println("Letter combinations: " + combinations);
    }
}