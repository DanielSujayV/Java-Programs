//string matching
class StringMatch{
public static void main(String[] args){
String T="UKRAINE";
String P="IN";
int n=T.length();
int m=P.length();
for(int i=0;i<n-m;i++){
int j=0;
while(j<m && P.charAt(j) == T.charAt(i+j)){
     j=j+1;

}
if(j==m){
System.out.println("Pattern found at index:"+i);
return;
}

}
System.out.println("PAttern not found.");


}

}