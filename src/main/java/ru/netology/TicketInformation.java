package ru.netology;

public class TicketInformation implements Comparable<TicketInformation> {

    private int id;
    private int price;
    private String departureAirport;         //вылет
    private String arrivalAirport;           //прилет
    private int travelTime;                 //в минутах

    public TicketInformation(int id, int price, String departureAirport, String arrivalAirport, int travelTime) {
        this.id = id;
        this.price = price;
        this.departureAirport = departureAirport;   // вылет
        this.arrivalAirport = arrivalAirport;     //прилет
        this.travelTime = travelTime;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public int getTravelTime() {
        return travelTime;
    }


    @Override    // пересмотреть этот код

    public int compareTo(TicketInformation o) {
        if (this.price < o.price) {
            return -1;
        }
        if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
