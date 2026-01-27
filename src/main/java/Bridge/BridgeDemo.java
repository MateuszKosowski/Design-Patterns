package Bridge;

import Bridge.abstraction.Device;
import Bridge.abstraction.Radio;
import Bridge.abstraction.TV;
import Bridge.implementation.BasicRemoteController;
import Bridge.implementation.PremiumRemoteController;
import Bridge.implementation.RemoteController;

public class BridgeDemo {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteController tvRemote = new BasicRemoteController(tv);
        RemoteController radioRemote = new BasicRemoteController(radio);
        PremiumRemoteController tvRemotePremium = new PremiumRemoteController(tv);
        PremiumRemoteController radioRemotePremium = new PremiumRemoteController(radio);

        // Dzięki mostowi, możemy używać różnych pilotów z różnymi urządzeniami i
        // nie musimy za każdym razem tworzyć nowej klasy np TVRemotePremium, RadioRemotePremium, TVRemoteBasic itd.

        tvRemote.on();
        radioRemotePremium.mute();

    }
}
