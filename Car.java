
public class Car {
	public static String WINDOW;
	public static String COLOR;
	public static int V;

	int a = 1;



	    public static int getV(){
	       return V;
	    }

	    public static void setV(int var){
	         V=var;
	    }
	    
	    public static int runInjecter(int var){
	        return V=V*var;
	    }

	    public static String getWindow(){
	       return WINDOW;
	    }

	    public static void setWindow(String var){
	         WINDOW=var;
	    }
	    
	    public static String getColor(){
	       return COLOR;
	    }

	    public static void setColor(String var){
	         COLOR=var;
	    }

	    public static void main(String[] args) throws InterruptedException {
	        
	        System.out.println("\n 1 Window="+getWindow());
	        System.out.println("\n 2 V="+getV());
	        System.out.println("\n 3 Color="+getColor());
	        
	       
	       
	       
	        Thread.currentThread().sleep(2000);
	       
	       
	        setWindow("COOL!!!"); //Window add Cool
	        System.out.println("\n 4 Window="+getWindow());
	        //--------------------------------------------------------------
	       
	       
	       
	        Thread.currentThread().sleep(2000);
	        setColor("GREEN");
	        System.out.println("\n 5 Color="+getColor());
	        
	        
	        
	        Thread.currentThread().sleep(2000);
	        setV(20);
	        System.out.println("\n 6 V="+getV());
	        
	        
	        
	        Thread.currentThread().sleep(2000);
	        runInjecter(100);
	        System.out.println("\n 7 V="+getV());
	    }
	}
