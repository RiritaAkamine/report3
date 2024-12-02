package jp.ac.uryukyu.ie.e245702;

public class Warrior extends Hero {
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeaponSkill(LivingThing opponent) {
        if (isDead()) {
            System.out.printf("%sは既に死んでいるため、攻撃できません。\n", getName());
            return;
        }
        int damage = (int)(getAttack() * 1.5);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
        opponent.wounded(damage);
    }
}
