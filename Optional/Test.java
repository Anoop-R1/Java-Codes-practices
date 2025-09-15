package Optional;

import java.util.Optional;

public class Test {
public static void main(String[] args) {
	String[] wordsArray=new String[5];
	
Optional<String> checkNull = Optional.ofNullable(wordsArray[2]);
if(checkNull.isPresent()) {
	String word=wordsArray[2].toLowerCase();
	
	System.out.println(word);
}
else {
	System.out.println("word is null");
}
}
}
