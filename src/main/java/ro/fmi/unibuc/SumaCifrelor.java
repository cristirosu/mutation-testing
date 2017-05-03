package ro.fmi.unibuc;

/**
 * Created by User on 3/19/2017.
 */
public class SumaCifrelor {

    public  Integer compute(Integer a, Integer b) throws Exception {
        ver1(a,b);
        if(areEqual(a,b)) return 2 * sumaCifrelor(a);
        return sumaCifrelor(a) + sumaCifrelor(b);
    }

    private Integer sumaCifrelor(Integer a) {
        Integer sum = 0;
        while(a != 0){
            sum += a%10;
            a = a/10;
        }
        return sum;
    }

    private void ver1(Integer a, Integer b) throws Exception {
        if((a < 1 || a > 100) || (b < 1 || b > 100)) throw new Exception("Validation Error");
    }

    private Boolean areEqual(Integer a, Integer b){
        return a != null && b != null && a.equals(b);
    }

}