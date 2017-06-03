package class2;

public class Class2 {

    public static void main(String[] args) {
        //int a =2;
        //System.out.println( Integer.bitCount(a));
        //int[] M = {1, 4, 5, 7, 6, 5, 5, 7};
      /*  for (int i = 0; i < M.length; i++) {
            System.out.println("Индекс " + (i + 1) + " = " + (M[i] + 5));
        }*/
        /*int i = 0;
        double summ=0;
        while (i < M.length) {
            summ+=M[i];
            i++;
        }
        summ=summ/M.length;
        System.out.println(summ);
        */
        /*do{
            System.out.println("Индекс " + (i + 1) + " = " + (M[i] + 5));
            i++;
        }
        while(i<M.length);*/
       // int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int n=3,m=4;
        byte b=1;
        int[][] AA = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            AA[i][j]+=b;
            b++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            System.out.println(AA[i][j]);
            }
        }
        
        }

}
