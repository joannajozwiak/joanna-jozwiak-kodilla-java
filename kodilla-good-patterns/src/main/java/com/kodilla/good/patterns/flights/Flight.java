package com.kodilla.good.patterns.flights;

public class Flight {
    private Airport from;
    private Airport to;
    private Airport through;

    public Flight(Airport from, Airport to) {
        this.from = from;
        this.to = to;
    }

    public Flight(Airport from, Airport to, Airport through) {
        this.from = from;
        this.to = to;
        this.through = through;
    }

    public Airport getFrom() {
        return from;
    }

    public Airport getTo() {
        return to;
    }

    public Airport getThrough() {
        return through;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (from != null ? !from.equals(flight.from) : flight.from != null) return false;
        if (to != null ? !to.equals(flight.to) : flight.to != null) return false;
        return through != null ? through.equals(flight.through) : flight.through == null;
    }

    @Override
    public int hashCode() {
        int result = from != null ? from.hashCode() : 0;
        result = 31 * result + (to != null ? to.hashCode() : 0);
        result = 31 * result + (through != null ? through.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from=" + from +
                ", to=" + to +
                (through != null ? ", through=" + through : "" )+
                '}';
    }
}
