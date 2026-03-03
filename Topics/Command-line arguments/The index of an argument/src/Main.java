class Problem {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            if ("test".equals(args[i])) {
                System.out.println(i);
            } else {
                count++;
            }
            if (count == args.length) {
                System.out.println(-1);
            }
        }
    }
}
