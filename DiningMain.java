package diningPhilosophers;

public class DiningMain {
	// The number of philosophers
		private static final int NUM_PHILOSOPHERS = 5;
		
		/**
		 * Test solution
		 */
		public static void main (String[] args) {
			Philosophers[] philosophers = new Philosophers[NUM_PHILOSOPHERS];
			
			// Monitor will ensure that a philosopher picks up both chopsticks at the
			// same time
			Moniter monitor = new Moniter();
			
			for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
				philosophers[i] = new Philosophers(i, monitor);
				new Thread(philosophers[i]).start();
			}
		}

	}
