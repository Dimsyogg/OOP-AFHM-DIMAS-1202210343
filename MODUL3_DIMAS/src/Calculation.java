public class Calculation implements Runnable {
    private double radius ;
    private double side ;
    private double area ;
    private double phi = 3.14;

    public double getRadius() {
        return radius;
    }
    public double getSide() {
        return side;
    }
    public double getArea() {
        return area;
    }
    public double getPhi() {
        return phi;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setArea(double area) {
        this.area = area;
    }
//persegi
    public void setSquare(double side) throws IllegalArgumentException {
        if (side < 1){
            throw new IllegalArgumentException("salah, sisi harus lebih besar dari 1");
        }
        this.area= side * side;
    }

    public double getSquare(){
        return this.area;
    }
//lingkaran
    public void setCircle(double radius) throws IllegalArgumentException {
        if (radius < 1) {
            throw new IllegalArgumentException("salah, jari-jari harus lebih besar daripada 1");
        }
        this.area = phi*radius*radius;
    }
    public double getCircle() {
        return this.area;
      }

    //trapesium
    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
        if (a < 1 || b < 1 || t < 1) {
        }
      }
    
      public double getTrapezoid() {
        return this.area;
      }

  
    @Override
    public void run() {
      System.out.println("Program will start in");
      for (int i = 3; i > 0; i--) {
        System.out.println(i);
        try {
          Thread.sleep(3000);
        } catch (InterruptedException e) {
          System.out.println("Error" + e);
        }
      }
    }
}

