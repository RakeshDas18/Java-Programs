class UserThread extends Thread {
    private String message;

    public UserThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}

// Main class
public class MultiThread {
    public static void main(String[] args) {
        UserThread user1 = new UserThread("User1: Hello, I am User1!");
        UserThread user2 = new UserThread("User2: Hi, this is User2!");
        UserThread user3 = new UserThread("User3: Hey there, User3 here!");

        user1.start();
        user2.start();
        user3.start();
    }
}
