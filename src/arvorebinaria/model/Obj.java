package arvorebinaria.model;

public class Obj extends ObjArvore<Obj> {

    Integer meuvalor;

    public Obj(Integer meuvalor) {
        this.meuvalor = meuvalor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Obj other = (Obj) obj;
        if (meuvalor == null) {
            if (other.meuvalor != null)
                return false;
        } else if (!meuvalor.equals(other.meuvalor))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((meuvalor == null) ? 0 : meuvalor.hashCode());
        return result;
    }

    @Override
    public int compareTo(Obj outro) {

        int i = 0;
        if (this.meuvalor > outro.meuvalor) {
            i = 1;
        } else if (this.meuvalor < outro.meuvalor) {
            i = -1;
        }
        return i;
    }

    @Override
    public String toString() {
        return meuvalor.toString();
    }

}
