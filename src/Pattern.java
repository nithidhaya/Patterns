//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pattern {
    public static void main(String[] args){

        pattern15(5);

    }


    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row= 0; row<n; row++){
            for(int col = 1; col <= n - row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <=row; col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row =1; row<=2*n - 1;row++){
            int totalColsInRow = row<=n? row : 2*n - row ;
            for(int col=1;col<=totalColsInRow;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int row = 1;row<=n; row++){
            for(int col = 1; col<= n - row; col++){
                System.out.print(" ");
            }
            for(int col=1; col<= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int row=0;row<n;row++){
            for(int col = 1; col<= row;col++){
                System.out.print(" ");
            }
            for(int col=1; col <= n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern8(int n){
        for(int row = 1; row <= n ; row++){
            for(int col=1; col<= n - row; col++){
                System.out.print(" ");
            }
            for(int col=1; col<= 2* row - 1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int row =0;row<n; row++){
            for(int col=1;col<=row; col++){
                System.out.print(" ");
            }
            for(int col=1;col<= 2*(n - row)-1;col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern10(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col <= row-1;col++){
                System.out.print(" ");
            }
            for(int col=1; col<= (n-row) + 1 ;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = 1; row <= 2*n; row++) {
            int colInRows = row <= n ? (n - row) + 1 : row - n; // correct
            int noOfSpaces = row <= n ? row - 1 : 2*n - row - 1; // fix
            for (int col = 1; col <= noOfSpaces; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= colInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        for(int row = 1; row<=n; row++){
            for(int col=row;col<n;col++){
                System.out.print(" ");
            }
            for(int ind = 1; ind<= (2*row)-1; ind++){
                if(ind==1|| row==n || ind== (2*row)-1 )
                {System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int row = 0; row < n; row++) {
            // Print leading spaces (correct)
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            // Number of columns in this row
            int cols = 2*(n - row) - 1;
            // Iterate through each column in the row
            for (int ind = 1; ind <= cols; ind++) {
                // If it's the first or last column, OR the first row, print '*'
                if (ind == 1 || ind == cols || row == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            // Correct leading spaces
            int noOfSpaces = row <= n ? n - row : row - n;
            for (int col = 1; col <= noOfSpaces; col++) {
                System.out.print(" ");
            }
            // Correct number of columns
            int cols = row <= n ? 2 * row - 1 : 2 * (2 * n - row) - 1;
            // Print borders only (hollow diamond)
            for (int ind = 1; ind <= cols; ind++) {
                if (ind == 1 || ind == cols || row == 1 || row == 2 * n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }






    static void patternx(int n){
        for(int row = 0;row<=n; row++){
            for(int col=1;col<=2*row-1;col++){
                if(col==n||col==2*row-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
    static void patterny(int n){
         for(int row = 0;row<=n;row++){
             for(int col = 1;col<=row;col++){
                 System.out.print(" ");
             }
             for(int col=1;col<=2*(n-row)-1;col++){
                 if(row==n){
                     System.out.print("* ");
                 }
                 else{
                     System.out.print(" ");
                 }

             }
         }
    }
}
