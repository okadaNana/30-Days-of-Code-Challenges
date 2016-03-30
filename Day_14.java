// Add your code here
public Difference(int[] elements) {
   this.elements = elements;
}

public void computeDifference() {
    int min = elements[0];
    int max = elements[0];
    
    for (int i = 0; i < elements.length; i++) {
        if (elements[i] <= min) {
            min = elements[i];
        }
        
        if (elements[i] >= max) {
            max = elements[i];
        }
    }
    
    maximumDifference = Math.abs(min - max);
}