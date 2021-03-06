package e3.Network;
import e3.TopicsOfInterest.TopicOfInterest;

import java.util.List;

public interface NetworkManager {

        void addUser(String user, List<TopicOfInterest> topicsOfInterest);

        void removeUser(String user);

        void addInterest(String user, TopicOfInterest topicOfInterest);

        void removeInterest(String user, TopicOfInterest topicOfInterest);

        List<String> getUsers();

        List<TopicOfInterest> getInterests();

        List<TopicOfInterest> getInterestsUser(String user);

}
