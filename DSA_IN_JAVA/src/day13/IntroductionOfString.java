package day13;

public class IntroductionOfString {
    public static void Char(String str){
        for(int i=0;i<str.length();i++){
//            int ans = str.charAt(i);
            System.out.print(str.charAt(i) +" ");
        }
    }
    public static void main(String[] args) {
//        char[] arr = {'a','b','c','d'};
//        String s = "Pratee4k";
//        String name = new String("Gupta");
        // String are immutable
//        Scanner sc = new Scanner(System.in);
//        String name1;
//        name1 =sc.nextLine();
//        System.out.println(name1);
//        System.out.println(s.length());

        // concatenation
        String fN = "Prateek";
        String  lN = "Gupta";
        String fullName = fN + " " + lN;
//        System.out.println(fullName);
//        System.out.println(fullName.charAt(8));
        Char(fullName);
    }
}
