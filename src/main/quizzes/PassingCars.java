package main.quizzes;

public class PassingCars {
    public int solution(int[] A) {
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (result > 1_000_000_000) return -1;

                if (A[i] == 0 && A[j] == 1) result++;
            }
        }

        return result;
    }

    public int solution2(int[] A) {
        int startEast = 0;
        int eastIdx = 0;
        int westCnt = 0;
        int passingCnt = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                startEast = i;
                eastIdx = i;
                break;
            }
        }

        for (int j = startEast; j < A.length; j++) {
            if (A[j] == 1) westCnt++;
        }

        passingCnt = westCnt;

        for (int k = startEast + 1; k < A.length; k++) {
            if (A[k] == 0) {
                westCnt -= k - eastIdx - 1;
                eastIdx = k;
                passingCnt += westCnt;
            }
        }

        return passingCnt;
    }

    public int solution3(int[] A) {
        int sum = 0;
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                sum++;
            } else {
                result += sum;

                if (result > 1_000_000_000) return -1;
            }
        }

        return result;
    }
}
