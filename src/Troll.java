public class Troll {
    private int vita;
    private String nome;
    private int altezza;
    private int danno;

    public Troll(int vita, String nome, int altezza, int danno) throws Exception {
        if (vita<=0){
            throw new Exception("La vita non può essere negativa \n");
        }

        if (altezza<=0){
            throw new Exception("L'altezza non può essere negativa \n");
        }

        if (danno<0){
            throw new Exception("L'età non può essere negativa \n");
        }
        setVita(vita);
        setNome(nome);
        setAltezza(altezza);
        setDanno(danno);
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

    public void setDanno(int eta) {
        this.danno = danno;
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

    public int getDanno() {
        return danno;
    }
}
