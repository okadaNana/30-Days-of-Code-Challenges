class Calculator {
    
    int power(int n, int p) {
        if (n < 0 || p < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        } else {
            int result = 1;
            for (int i = 0; i < p; i++) {
                result *= n;
            }
            return result;
        }
    }
    
}
