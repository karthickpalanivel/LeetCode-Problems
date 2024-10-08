import java.util.Scanner;

public class SetZerosMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j<m;j++){
                arr[n][m] = sc.nextInt();
            }
        }
        
        solution(arr);

        sc.close();
    }

    private static void solution(int[][] matrix){
        boolean fr = false, fc = false;
        
        for(int i = 0; i < matrix.length; i++){

            for(int j = 0; j< matrix[0].length; j++){
            
                if(matrix[i][j]==0){
            
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0; 
                }
            }
        }

        for(int i = 1; i < matrix.length; i++){

            for(int j = 1; j < matrix[0].length; j++){
            
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
            
                    matrix[i][j] = 0;
                }
            }
        }

        if(fr){
            for(int j = 0; j<matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }

        if(fc){
            for(int i = 0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}