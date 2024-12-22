package ArvoreBinaria;
/** Teória: A ARVORE binaria de busca tem 3 nós (central,esquerdo e direito)
 * Inserção para inserir um valor,deve ser comparado ao valor do nó central(o primeiro valor que você colocará na arvore)
 *      SE FOR menor deverá ir para a esquerda.
 *      SE FOR MAIOR deverá ir para a direita.
 * 
 */
public class ArvoreBinaria {
    public class NodeArvore {
        private int noRaiz;
        private int noEsq;
        private int noDir;
        
        public int getNoRaiz() {
            return noRaiz;
        }
        public void setNoRaiz(int noRaiz) {
            this.noRaiz = noRaiz;
        }
        public int getNoEsq() {
            return noEsq;
        }
        public void setNoEsq(int noEsq) {
            this.noEsq = noEsq;
        }
        public int getNoDir() {
            return noDir;
        }
        public void setNoDir(int noDir) {
            this.noDir = noDir;
        }
        public NodeArvore(int noRaiz, int noEsq, int noDir) {
            this.noRaiz = noRaiz;
            this.noEsq = noEsq;
            this.noDir = noDir;
        }
        
    }
    
}
