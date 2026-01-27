package Bridge.implementation;

import Bridge.abstraction.Device;

public class PremiumRemoteController extends RemoteController{

        public PremiumRemoteController(Device device) {
            super(device);
        }

        public void mute(){
            System.out.println("Muting the device");
            device.adjustVolume(0);
        }
}
