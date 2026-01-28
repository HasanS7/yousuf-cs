public class Joe {
    public static void main(String[] args) {
//        System.out.println(max(5, 8));
        int a = 10;
        double b = (double) a;
        System.out.println(b);
    }
    public static int add(int jub1, int jub2){
        int sum = (jub1 + jub2);
        return sum;
    }
    public static int max(int x1, int x2){
        boolean max1 = (x1 > x2);
        boolean max2 = (x2 > x1);
        boolean equal = (x1 == x2);
        if(max1 == true){
            return x1;
        }
        else if(max2 == true){
            return x2;
        }
        else{
            return x1;
        }
    }
}
