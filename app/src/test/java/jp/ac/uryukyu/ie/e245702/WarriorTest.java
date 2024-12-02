package jp.ac.uryukyu.ie.e245702;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attackWithWeaponSkillTest() {
        int initialEnemyHp = 50;
        Warrior warrior = new Warrior("勇者", 100, 10);
        Enemy enemy = new Enemy("スライム", initialEnemyHp, 3);

        // 3回攻撃して、それぞれのダメージが攻撃力の150%であることを確認
        for (int i = 0; i < 3; i++) {
            int expectedDamage = (int)(warrior.getAttack() * 1.5);
            warrior.attackWithWeaponSkill(enemy);
            int remainingHp = enemy.getHitPoint();
            assertEquals(initialEnemyHp - expectedDamage, remainingHp);
            initialEnemyHp = remainingHp; // 残りHPを更新
        }
    }
}
