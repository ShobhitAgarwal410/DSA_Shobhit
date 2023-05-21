package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumNumberVerticesReachAllNodes {

	public static void main(String[] args) {
		List<Integer> e1 = new ArrayList<>();
		e1.add(0);
		e1.add(2);
		List<Integer> e2 = new ArrayList<>();
		e2.add(2);
		e2.add(5);
		List<Integer> e3 = new ArrayList<>();
		e3.add(3);
		e3.add(4);
		List<Integer> e4 = new ArrayList<>();
		e4.add(4);
		e4.add(2);
		List<Integer> e6 = new ArrayList<>();
		e6.add(0);
		e6.add(1);
		List<List<Integer>> edges = new ArrayList<>();
		edges.add(e6);
		edges.add(e1);
		edges.add(e2);
		edges.add(e3);
		edges.add(e4);

		List<Integer> result = findSmallestSetOfVertices(6, edges);
		System.out.println(result);
	}

	public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
		int arr[] = new int[n];
		for (int i = 0; i < edges.size(); i++) {
			int endVertex = edges.get(i).get(1);
			arr[endVertex] = 1;
		}
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				result.add(i);
			}
		}
		return result;
	}
}

//List<Integer> connectedVerticesList = map.get(startingVertex);
//for(int k: connectedVerticesList) {
//	if()
//	Map<Integer, List<Integer>> map = new HashMap<>();
//	for(int i =0; i<edges.size();i++) {
//		int startingVertex = edges.get(i).get(0);
//		if(map.containsKey(startingVertex)) {
//			map.get(startingVertex).add(edges.get(i).get(1));
//				
//			}
//		}
//	}
