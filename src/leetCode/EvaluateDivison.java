package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvaluateDivison {

	public static void main(String[] args) {
		List<List<String>> equations = new ArrayList<>();
		List<String> e1 = new ArrayList<>();
		e1.add("a");
		e1.add("b");
		List<String> e2 = new ArrayList<>();
		e2.add("b");
		e2.add("c");
		equations.add(e1);
		equations.add(e2);
		double[] values = { 2.0, 3.0 };
		List<List<String>> queries = new ArrayList<>();
		List<String> q1 = new ArrayList<>();
		q1.add("a");
		q1.add("c");
		List<String> q2 = new ArrayList<>();
		q2.add("b");
		q2.add("a");
		List<String> q3 = new ArrayList<>();
		q3.add("a");
		q3.add("e");
		queries.add(q1);
		queries.add(q2);
		queries.add(q3);
		double[] result = calcEquation(equations, values, queries);
		System.out.println(result);
	}

	public static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
		double[] result = new double[queries.size()];
		Map<String, List<Node>> map = buildGraph(equations, values);
		for (int i = 0; i < queries.size(); i++) {
			result[i] = calcResult(queries.get(i).get(0), queries.get(i).get(1), new HashSet<>(), map);
		}
		return result;
	}

	private static double calcResult(String src, String des, Set<String> visited, Map<String, List<Node>> map) {
		if (!(map.containsKey(src) && map.containsKey(des))) {
			return -1.0;
		}
		if (src.equals(des)) {
			return 1.0;
		}
		visited.add(src);
		for (Node n : map.get(src)) {
			if (!visited.contains(n.key)) {
				double ans = calcResult(n.key, des, visited, map);
				if (ans != -1.0) {
					return ans * n.val;
				}
			}
		}
		return -1.0;
	}

	private static Map<String, List<Node>> buildGraph(List<List<String>> equations, double[] values) {

		Map<String, List<Node>> graph = new HashMap<>();
		for (int i = 0; i < equations.size(); i++) {
			String src = equations.get(i).get(0);
			String des = equations.get(i).get(1);
			graph.putIfAbsent(src, new ArrayList<>());
			graph.putIfAbsent(des, new ArrayList<>());
			graph.get(src).add(new Node(des, values[i]));
			graph.get(des).add(new Node(src, 1 / values[i]));
		}
		return graph;
	}
}

class Node {
	String key;
	double val;

	public Node(String key, double val) {
		this.key = key;
		this.val = val;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", val=" + val + "]";
	}

}
