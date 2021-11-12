package e3.Network;

import e3.TopicsOfInterest.TopicOfInterest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class NetworkMap extends Network{

    public Map<String,List<TopicOfInterest>> map;

    public NetworkMap() {
        this.map = new HashMap<>();
    }

    public void addUser(String user, List <TopicOfInterest> topicsOfInterest) {
        map.put(user, topicsOfInterest);
    }

    @Override
    public void removeUser(String user) {
        map.remove(user);
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicOfInterest) {
        map.get(user).add(topicOfInterest);
    }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest) {
        map.get(user).remove(topicOfInterest);
    }

    @Override
    public List<String> getUsers() {
        return new ArrayList<>(map.keySet());
    }

     @Override
    public List<TopicOfInterest> getInterests() {
        List<TopicOfInterest> interests= new ArrayList<>();
        for(List<TopicOfInterest> t: map.values()){
            interests.addAll(t);
        }
        return interests;
    }

    @Override
    public List<TopicOfInterest> getInterestsUser(String user) {
        return this.map.get(user);
    }
}
