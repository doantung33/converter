package test;

public class TV  {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.setChanel(30);
        tv.setVolume(5);
        System.out.println("kenh "+ tv.chanel+ " am luong "+ tv.volume);
        TV tv1= new TV();
        tv1.turnOn();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.channelUp();
        tv1.volumeDown();
        System.out.println("kenh "+ tv1.chanel+ " am luong "+tv1.volume);

    }
    int chanel =1;
    int volume=1;
    boolean on = false;

    public TV (){

    }
    public void turnOn(){
        on= true;
    }
    public void turnOff(){
        on= false;
    }
    public void setChanel(int newChannel){
        if (on&& newChannel>1&& newChannel<120){
            chanel= newChannel;
        }
    }
    public void setVolume(int newVolume){
        if (on&& newVolume>1&& newVolume<7){
            volume= newVolume;
        }
    }
    public void channelUp(){
        if (on&& chanel<120){
            chanel++;
        }
    }
    public void channelDown(){
        if (on&& chanel>1){
            chanel--;
        }
    }
    public void volumeUp(){
        if (on&& volume<7){
            volume++;
        }
    }
    public void volumeDown(){
        if (on&& volume>1){
            volume--;
        }
    }

}
