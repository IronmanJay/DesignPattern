package DesignPattern.Memento.game;

// 守护者对象，保存游戏角色的状态
public class Caretaker {

    // 如果只保存一次状态
    private Memento memento;
    // 如果对GameRole保存多次状态
    // private ArrayList<Memento> mementos;
    // 如果对多个游戏对象保存多个状态
    // private HashMap<String, ArrayList<Memento>> rolesMementos;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
