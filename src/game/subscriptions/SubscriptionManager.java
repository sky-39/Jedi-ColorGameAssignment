package game.subscriptions;

import game.things.ThingsManager;

import java.util.HashSet;
import java.util.Set;

public class SubscriptionManager {
    private final Set<String> subscriptions = new HashSet<>();
    public void subscribe(String thing, ThingsManager thingsManager){
        if(thingsManager.containsThing(thing)){
            subscriptions.add(thing);
            System.out.println(thing + " has been subscribed");
        } else {
            System.out.println(thing + " is not in the list of things.");
        }
    }

    public void unsubscribe(String thing){
        if(subscriptions.remove(thing)){
            System.out.println(thing + " has been unsubscribed.");
        } else {
            System.out.println(thing + " was not subscribed.");
        }
    }

    public void listSubscriptions(){
        if(subscriptions.isEmpty()){
            System.out.println("No Subscriptions");
        } else {
            System.out.println("Subscribed things");
            for (String subscription : subscriptions){
                System.out.println(subscription);
            }
        }
    }

    public Set<String> getSubscriptions() {
        return subscriptions;
    }
}
