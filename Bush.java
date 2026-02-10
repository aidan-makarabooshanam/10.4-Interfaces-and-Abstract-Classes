public class Bush extends Plant{
    public Bush(String plantType){
        super(plantType);
    }

    @Override
    public void grow() {
        height+=0.5;
        depth+=0.2;
    }

    @Override
    public void burn() {
        height=height/5;
        depth=0;
    }
}