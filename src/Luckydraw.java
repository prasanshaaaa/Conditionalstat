import java.util.Random;
public class Luckydraw {
    public static void main(String[] args) {
        String[] participants = {"Ram", "Sita", "Gita", "Hari", "Ritu", "Shyam",};
        Random random = new Random();
        int winnerIndex = random.nextInt(participants.length);
        System.out.println("Lucky Draw Winner: " + participants[winnerIndex]);
    }
}

