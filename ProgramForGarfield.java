import java.util.*;
import java.awt.*;
class ProgramForGarfield{
public static void main(String[] args){
     int day;int c;
     Scanner s=new Scanner(System.in);
     System.out.println("Hlo Garfield!!");
     System.out.println("Enter a day(1-Sunday,0-Monday, 2-Tuesday, 3-Wednesday, 4-Thursday, 5-Fridqay, 6-Saturday):");
     day=s.nextInt();
     switch(day){
       case 0:
       System.out.println("Sorry, I feel bad for you.");
      break;
       case 1:
         System.out.println("Do you want to change your day from Sunday to Tuesday?(Press 1-true,0-false):");
           c=s.nextInt();
           if(c==1){
               System.out.println("நம்ம ஊருல, நம்ம நாட்டிலேயே, இனிமே Monday என்ற கிழமையே கிடையாது!! சரித்திரத்தை மாற்றி அமைக்க போறோம் - இனி Sundayக்கு அப்புறம் Tuesday தான்!\nCongratulations! Day changed from Sunday to Tuesday!");
                   }
           else{
                 System.out.println("As you wish. Suffer on Monday. போய் சாவு!!");

               
               }
           break;
       default:
                 System.out.println("Have a nice day.");

          


           
          









}

}}