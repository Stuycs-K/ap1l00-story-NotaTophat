public class HelloWorld{
    //return true if and only if x is prime,false otherwise.
    public static boolean isPrime(int x){
        for (int Count = 2; Count < x; Count++){
            if (x % Count == 0) {return false;}
        }
        return true;
    }

    //return the nth prime,
    //e.g. nthPrime(0) returns 2, nthPrime(1) returns 3, etc.
    public static int nthPrime(int n){
        int PrimesGenerated = 0;
        for (int Count = 2; PrimesGenerated <= n; Count++) {
            if (!isPrime(Count)) {continue;}
            if (PrimesGenerated == n) {return Count;}
            PrimesGenerated += 1;
        }

        return -1;
    }

    public static void main(String[] args){
        int [] Input = {0, 1, 2, 3, 4, 5, 99, 100, 999, 1000, 9592, 9593, 9594, 9595, 9596, 9597, 9598, 9599, 9600, 9601};
        int [] Expected = {2, 3, 5, 7, 11, 13, 541, 547, 7919, 7927, 100003, 100019 ,100043	,100049	,100057, 100069, 100103, 100109, 100129, 100151};

        for (int Index = 0; Index < Expected.length;Index++){
            int ReturnedPrime = nthPrime(Input[Index]);
            if (ReturnedPrime == Expected[Index]) {System.out.println("pass");}
            else {System.out.println("fail: expected " + Expected[Index] + ", but value returned was " + ReturnedPrime);}
        }
    }
}
