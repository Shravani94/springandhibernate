package Sping.spelExpression;

import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
  
public class Test1 {  
public static void main(String[] args) {  
ExpressionParser parser = new SpelExpressionParser();  
  
Expression exp = parser.parseExpression("'Hello SPEL'");  
String message = (String) exp.getValue();  
System.out.println(message);  
ExpressionParser parser1 = new SpelExpressionParser();  
Expression exp1 = parser1.parseExpression("'Welcome SPEL'.concat('!')");  
String message1 = (String) exp1.getValue();  
System.out.println(message1);
Expression exp2 = parser.parseExpression("'Hello World'.bytes");  
byte[] bytes = (byte[]) exp2.getValue();  
for(int i=0;i<bytes.length;i++){  
    System.out.print(bytes[i]+" ");
}
    Expression exp3 = parser.parseExpression("'Hello World'.bytes.length");  
    int length = (Integer) exp3.getValue();  
    System.out.println(length); 
    ExpressionParser parser2 = new SpelExpressionParser();  
    System.out.println("+++++++++++++");
  //arithmetic operator  
  System.out.println(parser2.parseExpression("'Welcome SPEL'+'!'").getValue());  
  System.out.println(parser2.parseExpression("10 * 10/2").getValue());  
  System.out.println(parser2.parseExpression("'Today is: '+ new java.util.Date()").getValue());  
    
  //logical operator  
  System.out.println(parser2.parseExpression("true and true").getValue());  
    
  //Relational operator  
  System.out.println(parser.parseExpression("'sonoo'.length()==5").getValue()); 
}  

//OR  
//System.out.println(parser.parseExpression("'Hello SPEL'").getValue());  
}  

