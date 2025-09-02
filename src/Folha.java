import java.util.ArrayList;
import java.util.List;

public class Folha {
    private float saldo;
    private List<Pagamento> funcionarios;
    public Folha(){
        this.saldo = 0;
        this.funcionarios = new ArrayList<Pagamento>();
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void add(Pagamento p){
        this.funcionarios.add(p);
    }

    public void calcular(){
        for(Pagamento p : this.funcionarios){
            this.saldo += p.getSaldo();
        }
    }
}
