/*How to reverse String without recursion?
Same as the previous program, but you cannot use recursion, this time,
 you must solve this problem in Java using iteration or loops*/ 


import java.util.Scanner;  
class String_07
{  

public static void main(String args[]){  
String s;
  
Scanner sc=new Scanner(System.in);  

System.out.print("Enter a String : ");  
s=sc.nextLine();               

System.out.print("After reverse string is : ");  
for(int i=s.length();i>0;--i){ 
 
System.out.print(s.charAt(i-1));        //printing the character at index i-1  
}  
}  
}  