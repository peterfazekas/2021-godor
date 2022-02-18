package hu.pit;

import hu.pit.controller.PitService;
import hu.pit.model.DataApi;
import hu.pit.model.DataParser;
import hu.pit.model.FileReader;

public class App {

    private final PitService service;

    private App() {
        DataApi dataApi = new DataApi(new FileReader(), new DataParser());
        service = new PitService(dataApi.getData("melyseg.txt"));
    }

    public static void main(String[] args) {
        new App().run();
    }

    private void run() {
        System.out.println("1. feladat");
    }
}
