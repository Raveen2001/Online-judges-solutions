public class ProdOfGcd {
    public static void main(String[] args) {
        
    }

    static int sumOfGcd(int n){
        int sum = 0;
        for(int i = 1; i<= n; i++){
            int tempProd = i * gcd(i, n);
            sum += tempProd;
        }
        return sum;
    }

    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }  
}
