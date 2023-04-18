package org.example.transportFactory;

public class SelectTransport {

    public static SelectTransport instance;

    public static SelectTransport getInstance() {
        if (instance == null) {
            instance = new SelectTransport();
        }
        return instance;
    }

    private SelectTransport() {
    }

    public Transport getTransport(TransportType transportType) {
        Transport transport = null;
        switch (transportType) {
            case ROAD:
                transport = new Truck();
                break;

            case SKY:
                transport = new Airplane();
                break;

            case SEA:
                transport = new Ship();
                break;

        }
        return transport;
    }

}
