package day11.task2;

public abstract class Hero {
    static final int MIN_HEALTH = 0;
    static final int MAX_HEALTH = 100;
    int health;
    int physAtt;
    int magicAtt;
    double physDef;
    double magicDef;

    public Hero() {
        health = 100;
    }

    public void physicalAttack(Hero hero) {
        double attackScore = physAtt * (1 - hero.physDef);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }

}
