// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Network facebook = new Facebook("user123", "pass123");
        Network reddit = new Reddit("user456", "pass456");
        Network linkedIn = new LinkedIn("user789", "pass789");

        System.out.println("Posting on Facebook:");
        facebook.post("Hello from Facebook!");

        System.out.println("\nPosting on Reddit:");
        reddit.post("Greetings from Reddit!");

        System.out.println("\nPosting on LinkedIn:");
        linkedIn.post("Networking on LinkedIn!");
    }

}