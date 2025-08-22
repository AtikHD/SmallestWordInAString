import java.util.Scanner;
public class SmallestWordInAString {
    public static void main(String[] args) {
        System.out.println("Enter your string");
        Scanner sc=new Scanner(System.in);
        String MainString=sc.nextLine();
        String smallest="";
        String TempWord="";
        for(int i=0; i<MainString.length(); i++){
            if(i<MainString.length() && MainString.charAt(i)!=' ' ){
                TempWord+=MainString.charAt(i);
            }
            else{
                if(TempWord.length()>0){
                    if(smallest.equals("") || TempWord.length() < smallest.length()){
                        smallest=TempWord;
                    }
                }
                TempWord="";
            }
        }
        System.out.println("Smallest word is: "+ smallest);
    }
}
