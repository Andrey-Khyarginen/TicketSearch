import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {
    @Test
    public void testSortTickets() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 200, 93);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 100, 98);
        Ticket ticket3 = new Ticket(3, "MSK", "UFA", 200, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "SPB", 400, 122);
        Ticket ticket5 = new Ticket(5, "UFA", "SPB", 800, 222);
        Ticket ticket6 = new Ticket(6, "MSK", "SPB", 200, 130);
        Ticket ticket7 = new Ticket(7, "NEW", "LA", 300, 253);
        Ticket ticket8 = new Ticket(8, "MSK", "SPB", 500, 99);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected = {ticket2, ticket1, ticket6, ticket4, ticket8};
        Ticket[] actual = manager.findAll("MSK", "SPB");
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSortTickets2() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 100, 93);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 200, 98);
        Ticket ticket3 = new Ticket(3, "MSK", "UFA", 300, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "SPB", 400, 122);
        Ticket ticket5 = new Ticket(5, "UFA", "SPB", 500, 222);
        Ticket ticket6 = new Ticket(6, "MSK", "SPB", 600, 130);
        Ticket ticket7 = new Ticket(7, "NEW", "LA", 700, 253);
        Ticket ticket8 = new Ticket(8, "MSK", "SPB", 800, 99);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected = {ticket1, ticket2, ticket4, ticket6, ticket8};
        Ticket[] actual = manager.findAll("MSK", "SPB");
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSortTickets3() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 100, 93);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 200, 98);
        Ticket ticket3 = new Ticket(3, "MSK", "UFA", 300, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "SPB", 400, 122);
        Ticket ticket5 = new Ticket(5, "UFA", "SPB", 500, 222);
        Ticket ticket6 = new Ticket(6, "MSK", "SPB", 600, 130);
        Ticket ticket7 = new Ticket(7, "NEW", "LA", 700, 253);
        Ticket ticket8 = new Ticket(8, "MSK", "SPB", 800, 99);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected = {ticket7};
        Ticket[] actual = manager.findAll("NEW", "LA");
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSortTickets4() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 100, 93);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 200, 98);
        Ticket ticket3 = new Ticket(3, "MSK", "UFA", 300, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "SPB", 400, 122);
        Ticket ticket5 = new Ticket(5, "UFA", "SPB", 500, 222);
        Ticket ticket6 = new Ticket(6, "MSK", "SPB", 600, 130);
        Ticket ticket7 = new Ticket(7, "NEW", "LA", 700, 253);
        Ticket ticket8 = new Ticket(8, "MSK", "SPB", 800, 99);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("UFA", "LA");
        Assertions.assertArrayEquals(expected, actual);
    }
}