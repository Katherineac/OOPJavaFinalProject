
public class Stopwatch {

		public long start;
	    public long StopwatchStart() {
	        return start = System.currentTimeMillis();
	    } 


	    public double elapsedTime() {
	        long now = System.currentTimeMillis();
	        return (now - start) / 1000.0;
	    }
}
