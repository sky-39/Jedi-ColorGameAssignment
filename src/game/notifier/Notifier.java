package game.notifier;

import game.subscriptions.SubscriptionManager;
import game.things.ThingsManager;

import java.util.List;

public class Notifier {
    private SubscriptionManager subscriptionManager;
    private ThingsManager thingsManager;

    public Notifier(SubscriptionManager subscriptionManager, ThingsManager thingsManager){
        this.subscriptionManager = subscriptionManager;
        this.thingsManager = thingsManager;
    }

    public void notifySubscribedThings(String color){
        for(String subscription : subscriptionManager.getSubscriptions()){
            List<String> colors = thingsManager.getColors(subscription);
            if(colors != null){
                if(colors.contains(color)){
                    System.out.println("I'm " + subscription + "! I'm sometimes " + color.toLowerCase() + ".");
                } else {
                    System.out.println("I'm " + subscription + "! I'm " + color.toLowerCase() + " today.");
                }
            }
        }
    }
}
