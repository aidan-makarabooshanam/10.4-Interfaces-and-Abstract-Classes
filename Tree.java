public class Tree extends Plant{
    public Tree(String plantType){
        super(plantType);
    }

    public void burn(){
        height = height/2;
    }

    public void grow(){
        height+=1;
        depth+=0.2;
    }      
}