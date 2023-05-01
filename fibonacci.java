class FibonacciSeries {
    public static void main(String[] args) {
        int n1, n2, n3, count;
        n1 = 0;
        n2 = 1;
        System.out.print(n1+",");
        System.out.print(n2);
        count = 10;
        for (int i = 0; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(","+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}