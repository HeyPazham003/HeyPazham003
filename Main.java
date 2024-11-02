import java.util.concurrent.locks.ReentrantLock;

class VotingSystem {
    private int votes;
    private final ReentrantLock lock = new ReentrantLock();

    public void castVote() {
        lock.lock();
        try {
            // Simulate vote tampering check
            if (Math.random() < 0.1) { // 10% chance of tampering
                throw new SecurityException("Vote tampering detected!");
            }
            votes++;
            System.out.println("Vote cast successfully. Total votes: " + votes);
        } catch (SecurityException e) {
            System.err.println(e.getMessage());
        } finally {
            lock.unlock();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        
        Runnable voter = () -> {
            for (int i = 0; i < 10; i++) {
                votingSystem.castVote();
            }
        };

        Thread voter1 = new Thread(voter);
        Thread voter2 = new Thread(voter);
        
        voter1.start();
        voter2.start();
    }
}
import java.util.concurrent.locks.ReentrantLock;

class VotingSystem {
    private int votes;
    private final ReentrantLock lock = new ReentrantLock();

    public void castVote() {
        lock.lock();
        try {
            // Simulate vote tampering check
            if (Math.random() < 0.1) { // 10% chance of tampering
                throw new SecurityException("Vote tampering detected!");
            }
            votes++;
            System.out.println("Vote cast successfully. Total votes: " + votes);
        } catch (SecurityException e) {
            System.err.println(e.getMessage());
        } finally {
            lock.unlock();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        
        Runnable voter = () -> {
            for (int i = 0; i < 10; i++) {
                votingSystem.castVote();
            }
        };

        Thread voter1 = new Thread(voter);
        Thread voter2 = new Thread(voter);
        
        voter1.start();
        voter2.start();
    }
}
