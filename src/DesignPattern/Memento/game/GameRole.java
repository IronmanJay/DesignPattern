package DesignPattern.Memento.game;

public class GameRole {

    private int vit;
    private int def;

    // 创建Memento，即根据当前的状态的到Memento
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    // 从备忘录对象恢复GameRole的状态
    public void recoverGameRoleFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    // 显示当前游戏角色的状态
    public void display() {
        System.out.print("游戏角色当前的攻击力：" + this.vit);
        System.out.println("，游戏角色当前的防御力：" + this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
