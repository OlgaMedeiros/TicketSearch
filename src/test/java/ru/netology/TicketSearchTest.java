package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketSearchTest {
    @Test
    public void MskSaratovFromLowToHigh() {


        RepositoryTicketInformation repository = new RepositoryTicketInformation();
        ManagerAirportSearch manager = new ManagerAirportSearch(repository);

        TicketInformation ticketInformation1 = new TicketInformation(1, 4500, "MSK", "Saratov", 75);
        TicketInformation ticketInformation2 = new TicketInformation(2, 5000, "Saratov", "MSK", 70);
        TicketInformation ticketInformation3 = new TicketInformation(3, 2000, "MSK", "Sochi", 120);
        TicketInformation ticketInformation4 = new TicketInformation(4, 3600, "MSK", "Saratov", 71);
        TicketInformation ticketInformation5 = new TicketInformation(5, 18000, "MSK", "Saratov", 75);
        TicketInformation ticketInformation6 = new TicketInformation(6, 10000, "Sochi", "MSK", 135);

        manager.add(ticketInformation1);
        manager.add(ticketInformation2);
        manager.add(ticketInformation3);
        manager.add(ticketInformation4);
        manager.add(ticketInformation5);
        manager.add(ticketInformation6);

        TicketInformation[] expected = {ticketInformation4, ticketInformation1, ticketInformation5};
        TicketInformation[] actual = manager.findAll("MSK", "Saratov");


        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void NoTickets() {
        RepositoryTicketInformation repository = new RepositoryTicketInformation();
        ManagerAirportSearch manager = new ManagerAirportSearch(repository);

        TicketInformation ticketInformation1 = new TicketInformation(1, 4500, "MSK", "Saratov", 75);
        TicketInformation ticketInformation2 = new TicketInformation(2, 5000, "Saratov", "MSK", 70);
        TicketInformation ticketInformation3 = new TicketInformation(3, 2000, "MSK", "Sochi", 120);
        TicketInformation ticketInformation4 = new TicketInformation(4, 3600, "MSK", "Saratov", 71);
        TicketInformation ticketInformation5 = new TicketInformation(5, 18000, "MSK", "Saratov", 75);
        TicketInformation ticketInformation6 = new TicketInformation(6, 10000, "Sochi", "MSK", 135);

        manager.add(ticketInformation1);
        manager.add(ticketInformation2);
        manager.add(ticketInformation3);
        manager.add(ticketInformation4);
        manager.add(ticketInformation5);
        manager.add(ticketInformation6);

        TicketInformation[] expected = {};
        TicketInformation[] actual = manager.findAll("Saratov", "Sochi");

        Assertions.assertArrayEquals(expected, actual);


    }

    ;

    @Test
    public void OneTicket() {
        RepositoryTicketInformation repository = new RepositoryTicketInformation();
        ManagerAirportSearch manager = new ManagerAirportSearch(repository);

        TicketInformation ticketInformation1 = new TicketInformation(1, 4500, "MSK", "Saratov", 75);
        TicketInformation ticketInformation2 = new TicketInformation(2, 5000, "Saratov", "MSK", 70);
        TicketInformation ticketInformation3 = new TicketInformation(3, 2000, "MSK", "Sochi", 120);
        TicketInformation ticketInformation4 = new TicketInformation(4, 3600, "MSK", "Saratov", 71);
        TicketInformation ticketInformation5 = new TicketInformation(5, 18000, "MSK", "Saratov", 75);
        TicketInformation ticketInformation6 = new TicketInformation(6, 10000, "Sochi", "MSK", 135);

        manager.add(ticketInformation1);
        manager.add(ticketInformation2);
        manager.add(ticketInformation3);
        manager.add(ticketInformation4);
        manager.add(ticketInformation5);
        manager.add(ticketInformation6);

        TicketInformation[] expected = {ticketInformation6};
        TicketInformation[] actual = manager.findAll("Sochi", "MSK");

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void AllTickets() {
        RepositoryTicketInformation repository = new RepositoryTicketInformation();
        ManagerAirportSearch manager = new ManagerAirportSearch(repository);

        TicketInformation ticketInformation1 = new TicketInformation(1, 4500, "MSK", "Saratov", 75);
        TicketInformation ticketInformation2 = new TicketInformation(2, 5000, "Saratov", "MSK", 70);
        TicketInformation ticketInformation3 = new TicketInformation(3, 2000, "MSK", "Sochi", 120);
        TicketInformation ticketInformation4 = new TicketInformation(4, 3600, "MSK", "Saratov", 71);
        TicketInformation ticketInformation5 = new TicketInformation(5, 18000, "MSK", "Saratov", 75);
        TicketInformation ticketInformation6 = new TicketInformation(6, 10000, "Sochi", "MSK", 135);

        manager.add(ticketInformation1);
        manager.add(ticketInformation2);
        manager.add(ticketInformation3);
        manager.add(ticketInformation4);
        manager.add(ticketInformation5);
        manager.add(ticketInformation6);

        TicketInformation[] expected = {ticketInformation1, ticketInformation2, ticketInformation3, ticketInformation4, ticketInformation5, ticketInformation6};
        TicketInformation[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}







