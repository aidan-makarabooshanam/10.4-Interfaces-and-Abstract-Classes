public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Classes");
        
        Tree tree = new Tree("Oak");
        Bush bush = new Bush("Rose");
        Cave cave = new Cave("Mysterious Cave", 50);

        for (int i = 0; i < 5; i++) {
            tree.grow();
            bush.grow();
            cave.grow();
        }

        System.out.println("Tree height: " + tree.getSize() + " meters");
        System.out.println("Tree depth: " + tree.getDepth() + " meters");
        System.out.println("Bush height: " + bush.getSize() + " meters");
        System.out.println("Bush depth: " + bush.getDepth() + " meters");

        tree.burn();
        bush.burn();

        System.out.println("\nAfter burning:");
        System.out.println("Tree height: " + tree.getSize() + " meters");
        System.out.println("Tree depth: " + tree.getDepth() + " meters");
        System.out.println("Bush height: " + bush.getSize() + " meters");
        System.out.println("Bush depth: " + bush.getDepth() + " meters");

        System.out.println("\nCave size: " + cave.getSize() + " cubic meters");
        System.out.println("Cave depth: " + cave.getDepth() + " meters");
    }
}