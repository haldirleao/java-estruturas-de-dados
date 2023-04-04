package atribuicaoreferencia;

public class MeuObj {

    Integer num;

    // construtor
    public MeuObj(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }

}
