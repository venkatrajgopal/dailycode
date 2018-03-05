import java.util.*;
public class Answer implements QuestionInterface {
@Override
public char  func (String s){
// write your code here
char ch='\0';
for(int i=0;i<s.length()-1;i++){
    int count=0;
   
    for(int j=i+1;j<s.length();j++){
        char c=s.charAt(i);
        char d=s.charAt(j);
        if(c==d){
            count++;
        }
        
    }
    if(count==1){
        ch=s.charAt(i);
    }
}return ch;
	}
}
