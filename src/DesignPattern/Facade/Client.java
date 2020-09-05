package DesignPattern.Facade;

public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        System.out.println("--------------------");
        homeTheaterFacade.play();
        System.out.println("--------------------");
        homeTheaterFacade.pause();
        System.out.println("--------------------");
        homeTheaterFacade.end();
    }

}
