README

Abi Lowe

P01-- The Dining Philosophers Monitor 

This program implements a monitor to solve the Dining Philosophers problem with no 
input, and a System.out output to show the functioning solution. 

There are three core components to this project, the server, the philosophers and the 
driver. I named my classes differently, as this made it easier for me to understand personally.
The classes I created were Moniter (spelled incorrectly, I know, but I was in too deep to change it),
Philosophers, and DiningMain. 

Class Moniter is the main class that ensures a philosopher only picks up chopsticks when neither 
neighbor is eating. This is done through creating different states-- 
Thinking, hungry, and eating. The state of the philosopher is then set to one of these. 
After this, the monitor is created for the right number of philosophers, and initially set 
to be thinking. A philosopher will then pick up both chopsticks and waits to see if 
either neighbor is eating. 
Boolean statements are made to set if a neighbor is currently eating, and is returned true
if either are. If neither are eating, boolean is returned false. Then at this point both 
chopsticks are put down. Waiting philosophers are notified so one of them can now eat. 

Class Philosophers does some background work on each philosopher as an individual. Each
one alternates from thinking to eating, and to go from this, philosopher needs to pick up 
left chopstick with neighbors, making it not possible to eat at the same time as neighbors.
With a random generator, a unique id is made for each philosopher. 

Class DiningMain is the main executable class that tests the program and solution to the
dining philosophers problem. Goes through steps to ensure philosopher picked up both 
chopsticks at same time and no errors occur. 