package org.group;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrainSystemTest {

    private TrainProblemSolver solver;

    @Before
    public void setUp() {
        Graph graph = buildGraph();
        solver = new TrainProblemSolver(graph);
    }

    @Test
    public void testGetDistance() {
        assertEquals(9, solver.getDistance("ABC"));
        assertEquals(5, solver.getDistance("AD"));
        assertEquals(13, solver.getDistance("ADC"));
        assertEquals(22, solver.getDistance("AEBCD"));
        assertEquals(-1, solver.getDistance("AED"));
    }

    @Test
    public void testFindRoutesWithMaxStops() {
        assertEquals(1, solver.findRoutesWithMaxStops('C', 'C', 3));
    }

    @Test
    public void testFindRoutesWithExactStops() {
        assertEquals(3, solver.findRoutesWithExactStops('A', 'C', 4));
    }

    @Test
    public void testShortestRoute() {
        assertEquals(9, solver.shortestRoute('A', 'C'));
        assertEquals(0, solver.shortestRoute('B', 'B'));
    }

    @Test
    public void testFindRoutesWithinDistance() {
        assertEquals(7, solver.findRoutesWithinDistance('C', 'C', 30));
    }

    private Graph buildGraph() {
        Graph graph = new Graph();
        String[] input_data = {"AB5", "BC4", "CD8", "DC8", "DE6", "AD5", "CE2", "EB3", "AE7"};
        for (String edge : input_data) {
            char src = edge.charAt(0);
            char dest = edge.charAt(1);
            int weight = Integer.parseInt(edge.substring(2));
            Route route = new Route(src,dest,weight);
            graph.addRoute(route);
        }
        return graph;
    }
}
