public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    scan.close();

    int max = 0;
    int count = 0;
    while (num > 0) {
        int reminder = num % 2;
        num /= 2;
        
        if (reminder == 1) {
            count++;
            if (max <= count) {
                max = count;
            }
        } else {
            count = 0;
        }
    }
    
    System.out.println(max);
}