public class Troll {
    private int vita;
    private String nome;
    private int altezza;
    private int eta;

    public Troll(int vita, String nome, int altezza, int eta) throws Exception {
        if (vita<=0){
            throw new Exception("La vita non può essere negativa \n");
        }

        if (altezza<=0){
            throw new Exception("L'altezza non può essere negativa \n");
        }

        if (eta<0){
            throw new Exception("L'età non può essere negativa \n");
        }
        setVita(vita);
        setNome(nome);
        setAltezza(altezza);
        setEta(eta);
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getVita() {
        return vita;
    }

    public String getNome() {
        return nome;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getEta() {
        return eta;
    }
}
