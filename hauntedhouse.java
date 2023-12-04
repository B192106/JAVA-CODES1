public class hauntedhouse {
    enum GlanceStatus {
        Notseen,
        Seen
    }

    static class Girl {
        String name;
        GlanceStatus glance;

        public Girl(String name) {
            this.name = name;
            this.glance = GlanceStatus.Notseen;
        }

        public void scream() {
            glance = GlanceStatus.Seen;
        }

        public void calmDown() {
            glance = GlanceStatus.Notseen;
        }

        public void showReaction() {
            System.out.println(name + ": " + glance);
        }
    }
 public static void main(String[] args) {

        Girl girl1 = new Girl("Girl 1");
        Girl girl2 = new Girl("Girl 2");
        Girl girl3 = new Girl("Girl 3");
        Girl girl4 = new Girl("Girl 4");
        Girl girl5 = new Girl("Girl 5");

    
        girl1.scream();
        girl2.scream();
        girl3.calmDown();
        girl4.calmDown();
        girl5.calmDown();

        
        girl1.showReaction();
        girl2.showReaction();
        girl3.showReaction();
        girl4.showReaction();
        girl5.showReaction();
    }
}