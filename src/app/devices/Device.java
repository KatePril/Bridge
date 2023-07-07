package app.devices;

import java.sql.Struct;

public class Device {
    protected int volume = 0;
    protected int chanel = 0;
    protected boolean isEnabled = true;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int percent) {
            this.volume = percent;
    }

    public int getChanel() {
        return chanel;
    }

    public void setChanel(int chanel) {
            this.chanel = chanel;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }
}
