package e3;

import e3.Network.NetworkMap;
import e3.TopicsOfInterest.TopicOfInterest;

import java.util.*;

public class main {
    public static void main(String[] args) {

        String juan="Juan";
        String claudio="claudio";
        String jose="jose";

        List<TopicOfInterest> topicos= new ArrayList<>();
        List<TopicOfInterest> topicos2= new ArrayList<>();

        topicos.add(TopicOfInterest.DEPORTE);
        topicos.add(TopicOfInterest.ROPA);

        topicos2.add(TopicOfInterest.JUEGOS);
        topicos2.add(TopicOfInterest.ROPA);

        NetworkMap red= new NetworkMap();

        red.addUser(juan, topicos);
        red.addUser(claudio, topicos2);

        System.out.print(red.getInterests());



    }
}
