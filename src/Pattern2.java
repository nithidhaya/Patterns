public class Pattern2 {
    public static void main(String[] args) {
        pattern2(5);
    }

    static void pattern1(int n){
        for(int row =1; row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(row);
            }
            System.out.println();
        }

    }

    static void pattern2(int n){
        for(int row= 0; row<n; row++){
            for(int col = 1; col <= n - row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
