public class Clt implements Pagamento{
    private float salario;
    public Clt(float salario){
        this.salario = salario;
    }
    public float getSaldo(){
        return this.salario;
    }
}
