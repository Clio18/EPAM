package project1.main;

import project1.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.getFullTrack();
        service.printStarBucksTrak();
    }
}
