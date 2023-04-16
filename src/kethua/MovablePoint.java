package kethua;

public class MovablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySeed=0.0f;

    public MovablePoint(float xSpeed, float ySeed) {
        this.xSpeed = xSpeed;
        this.ySeed = ySeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySeed = ySeed;
    }

    public MovablePoint() {
    }

    public float xSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float ySeed() {
        return ySeed;
    }

    public void setySeed(float ySeed) {
        this.ySeed = ySeed;
    }
    public void setSpeed(float xSpeed,float ySeed){
        this.xSpeed=xSpeed;
        this.ySeed=ySeed;
    }
    public float[]getSeed(){
        float[]array={xSpeed,ySeed};
        return array;
    }

    @Override
    public String toString() {
        return super.toString()+" "+getSeed();
    }
    public MovablePoint move (){
        this.xSpeed=x()+this.xSpeed;
        this.ySeed=y()+this.ySeed;
        return this;
    }
}
