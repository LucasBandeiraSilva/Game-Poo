package jogo;

public class Mago extends Jogador implements Mover {
    private int mp;

    @Override
    public int mover(int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mover'");
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

}
