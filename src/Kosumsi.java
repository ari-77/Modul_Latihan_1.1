public class Kosumsi<M,I> {
    private M m;
    private I i;

    public M getM(){
        return m;
    }

    public I getI(){
        return i;
    }

    public void setKosumsi (M makanan, I minuman){
        this.m = makanan;
        this.i = minuman;
    }
}
