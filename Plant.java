public abstract class Plant implements Growth{
    protected String plantType;
    protected double height;
    protected double depth;

    public Plant(String plantType){
        this.plantType=plantType;
        this.height=0;
        this.depth=0;
    }

    public double getDepth(){
        return depth;
    }

    public double getSize(){
        return height;
    }

    public abstract void burn();
}