public class paliindrome {
  public static String stringpal(String word , int size){
    int i=0;
    boolean pal =true; 
    int  k=size-1;
    while (i<k) {
      if (word.charAt(i)!=word.charAt(k)) {
        pal=false;
        break;
      
    }
      
    i++;
    k--;
      }
    
    return (pal)? " pallindrom": " not pallindrom";
  }
  public static void main(String[] args){
    String word = "racecar";
    int size= word.length();
     String result = stringpal(word,size);
    System.out.println("The word is: " + result);

  }
  
}
