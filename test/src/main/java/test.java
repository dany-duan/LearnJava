import java.util.*;

/**
 * Created by ymx on 2018/7/26.
 */
public class test {

    public static void LengthOfLongestSubstring(String s){
        String str = null;
        Character ch =null;
        Set<Character> set = new HashSet<Character>();

        for (int i =0;i<s.length();i++){

            ch = s.charAt(i);
            while (set.contains(ch)) break;
            set.add(ch);
        }
//        str = StringUtils.join(set.toArray(),",");
//        str = set.toString();
        System.out.println("不重复内容是："+set+"长度是："+set.size());




    }

    private static void Reserve(int aa) {
        int x=0;
        int reservnum = aa;
        if(reservnum<0 ||reservnum%10==0&&reservnum!=0) System.out.println(aa+"不是回文数");
        while (x<reservnum){
            x = x*10+ reservnum%10;
//            System.out.println(x);
            reservnum=reservnum/10;
        }
        if(x==reservnum) System.out.println(aa+"是回文数");
        else System.out.println(aa+"不是回文数");



    }

    public static void ReservNum(int aa){
        int reservnum =0;
        while(aa<0){

        }



        while (aa/10>=0){
            System.out.println("aa:"+aa);

            reservnum = reservnum*10 + aa%10;

            aa=aa/10;
            if(aa % 10 == 0) break;


        }
        System.out.println("反转后的数字是:"+reservnum);



    }

    public static void LongestCommonPrefix(String[] str){
        Set<Character> set = new HashSet<Character>();




    }

    public static int[] MergeTwoList(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        int k=0;
        for(int i =0,j=0;i<a.length&&j<b.length;)  {
            if (a[i]<b[j++] )
                c[k++]=b[j];
            else c[k++] = a[j];

        }





        return c  ;

    }

    public static void RemoveNum(){
        String str = null;
        String b = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入5个数字:");
        if(sc.hasNextLine()) {
            str = sc.nextLine();
            System.out.println(str);

        }
        String[] arr = null;
        arr=str.split(" ");
        System.out.println("请输入一个数字:");
        if (sc.hasNext()){
            b = sc.next();
            System.out.println(b);
        }


        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        Iterator <String> it = list.iterator();
//        while (it.hasNext()){
//            String x = it.next();
////            System.out.print(x);
//            if(x.equals(b)){
//                it.remove();
//            }
//        }
        for(int i =0;i<list.size();i++){
//            System.out.println(list.get(i));

            if(list.get(i).equals(b))
//            if(list.contains(b))
            {
                list.remove(i);
            }


        }
        System.out.println(list);




    }


    public static void RemoveNum1(Integer [] a,int b){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
        for(int i = 0 ; i < list.size(); i++){
//            System.out.println(list.get(i));
            if(list.get(i).equals(b))  {
                list.remove(i);
            }

        }
        System.out.println(list);


    }

    public static void main(String[] args){
        String s = "aaabbcc";
//        LengthOfLongestSubstring(s);

        int aa= 123321;
//        Reserve(aa);

        int jj= 123;
//        ReservNum(jj);


//        String[] str = {"follow","flower"};
//        System.out.println(str.length);
//        System.out.println(str[0]);

//        LongestCommonPrefix(str);

       // int[] a= new int[5];
        Integer[] a ={1,3,3,3,3};
        int[] b ={2,4,6,8,10};
        int c = 3;
//        MergeTwoList( a,b);
//        RemoveNum();
        RemoveNum1(a,c);


    }




}
