class Vehicle {
    public void start() {
        System.out.println("Vehicle.start()");
    }
/*
📌 Rules of Covariant Return Type
    Allowed only in method overriding
    Return type must be a subclass
    Works only with non-primitive (reference) types
    Available since Java 5
    Access modifier must be same or wider
*/
  /*
    🆚 Covariant vs Non-covariant
    Parent Return	       Child Return	    Valid
    Object	              String        	✔
    Vehicle               TwoWheeler	    ✔
    Number	              Integer	        ✔
    int	                  long   	        ❌
    Vehicle	              Object	        ❌
*/
    // Covariant-return candidate: returns Vehicle in parent
    public Vehicle getVehicle() {
        System.out.println("Vehicle.getVehicle()");
        return this;
    }
    
    // Visibility: public in parent (child must remain public)
    public void visible() {
        System.out.println("Vehicle.visible()");
    }
    
    // Checked exception: parent declares a broad checked exception
    public void checked() throws Exception {
        System.out.println("Vehicle.checked() throws Exception");
    }
    
    // Static method - will be hidden, not overridden
    public static void staticMethod() {
        System.out.println("Vehicle.staticMethod()");
    }
    
    // Private method - not visible to subclasses (cannot be overridden)
    private void privateMethod() {
        System.out.println("Vehicle.privateMethod()");
    }
    
    // Helper to call privateMethod within same class (demonstrates it's accessible here)
    public void callPrivate() {
        privateMethod();
    }
    public void stop() {
        System.out.println("Vehicle stop logic");
    }
}

class TwoWheeler extends Vehicle {
    
    
    // This overrides Vehicle.start() (same signature)
    @Override
    public void start() {
        System.out.println("TwoWheeler.start() -- overridden");
    }
    
    // This is an overload: same name, different parameter list
    public float start(int a) {
        System.out.println("TwoWheeler.start(int) -- overloaded with " + a);
        return a;
    }
    
    // Covariant return: parent returned Vehicle, child returns TwoWheeler (valid)
    @Override
    public TwoWheeler getVehicle() {
        System.out.println("TwoWheeler.getVehicle() -- covariant return");
        return this;
    }
    
    // Must keep same or wider visibility (public here). Making this protected would be a compile error.
    @Override
    public void visible() {
        System.out.println("TwoWheeler.visible() (same visibility)");
    }
    
    // Checked exception: allowed to throw a narrower checked exception (IOException is a subclass of Exception)
    @Override
    public void checked() throws java.io.IOException {
        System.out.println("TwoWheeler.checked() throws IOException (narrower)");
    }
    
    // Static method with same signature -- this hides Vehicle.staticMethod()
    public static void staticMethod() {
        System.out.println("TwoWheeler.staticMethod() -- hides Vehicle.staticMethod()");
    }
    
    // This is a new private method, not an override of Vehicle.privateMethod()
    private void privateMethod() {
        System.out.println("TwoWheeler.privateMethod() -- distinct, not overriding");
    }
    
    // Expose call to privateMethod from this class (still private, but callable here)
    public void callOwnPrivate() {
        privateMethod();
    }
    @Override
    public void stop() {
        System.out.println("Two Wheeler stop logic");
    }
}

public class ParentChild {
    public static void main(String[] args) {

        String str = "java|in|simple|way";
        String[] tokens = str.split("\\|");//splits the string based on pipe symbol
        //loop the returned array to print each element of string array
        for (String token : tokens) {
            System.out.println(token);
        }

        StringBuffer sb = new StringBuffer("java in easy way");
        sb.replace(8, 12, "simple");
        System.out.println(sb);


        Vehicle twoWheeler = new TwoWheeler();
        System.out.println(1 + 4 + 6 + 99 + "manidh" + "dgffdg" + 88 + 88);
        twoWheeler.start();
//        A variable typed as Vehicle cannot call start(int) unless cast to TwoWheeler.
//        twoWheeler.start(5);  gives error
        // v.start(5); // DOES NOT COMPILE: reference type Vehicle has no start(int)
        
        // To call the overloaded method you must use a TwoWheeler reference (or cast)
        TwoWheeler twh = (TwoWheeler) twoWheeler;
        twh.start(5); // calls overloaded start(int) in TwoWheeler
        
        twoWheeler.stop();
        
        /*
         Comparison table between Overloading and Overriding
        Feature 	             Overloading     	    Overriding
        Same method name	        ✔	                    ✔
        Same parameters 	        ❌	                    ✔
        Different parameters        ✔                   	❌
        Return type change	        ✔ (if params differ)    ❌ (must be same/covariant)
        Happens in inheritance  	Optional        	    Mandatory
        Binding time    	        Compile time        	Runtime
        Polymorphism    	        ❌                     	✔
        */
        
        Vehicle v = new TwoWheeler();
        
        // Overriding: runtime dispatch -> TwoWheeler.start()
        v.start(); // prints TwoWheeler.start() -- overridden
        
        // Overloading: reference type Vehicle has no start(int) -> must cast
        // v.start(5); // DOES NOT COMPILE
        TwoWheeler tw = (TwoWheeler) v;
        tw.start(5); // calls overloaded start(int)
        
        // Covariant return: cast to TwoWheeler to get covariant return type at compile time
        Vehicle v2 = v.getVehicle(); // compile-time type Vehicle, runtime TwoWheeler
        TwoWheeler t2 = ((TwoWheeler) v).getVehicle(); // compile-time TwoWheeler (no cast on return)
        System.out.println("getVehicle() returned: " + v2.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName());
        
        // Checked exceptions: declared to throw Exception in Vehicle;
        // TwoWheeler overrides and throws IOException (narrower) — calling code must handle Exception
        try {
            v.checked(); // actually executes TwoWheeler.checked()
        } catch (Exception e) {
            System.out.println("caught: " + e.getClass().getSimpleName());
        }
        
        // Static method hiding: resolved by reference/type used for call
        v.staticMethod();                  // calls Vehicle.staticMethod() because v's compile-time type is Vehicle
        tw.staticMethod();                 // calls TwoWheeler.staticMethod()
        Vehicle.staticMethod();            // calls Vehicle.staticMethod()
        TwoWheeler.staticMethod();         // calls TwoWheeler.staticMethod()
        
        // Private methods: not visible to caller; cannot override
        // v.privateMethod(); // DOES NOT COMPILE
        // tw.privateMethod(); // DOES NOT COMPILE
        // But each class can call its own private method internally:
        v.callPrivate();  // calls Vehicle.privateMethod() via helper
        tw.callOwnPrivate(); // calls TwoWheeler.privateMethod() via helper
    }
} 