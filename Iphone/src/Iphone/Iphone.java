package Iphone;

import Iphone.interfaces.Call;
import Iphone.interfaces.musicPlayer;
import Iphone.interfaces.webBrowser;

public class Iphone implements Call, musicPlayer, webBrowser {


    private String model;
    private String brand;

    public Iphone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    public void makeCall() {
        System.out.println("playing music");
    }

    @Override
    public void tocarMusica() {
        System.out.println("making a call");
    }

    @Override
    public void webBrowser() {
        System.out.println("Searching...");
    }
}
