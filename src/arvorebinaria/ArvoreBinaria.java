package arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {

    private NoBin<T> raiz;

    // construtor
    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        NoBin<T> novoNo = new NoBin<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private NoBin<T> inserir(NoBin<T> atual, NoBin<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoRefEsq(inserir(atual.getNoRefEsq(), novoNo));
        } else {
            atual.setNoRefDir(inserir(atual.getNoRefDir(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem() {
        System.out.println("\n Exibindo InOrdem: ");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(NoBin<T> atual) {
        if (atual != null) {
            exibirInOrdem(atual.getNoRefEsq());
            System.out.print(atual.getConteudo() + " ");
            exibirInOrdem(atual.getNoRefDir());
        }
    }

    public void exibirPosOrdem() {
        System.out.println("\n Exibindo PosOrdem: ");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(NoBin<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoRefEsq());
            exibirPosOrdem(atual.getNoRefDir());
            System.out.print(atual.getConteudo() + " ");
        }
    }

    public void exibirPreOrdem() {
        System.out.println("\n Exibindo PreOrdem: ");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(NoBin<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + " ");
            exibirPreOrdem(atual.getNoRefEsq());
            exibirPreOrdem(atual.getNoRefDir());
        }
    }

    public void remover(T conteudo) {

        try {
            NoBin<T> atual = this.raiz;
            NoBin<T> pai = null;
            NoBin<T> filho = null;
            NoBin<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoRefEsq();
                } else {
                    atual = atual.getNoRefDir();
                }
            }
            if (atual == null) {
                System.out.println("Conteúdo não encontrado. Bloco try");
            }

            if (pai == null) {
                if (atual.getNoRefDir() == null) {
                    this.raiz = atual.getNoRefEsq();
                } else if (atual.getNoRefEsq() == null) {
                    this.raiz = atual.getNoRefDir();
                } else {
                    for (temp = atual, filho = atual.getNoRefEsq();
                         filho.getNoRefDir() != null;
                         temp = filho, filho = filho.getNoRefEsq()) {
                        if (filho != atual.getNoRefEsq()) {
                            temp.setNoRefDir(filho.getNoRefEsq());
                            filho.setNoRefEsq(raiz.getNoRefEsq());
                        }
                    }
                    filho.setNoRefDir(raiz.getNoRefDir());
                    raiz = filho;
                }
            } else if (atual.getNoRefDir() == null) {
                if (pai.getNoRefEsq() == atual) {
                    pai.setNoRefEsq(atual.getNoRefEsq());
                } else {
                    pai.setNoRefDir(atual.getNoRefEsq());
                }
            } else if (atual.getNoRefEsq() == null) {
                if (pai.getNoRefEsq() == atual) {
                    pai.setNoRefEsq(atual.getNoRefDir());
                } else {
                    pai.setNoRefDir(atual.getNoRefDir());
                }
            } else {
                for (temp = atual, filho = atual.getNoRefEsq();
                     filho.getNoRefDir() != null;
                     temp = filho, filho = filho.getNoRefDir()) {
                    if (filho != atual.getNoRefEsq()) {
                        temp.setNoRefDir(filho.getNoRefEsq());
                        filho.setNoRefEsq(atual.getNoRefEsq());

                    }
                    filho.setNoRefDir(atual.getNoRefDir());
                    if (pai.getNoRefEsq() == atual) {
                        pai.setNoRefEsq(filho);
                    } else {
                        pai.setNoRefDir(filho);
                    }
                }
            }

        } catch (NullPointerException erro) {
            System.out.println("Conteúdo não encontrado. Bloco catch");
        }
    }
}
