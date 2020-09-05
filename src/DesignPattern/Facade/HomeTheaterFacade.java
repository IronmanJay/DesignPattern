package DesignPattern.Facade;

public class HomeTheaterFacade {

    // 定义各个子系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    // 构造器
    public HomeTheaterFacade() {
        super();
        this.theaterLight = theaterLight = TheaterLight.getInstance();
        this.popcorn = popcorn = Popcorn.getInstance();
        this.stereo = stereo = Stereo.getInstance();
        this.projector = projector = Projector.getInstance();
        this.screen = screen = Screen.getInstance();
        this.dvdPlayer = dvdPlayer = DVDPlayer.getInstance();
    }

    // 操作分成四步
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }

}
