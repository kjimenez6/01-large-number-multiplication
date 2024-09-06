public class GradeSchoolMultiplication {

    private static final int DEFAULT_BASE = 10;

    public static int[] multiply(final int[] x, final int[] y, final int base) {
        int[] product = new int[x.length + y.length]; 
            for (int i = 0; i < y.length; i++) {
                for (int a = 0; a < x.length; a++) {
                    product[ i + a] += y[i] * x[a]; 
                    product[ i + a + 1] += product [i + a] / base;
                    product[i + a] %= base;
                }
    } // method multiply

    public static int[] multiply(final int[] x, final int[] y) {
        return multiply(x, y, DEFAULT_BASE);
    } // method multiply
}
