public class NakedCats {
    /*
    The main takeaway is that constructors with no arguments
    (default constructors) are added automatically by the compiler,
    and in those constructors the calls to default constructors of
    the super class (super()) are automatically added by the
    compiler. Any class that does not extend any other class
    implicitly extends the Object class. So that also need not be
    shown explicitly. Also if the super class implements an
    interface, the sub class need not implement the same interface.
    All the interface methods implemented in super class are
    automatically inherited in the sub class. The sub
    class is free to use them as it is or override them if required.
     */
    public static void main(String[] args) {
        SiamCat coco = new SiamCat("Coco");
        NakedCat nakedCoco = coco.shave();
    }

    public static class NakedCat {
      /*  public NakedCat() {
            super();
        }*/
    }

    public static class NormalCat extends NakedCat {
        public NormalCat() {
            // super();
        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}
