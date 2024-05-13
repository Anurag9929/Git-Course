class P{
    int p= 23;
    int p1=43;

}
class Q extends P{
    int q=0;
    int q1 =0;

    public void assignSuperValue(){
        this.q = super.p;
        this.q1 = super.p1;
        System.out.println(this.q+" "+this.q1);
        System.out.println(super.p+" "+super.p1);
    }
}
public class Super_SuperMethod {
    
    public static void main(String args[])
    {
        Q q= new Q();
        q.assignSuperValue();
    
    }
}
