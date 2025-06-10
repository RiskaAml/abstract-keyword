abstract class Phone{
    public abstract void editVideo();
    public abstract void createPresentation();
    public void replayChat(){
        System.out.println("replaying friend's chat...");
    }
}
abstract class Samsung extends Phone{
    //createPresentationnya bukan disini, jadi classnya abstrak
    public void editVideo(){
        System.out.println("Editing video.....");
    }
}
class AdvSamsung extends Samsung{
    public void createPresentation(){
        System.out.println("creating presentation.....");
    }
}
public class Main {

    public static void main(String[] args) {
        Phone obj = new AdvSamsung();
        obj.editVideo();
        obj.replayChat();
        obj.createPresentation();
    }
    
}
