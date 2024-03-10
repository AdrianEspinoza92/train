package org.group;

public class TrainSystem {
        public static void main(String[] args) {
            Graph graph = buildGraph();
            TrainProblemSolver solver = new TrainProblemSolver(graph);
            String out1 = solver.getDistance("ABC") > 0 ? String.valueOf(solver.getDistance("ABC")):"NO SUCH ROUTE";
            System.out.println("Output #1: " + out1);
            String out2 = solver.getDistance("AD") > 0 ? String.valueOf(solver.getDistance("AD")):"NO SUCH ROUTE";
            System.out.println("Output #2: " + out2);
            String out3 = solver.getDistance("ADC") > 0 ? String.valueOf(solver.getDistance("ADC")):"NO SUCH ROUTE";
            System.out.println("Output #3: " + out3);
            String out4 = solver.getDistance("AEBCD") > 0 ? String.valueOf(solver.getDistance("AEBCD")):"NO SUCH ROUTE";
            System.out.println("Output #4: " + out4);
            String out5 = solver.getDistance("AED") > 0 ? String.valueOf(solver.getDistance("AED")):"NO SUCH ROUTE";
            System.out.println("Output #5: " + out5);
            System.out.println("Output #6: " + solver.findRoutesWithMaxStops('C', 'C', 3));
            System.out.println("Output #7: " + solver.findRoutesWithExactStops('A', 'C', 4));
            System.out.println("Output #8: " + solver.shortestRoute('A', 'C'));
            System.out.println("Output #9: " + solver.shortestRoute('B', 'B'));
            System.out.println("Output #10: " + solver.findRoutesWithinDistance('C', 'C', 30));
        }

        private static Graph buildGraph() {
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

