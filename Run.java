abstract class Run {
    abstract void square(int n);
    abstract void cube(int n);
}
class Run1 extends Run{
    
    /**
     *
     */
    @Override
    void square(int n) {
    System.out.println(n*n);
    }
    
    /**
     *
     */
    @Override
    void cube(int n ) {
        System.out.println(n*n*n);
    
    }
}
