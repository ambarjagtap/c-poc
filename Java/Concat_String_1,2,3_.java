/*
    Input three Strings:
        -Convert vowels of first to '$'
        -Convert consonants of second to '#'
        -Convert string3 to 'upper case'
            
*/


import java.util.Scanner;

// creating a class
class Concat{
    // method to concat String 
    String concat(String str1,String str2,String str3){
        String res="";  // new resultant String 
         
        // iterate String 1 and change all vowels to '$' 
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)=='A'||str1.charAt(i)=='a'||str1.charAt(i)=='E'||str1.charAt(i)=='e'||str1.charAt(i)=='I'||
                str1.charAt(i)=='i'||str1.charAt(i)=='O'||str1.charAt(i)=='o'||str1.charAt(i)=='U'||str1.charAt(i)=='u'){
                    res+='$';
                }
            else res+=str1.charAt(i);   // else concat chars
        }
        // iterate all chars of String 2 
        for(int i=0;i<str2.length();i++){  // replace all consonants to '#'  
            if(str2.charAt(i)!='A'&&str2.charAt(i)!='a'&&str2.charAt(i)!='E'&&str2.charAt(i)!='e'&&str2.charAt(i)!='I'&&
                str2.charAt(i)!='i'&&str2.charAt(i)!='O'&&str2.charAt(i)!='o'&&str2.charAt(i)!='U'&&str2.charAt(i)!='u'){
                    res+='#';
                }
            else res+=str2.charAt(i);  // else concat chars 
        }
        
        res=res.concat((str3.toUpperCase()));  // change str3 to UpperCase and storing it back into 'res'
        return res;
    }
    
    // main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);  // Scanner object
        String str1=inp.nextLine();    
        String str2=inp.nextLine();
        String str3=inp.nextLine();
        
        Concat obj=new Concat();   // create new object of class 'Main'
        System.out.println(obj.concat(str1,str2,str3));   // invoke method of obj & print output
        
    }
}
