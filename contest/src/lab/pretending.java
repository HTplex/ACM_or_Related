package lab;

/**
 * Created by htplex on 4/16/16.
 */
public class pretending {
    public static void main(String[]args){
//        String s="   ";
//
//        String[] ss=s.split(" ");
//        StringBuilder sb=new StringBuilder();
//      for (int i = ss.length-1; i >=0; i--) {
//        sb.append(ss[i]);
//        sb.append(" ");
//      }
//     if(sb.length()==0) return "";
//      while(sb.charAt(sb.length()-1)==' ') sb.deleteCharAt(sb.length()-1);
//      String es="";
//      if(sb.length()==0);
//      System.out.println(sb.reverse().toString());
      System.out.print(Puzzle(" "));
    }

  public static String Puzzle(String s) {
    //  String s="ab cd";
    StringBuilder sb=new StringBuilder(s);
    while(sb.length()>0&&sb.charAt(sb.length()-1)==' ') sb.deleteCharAt(sb.length()-1);
    while(sb.length()>0&&sb.charAt(0)==' ') sb.deleteCharAt(0);

    if(sb.toString().equals("")) return new String("");
    s=sb.toString();
    sb=new StringBuilder("");
    String[] ss=s.split(" ");

    if(ss.length==0) return new String("");
    for (int i = ss.length-1; i >=0; i--) {
      sb.append(ss[i]);
      sb.append(" ");
    }
    sb.deleteCharAt(sb.length()-1);
    if(sb.length()==0) return new String("");

    String es=new String("");
    if(sb.length()!=0) es=sb.reverse().toString();
    return es;
  }
}
