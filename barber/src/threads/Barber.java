package threads;

public class Barber implements Runnable {

    private final WaitingRoom waitingRoom;

    public Barber(WaitingRoom waitingRoom) {
        this.waitingRoom = waitingRoom;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Customer customer = waitingRoom.nextCustomer();

                System.out.println("O Barbeiro chamou e atendeu o cliente" + customer);
                customer.callAndShave();
            }

        } catch (InterruptedException e) {
            System.out.println("O barbeiro finalizou o corte");
        }
    }
}
