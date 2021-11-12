package e3;

import e3.Network.NetworkMap;
import e3.TopicsOfInterest.TopicOfInterest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NetworkTest {


        NetworkMap red= new NetworkMap();
        String juan="Juan";
        String claudio="claudio";
        List<TopicOfInterest> topicos= new ArrayList<>();
        List<TopicOfInterest> topicos2= new ArrayList<>();



    @Test
    void addUser(){
        red.addUser(juan, topicos);
        red.addUser(claudio, topicos2);
    }

}
