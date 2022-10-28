package generics;

public class Par<C, V> {
    private C chave;
    private V valor;

    public Par() {

    }

    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() {
        return chave;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Par<?, ?> par)) return false;
//
//        return Objects.equals(chave, par.chave);

        if(this == o) return true;
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;
        Par<?,?> other = (Par<?, ?>) o;
        if(chave == null){
            if(other.chave != null) return false;
        }else if(!chave.equals(other.chave)) return false;
        return true;
    }

    @Override
    public int hashCode() {
//        return chave != null ? chave.hashCode() : 0;
        final int prime = 31;
        int result = 1;
        result = prime * result + ((chave == null)?0:chave.hashCode());
        return result;
    }

}
