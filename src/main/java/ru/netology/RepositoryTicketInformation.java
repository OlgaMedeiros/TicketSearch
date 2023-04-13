package ru.netology;

public class RepositoryTicketInformation {

    private TicketInformation[] tickets = new TicketInformation[0];

    public TicketInformation[] findAll() {              //найти билеты
        return tickets;
    }

    public void add(TicketInformation ticketInformation) {                      //добавить  билет
        TicketInformation[] tmp = new TicketInformation[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];

        }
        tmp[tmp.length - 1] = ticketInformation;
        tickets = tmp;
    }

    public void removeTicket(int id) {                  // удалить билет

        TicketInformation[] tmp = new TicketInformation[tickets.length - 1];
        int index = 0;
        for (TicketInformation item : tickets) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;

            }
        }
        tickets = tmp;

    }

}

