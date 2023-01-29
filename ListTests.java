import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests{
    
    @Test
    public void testFilter(){
        List<String> input = new ArrayList<>();
        input.add("int");
        input.add("double");
        StringChecker result = new Checker("no");
        List<String> expect = new ArrayList<>();
        expect.add("int");
        assertEquals(expect, ListExamples.filter(input, result));
    }

    @Test
    public void testFilter2(){
        List<String> input = new ArrayList<>();
        input.add("int");
        input.add("double");
        StringChecker result = new Checker("do");
        List<String> expect = new ArrayList<>();
        expect.add("double");
        assertEquals(expect, ListExamples.filter(input, result));
    }
}    

class Checker implements StringChecker{

    String check;
    Checker(String input){
        check = input;
    }

    public boolean checkString(String s)
    {
        if (s.contains(check)){
            return true;
        }
        return false;
    }
}