package problem17;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinationsofaPhoneNumberTest {

    @Test
    public void letterCombinations() {
        LetterCombinationsofaPhoneNumber letterCombinationsofaPhoneNumber = new LetterCombinationsofaPhoneNumber();
        String s = "23";
        List<String> strings = letterCombinationsofaPhoneNumber.letterCombinations(s);

        for(String str : strings){
            System.out.println(str);
        }
    }
}