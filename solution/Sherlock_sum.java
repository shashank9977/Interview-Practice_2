package solution;

//https://www.hackerrank.com/challenges/sherlock-and-cost/forum

// the problem is that we need to calculate the maximum sum  of the difference between numbers. 

public class Sherlock_sum {

	public static void main(String[] args) {
				
		T = int(raw_input())

				for t in range(T):
				    N = int(raw_input())
				    A = [int(x) for x in raw_input().split()]
				    M = max(A)

				    low = 0
				    high = 0

				    for i, value in enumerate(A):
				        if i > 0:
				            l = max(abs(1-A[i-1])+high, low)
				            h = max(abs(A[i]-1)+low, abs(A[i]-A[i-1])+high)
				            low = l
				            high = h

				    print max(low, high)

	}

}
