//class MyArea {
//    void area() {
//        System.out.println("A concrete function called Area()");
//    }
//}
//
//class SQArea extends MyArea {
//    double s;
//
//    void area() {   // Same name function in base class
//        double areasq;
//        s = 10.0;
//        areasq = s * s;
//        System.out.println("Area of Square " + areasq);
//    }
//}
//
//class RECTArea extends MyArea {
//    double l, b;
//
//    void area() {   // Same name function in base class
//        double arearect;
//        l = 10.0;
//        b = 2.0;
//        arearect = l * b;
//        System.out.println("Area of Rectangle " + arearect);
//    }
//}
//
//class Eleven {
//    public static void main(String a[]) {
//
//        MyArea ma;   // Base class reference
//
//        ma = new SQArea();   // Referring to SQArea
//        ma.area();           // Calling SQArea method (Dynamic Polymorphism)
//
//        ma = new RECTArea(); // Referring to RECTArea
//        ma.area();           // Calling RECTArea method (Dynamic Polymorphism)
//    }
//}
//
