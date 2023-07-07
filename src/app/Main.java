package app;

import app.devices.Radio;
import app.devices.Tv;
import app.remoteControls.AdvancedRemoteControl;
import app.remoteControls.RemoteControl;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        RemoteControl remoteControl = new RemoteControl(tv);
        System.out.println(tv.isEnabled());
        remoteControl.togglePower();
        System.out.println(tv.isEnabled());

        Radio radio = new Radio();
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);
        advancedRemoteControl.volumeUp();
        advancedRemoteControl.volumeUp();
        advancedRemoteControl.volumeUp();
        System.out.println(radio.getVolume());
        advancedRemoteControl.mute();
        System.out.println(radio.getVolume());
    }
}
