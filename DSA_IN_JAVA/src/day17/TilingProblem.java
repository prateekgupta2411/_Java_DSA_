package day17;

public class TilingProblem {
    public static int tiling(int n) {// 2 * n(floor size)

        //base case
        if(n==0 || n==1){
            return 1;
        }
        // kaam
        // vertical choice
        int verticalTile = tiling(n-1);

        // horizontal choice
        int horizontalTile = tiling(n-2);
        int totalWay = verticalTile + horizontalTile;
        return totalWay;

    }

    public static void main(String[] args) {
        System.out.println(tiling(4));

    }
}
