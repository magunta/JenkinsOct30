package FirstjenkinsJob.SampleAppJenkins;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        	 for(int i=1;i<=10;i++) {
        	        	for(int j=1;j<=i;j++) {
        	        	
        	        	System.out.print(j);
        	        	}
        	        	System.out.println();
        	        } 
        	 
        	 for(int i=1;i<10;i++) {
             	for (int n=1;n<10-i;n++) {
             		System.out.print(" ");
             	}
             		
             	for(int j=1;j<=i;j++) {
             	
             	System.out.print(j);
             	}
             	System.out.println();
             } 
        	 

    }
}
