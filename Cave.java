public class Cave implements Growth{
    private double size;
    private String name;
    private double depth;

    public Cave(String name, double caveDepth){
        this.size=10;
        this.name=name;
        this.depth=caveDepth;
    }
    @Override
    public void grow() {
        size+=size*1.5;
    }

    @Override
    public double getDepth() {
        return depth;
    }

    public double getSize() {
        return size;
    }
}