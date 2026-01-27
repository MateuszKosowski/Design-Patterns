package Bridge.implementation;

import Bridge.abstraction.Device;

public abstract class RemoteController {

    protected Device device;

    public RemoteController(Device device){
        this.device = device;
    }

    public void on(){
        device.on();
    }

    public void off(){
        device.off();
    }

    public void adjustVolume(int percentage){
        device.adjustVolume(percentage);
    }

}
