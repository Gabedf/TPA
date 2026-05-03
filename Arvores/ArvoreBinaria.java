package Arvores;

import java.util.Comparator;

public class ArvoreBinaria<T> extends ArvoreBinariaBase<T> {

    protected NoArvore<T> raiz;
    protected int qtdNos;

    public ArvoreBinaria(Comparator<T> comparador) {
        super(comparador);
        this.raiz = null;
        this.qtdNos = 0;
    }

    @Override
    public int altura() {
        // TODO: Implementar
        throw new UnsupportedOperationException("Método altura não implementado.");
    }

    @Override
    public String caminharEmNivel() {
        // TODO: Implementar
        throw new UnsupportedOperationException("Método caminharEmNivel não implementado.");
    }

    @Override
    public String caminharEmOrdem() {
        // TODO: Implementar
        throw new UnsupportedOperationException("Método caminharEmOrdem não implementado.");
    }

    @Override
    public int quantidadeNos() {
        return this.qtdNos;
    }

    @Override
    public void adicionar(T novoValor) {
        raiz = adicionarRecursivo(raiz, novoValor);
    }

    private NoArvore<T> adicionarRecursivo (NoArvore<T> atual, T valor) {
        if (atual == null) {
            this.qtdNos++;
            return new NoArvore<>(valor);
        }

        int comparacao = this.comparador.compare(valor, atual.getValor());

        if (comparacao < 0) {
            atual.setEsquerdo(adicionarRecursivo(atual.getEsquerdo(), valor));
        } else if (comparacao > 0) {
            atual.setDireito(adicionarRecursivo(atual.getDireito(), valor));
        }
        return atual;
    }

    @Override
    public T pesquisar(T valor) {
        // TODO: Implementar de forma recursiva
        throw new UnsupportedOperationException("Método pesquisar não implementado.");
    }

    @Override
    public boolean remover(T valor) {
        // TODO: Implementar de forma recursiva
        throw new UnsupportedOperationException("Método remover não implementado.");
    }
}
