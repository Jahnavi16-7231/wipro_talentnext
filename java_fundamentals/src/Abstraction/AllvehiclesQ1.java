package Abstraction;


    class vehicle{
    	public int speed() {
    		return 60;
    	}
    }
    class Logan extends vehicle {
        public int gps() {
            return 1; 
        }
    }

    class Ford extends vehicle {
        public int tempControl() {
            return 22; 
        }
    }

    public class AllvehiclesQ1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Logan logan = new Logan();
		System.out.println("Logan Speed: " + logan.speed());
        System.out.println("Logan GPS: " + logan.gps());

        Ford ford = new Ford();
        System.out.println("Ford Speed: " + ford.speed());
        System.out.println("Ford Temperature Control: " + ford.tempControl());

	}
    }


