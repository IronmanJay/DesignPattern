package DesignPattern.Memento.theory;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("状态#1，攻击力：100");
        // 保存了当前的状态
        caretaker.add(originator.saveStateMemento());
        originator.setState("状态#2，攻击力：80");
        caretaker.add(originator.saveStateMemento());
        originator.setState("状态#3，攻击力：50");
        caretaker.add(originator.saveStateMemento());
        // 现在是状态3
        System.out.println("当前的状态是" + originator.getState());
        // 希望恢复到状态1，将originator恢复到状态1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复到状态1后当前的状态是" + originator.getState());
    }

}
