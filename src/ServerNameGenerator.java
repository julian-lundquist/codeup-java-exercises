import java.lang.reflect.Array;

public class ServerNameGenerator {

    public static void randomGen (String[] object) {
        int random = (int) (Math.random() * (object.length));
        String param = object[random];
        System.out.printf("%s ", param);
    }

    public static void main(String[] args) {
        String[] adjectives = {"amazing", "big", "bold", "boring", "small", "stunning", "super", "long", "fancy", "plain"};
        String[] nouns = {"cat", "dog", "house", "car", "pencil", "phone", "photo", "bike", "boat", "rope"};

//        for (int i = 0; i < adjectives.length; i += 1) {
//            int random = (int) (Math.random() * (adjectives.length));
//            String adj = adjectives[random];
//            String noun = nouns[random];
//            System.out.printf("The %s %s%n", adj, noun);
//        }

        randomGen(adjectives);
        randomGen(nouns);
    }
}
