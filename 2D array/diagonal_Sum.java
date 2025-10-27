public class diagonal_Sum {
    public static int print_Sum(int matrix[][]){
        int sum=0;

        // IT GIVE TIME COMPLEXITY 0(n^2)

//        for(int i=0;i< matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                if(i==j){
//                    sum+=matrix[i][j];
//                } else
//                if(i+j== matrix.length-1){
//                    sum+=matrix[i][j];
//                }
//            }
//        }

             //  OPTIMISED CODE  ==> TIME COMPLEXITY==0(n)

        for(int i=0;i< matrix.length;i++){
            // PRIMARY DIA
            sum+=matrix[i][i];

            // SECONDARY DIA
            if(i!= matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String args[]){
//        int matrix[][]={{1,2,3,4},
//                        {5,6,7,8},
//                        {9,10,11,12},
//                     {13,14,15,16}};

        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println(print_Sum(matrix));

    }
}
