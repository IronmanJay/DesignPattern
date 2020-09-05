package DesignPattern.Visitor;

public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是该歌手很待定");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("男人给的评价是该歌手很待定");
    }
}
