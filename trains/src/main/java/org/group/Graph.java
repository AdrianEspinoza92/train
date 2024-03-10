package org.group;

import java.util.*;

public class Graph {
    private Map<Character, List<Route>> graph = new HashMap<>();

    public void addRoute(Route route) {
        graph.putIfAbsent(route.getSource(), new ArrayList<>());
        graph.get(route.getSource()).add(route);
    }

    public List<Route> getRoutesFromTown(char town) {
        return graph.getOrDefault(town, new ArrayList<>());
    }
}


