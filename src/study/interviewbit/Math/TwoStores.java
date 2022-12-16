package study.interviewbit.Math;

public class TwoStores {

	public static void main(String[] args) {
		System.out.println(solve(7, 1, 1, 3, 2));
	}

	public static int solve(int A, int B, int C, int D, int E) {
		if (A < B && A < D) {
			return -1;
		}
		double BCandyPrice = (float) C / B;
		double DCandyPrice = (float) E / D;

		int cheaperStore = BCandyPrice < DCandyPrice ? B : D;
		int cheapPrice = cheaperStore == B ? C : E;
		int expStore = BCandyPrice > DCandyPrice ? B : D;

		int exPrice = expStore == D ? E : C;

		int remaining = A % cheaperStore;
		if (remaining == 0) {
			return (A / cheaperStore) * C;
		}
		if (remaining > expStore) {

			if (remaining % expStore == 0) {
				return (((A / cheaperStore) - 1) * cheapPrice) + ((remaining / expStore) * exPrice);
			}

			else {
				remaining += cheaperStore;
				if (remaining % expStore != 0) {
					return -1;
				} else {
					return (((A / cheaperStore) - 1) * cheapPrice) + ((remaining / expStore) * exPrice);
				}
			}
		} else if (remaining == expStore) {
			return (A-remaining)/cheaperStore * cheapPrice+((remaining / expStore) * exPrice);
		} else {
			remaining += cheaperStore;
			if (remaining % expStore != 0) {
				return -1;
			} else {
				return (((A / cheaperStore) - 1) * cheapPrice) + ((remaining / expStore) * exPrice);
			}
		}
	}
	
	// logic is straightforward

	// buy as much as you can, from cheap store(low price per candy)

	// or in other words, buy as low as you can, from costly store(high price per candy)


//	int Solution::solve(int candies, int c1, int p1, int c2, int p2) {
//
//	    double ppc1 = p1/(c1*1.0);// price per candy
//
//	    double ppc2 = p2/(c2*1.0);// price per candy
//
//	    if(ppc1 < ppc2){
//
//	        swap(c1, c2);
//
//	        swap(p1, p2);
//
//	    }
//
//	    // means {p1, c1} is costly store and {p2, c2} is cheap
//
//	    int cost = 0;
//
//	    do{
//
//	        if(candies % c2 == 0){ // check if all can be bought from cheap store
//
//	            break;
//
//	        }else{
//
//	            cost+=p1;   // otherwise take minimum possible only 1 packet from costly store and again check
//
//	            candies-=c1;
//
//	        }
//
//	    }while(candies > 0 && candies % c2 != 0);// till remaining cannot be bought from cheap store
//
//	    
//
//	    if(candies < 0) return -1;
//
//	    cost += (candies/c2)*p2;
//
//	    
//
//	    return cost;
//
//	}

}
