import java.io.BufferedReader;

public class Seperating {
public static void main(String args[]){
	String sr="kalyan9205251Varma";
	StringBuffer s1=new StringBuffer();
	StringBuffer s2=new StringBuffer();
	for(int i=0;i<sr.length();i++){
		char ch=sr.charAt(i);
		if(ch>=48&&ch<=57){
			s1.append(ch);
		}
		else
			s2.append(ch);
	}
	System.out.println("numbers in string:"+s1);
	System.out.println("characters in string:"+s2);
}
}
