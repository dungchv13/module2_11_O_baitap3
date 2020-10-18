import static org.junit.jupiter.api.Assertions.*;

class BracketTest {

    @org.junit.jupiter.api.Test
    void checkBracket1() {
        String input = "s * (s – a) * (s – b) * (s – c)";
        boolean expected = true;

        boolean result = Bracket.checkBracket(input);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void checkBracket2() {
        String input = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        boolean expected = true;

        boolean result = Bracket.checkBracket(input);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void checkBracket3() {
        String input = "s * (s – a) * (s – b * (s – c) ";
        boolean expected = false;

        boolean result = Bracket.checkBracket(input);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void checkBracket4() {
        String input = "s * (s – a) * s – b) * (s – c)";
        boolean expected = false;

        boolean result = Bracket.checkBracket(input);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void checkBracket5() {
        String input = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        boolean expected = true;

        boolean result = Bracket.checkBracket(input);
        assertEquals(expected,result);
    }

}