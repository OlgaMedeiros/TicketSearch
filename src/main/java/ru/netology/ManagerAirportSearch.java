package ru.netology;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ManagerAirportSearch {
    private RepositoryTicketInformation repository;

    public ManagerAirportSearch(RepositoryTicketInformation repository) {
        this.repository = repository;
    }

    public void add(TicketInformation product) {
        repository.add(product);
    }

    public TicketInformation[] findAll(String departureAirport, String arrivalAirport) {
        TicketInformation[] result = new TicketInformation[0];
        for (TicketInformation ticketInformation : repository.findAll()) {
            if (matches(ticketInformation, departureAirport, arrivalAirport)) {
                TicketInformation[] tmp = new TicketInformation[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[result.length] = ticketInformation;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    public boolean matches(TicketInformation ticketInformation, String departureAirport, String arrivalAirport) {
        if (ticketInformation.getDepartureAirport().equals(departureAirport)) {
            if (ticketInformation.getArrivalAirport().equals(arrivalAirport)) {
                return true;
            }
        }
        return false;
    }
}