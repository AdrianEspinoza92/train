package org.group;

public class Route {
    private final char source;
    private final char destination;
    private final int distance;

    public Route(char source, char destination, int distance) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    public char getSource() {
        return source;
    }

    public char getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }
}

