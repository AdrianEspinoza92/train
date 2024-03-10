package org.group;

import java.util.*;

public class TrainProblemSolver {
    private Graph graph;

    public TrainProblemSolver(Graph graph) {
        this.graph = graph;
    }

    public int getDistance(String route) {
        char[] towns = route.toCharArray();
        int distance = 0;
        for (int i = 0; i < towns.length - 1; i++) {
            char src = towns[i];
            char dest = towns[i + 1];
            List<Route> routes = graph.getRoutesFromTown(src);
            boolean found = false;
            for (Route r : routes) {
                if (r.getDestination() == dest) {
                    distance += r.getDistance();
                    found = true;
                    break;
                }
            }
            if (!found) return -1; // Si no se encontró la ruta, devolvemos -1
        }
        return distance;
    }

    public int findRoutesWithMaxStops(char start, char end, int maxStops) {
        return dfsCount(start, end, maxStops, 0);
    }
    public int findRoutesWithExactStops(char start, char end, int exactStops) {
        return dfsCountExactStops(start, end, exactStops, 0);
    }

    public int dfsCountExactStops(char current, char end, int exactStops, int stops) {
        if (stops == exactStops && current == end) return 1;
        if (stops >= exactStops) return 0; // Cambio aquí de ">" a ">="
        List<Route> routes = graph.getRoutesFromTown(current);
        int count = 0;
        for (Route r : routes) {
            count += dfsCountExactStops(r.getDestination(), end, exactStops, stops + 1);
        }
        return count;
    }

    public int dfsCount(char current, char end, int stopsLimit, int stops) {
        if (stops >= stopsLimit) return current == end ? 1 : 0;
        List<Route> routes = graph.getRoutesFromTown(current);
        int count = 0;
        for (Route r : routes) {
            count += dfsCount(r.getDestination(), end, stopsLimit, stops + 1);
        }
        return count;
    }

    public int shortestRoute(char start, char end) {
        return dfsShortest(start, end, 0, new HashMap<>());
    }

    public int dfsShortest(char current, char end, int distanceSoFar, Map<Character, Integer> visited) {
        if (visited.containsKey(current)) {
            return Integer.MAX_VALUE; // Evitar ciclos
        }
        if (current == end) {
            return distanceSoFar;
        }
        visited.put(current, distanceSoFar);
        List<Route> routes = graph.getRoutesFromTown(current);
        int shortestDistance = Integer.MAX_VALUE;
        for (Route r : routes) {
            int nextDistance = dfsShortest(r.getDestination(), end, distanceSoFar + r.getDistance(), visited);
            shortestDistance = Math.min(shortestDistance, nextDistance);
        }
        visited.remove(current); // Limpiar registro de nodos visitados
        return shortestDistance;
    }

    public int findRoutesWithinDistance(char start, char end, int maxDistance) {
        return dfsDistanceCount(start, end, 0, maxDistance, 0);
    }

    public int dfsDistanceCount(char current, char end, int distanceSoFar, int maxDistance, int count) {
        if (distanceSoFar >= maxDistance) return count;
        if (current == end && distanceSoFar > 0) count++;
        List<Route> routes = graph.getRoutesFromTown(current);
        for (Route r : routes) {
            count = dfsDistanceCount(r.getDestination(), end, distanceSoFar + r.getDistance(), maxDistance, count);
        }
        return count;
    }


}

