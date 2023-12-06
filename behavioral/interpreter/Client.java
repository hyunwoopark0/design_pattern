package pattern.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        PostfixExpression expression = PostfixParser.parse("xyz-+");
        Map map = new HashMap<Character, Integer>();
        map.put('x', 1);
        map.put('y', 2);
        map.put('z', 3);

        int result = expression.interpret(map);
        System.out.println(result);
    }
}
