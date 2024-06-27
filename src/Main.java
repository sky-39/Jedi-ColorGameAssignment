import game.notifier.Notifier;
import game.subscriptions.SubscriptionManager;
import game.things.ThingsManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        SubscriptionManager subscriptionManager = new SubscriptionManager();
        ThingsManager thingsManager = new ThingsManager();
        Notifier notifier = new Notifier(subscriptionManager, thingsManager);

        System.out.println("Color game started! Enter a command : ");

        while(true){
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Colour Game.");
                break;
            } else if (input.equalsIgnoreCase("list")) {
                subscriptionManager.listSubscriptions();
            } else if (input.startsWith("+")) {
                subscriptionManager.subscribe(input.substring(1).trim(), thingsManager);
            } else if (input.startsWith("-")) {
                subscriptionManager.unsubscribe(input.substring(1).trim());
            } else {
                notifier.notifySubscribedThings(input);
            }
        }
    }
}