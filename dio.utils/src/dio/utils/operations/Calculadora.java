package dio.utils.operations;

import dio.utils.operations.internal.DivHelper;
import dio.utils.operations.internal.MultiHelper;
import dio.utils.operations.internal.SubHelper;
import dio.utils.operations.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultiHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;


    public Calculadora(){
        divHelper = new DivHelper();
        multHelper = new MultiHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }
    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }

    public int sub(int a, int b ){
        return subHelper.execute(a,b);
    }

    public int mult(int a, int b){
        return multHelper.execute(a,b);
    }

    public int div(int a, int b){
        return divHelper.execute(a,b);
    }
// modulo protegido

}
