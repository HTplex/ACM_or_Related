
public class Beau1 {
    public static void fun(int l,int r,char[] str,int count){
        int co=0;
        if(l<0 || r<l) return;
        if(l==0&&r==0){
            StringBuilder sb=new StringBuilder("");
            for (int i = 0; i < str.length; i++) {
                sb.append(str[i]);
            }
            re[curs++]=sb.toString();
            co++;
        }else{
            if(l>0){
                str[count]='(';
                fun(l-1, r, str, count+1);
            }
            if(r>l){
                str[count]=')';
                fun(l, r-1, str, count+1);
            }
        }

    }

   static String[] re;
   static int curs=0;
    public static String[] Puzzle(int n) {


        long m=1;
        for (int i = n+2; i <= 2*n; i++) {
            m*=i;
        }
       // System.out.println(m);
        for (int i = 1; i <= n; i++) {
            m/=i;
        }
        re=new String[(int)(m)];

        char[] str=new char[n*2];
        fun(n,n,str,0);
        return re;
    }
    public static void main(String[]args){
        Puzzle(4);
        for (String s:re) {
            System.out.println(s);
        }
    }


//        int n=4;
//
//        long m=1;
//        for (int i = n+2; i <= 2*n; i++) {
//            m*=i;
//        }
//        System.out.println(m);
//        for (int i = 1; i <= n; i++) {
//            m/=i;
//        }
//        System.out.println(m);



}
