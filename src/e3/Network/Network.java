package e3.Network;
import e3.TopicsOfInterest.TopicOfInterest;


import java.util.List;

public abstract class Network implements NetworkManager{

    List<String> listUsuarios;
    List<TopicOfInterest> listTopics;


    public abstract void addUser(String user, List<TopicOfInterest> topicsOfInterest);

    public abstract void removeUser(String user) ;

    public abstract void addInterest(String user, TopicOfInterest topicOfInterest);

    public abstract void removeInterest(String user, TopicOfInterest topicOfInterest) ;

    public abstract List<String> getUsers();

    public abstract List<TopicOfInterest> getInterests();

    public abstract List<TopicOfInterest> getInterestsUser(String user);
}
