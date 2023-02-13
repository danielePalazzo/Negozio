package model;

public enum Racchetta2 {
    GOCCIA(5, 5), DIAMANTE(2, 8), ROTONDA(8, 2);

    private int attackPower;
    private int defensePower;
    private int extraWeight;

    private Racchetta2(int attackPower, int defensePower){
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public int getAttackPower(){
        return this.attackPower + extraWeight / 10;
    }

    public int getDefensePower(){
        return this.defensePower;
    }

    public void addExtraWeight(int extraWeight){
        this.extraWeight += extraWeight;
    }
}
