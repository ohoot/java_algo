package main.quizzes;

public class Triangle {
    public int solution(int[][] triangle) {
        int[][] matric = new int[triangle.length][triangle.length];

        matric[0][0] = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) {
                    matric[i][0] = matric[i - 1][0] + triangle[i][j];
                    continue;
                }

                if (j == i) {
                    matric[i][j] = matric[i - 1][j - 1] + triangle[i][j];
                    continue;
                }

                matric[i][j] = Math.max(matric[i - 1][j - 1], matric[i - 1][j]) + triangle[i][j];
            }
        }

        int answer = matric[matric.length - 1][0];

        for (int i = 1; i < matric.length; i++) {
            if (matric[matric.length - 1][i] > answer) answer = matric[matric.length - 1][i];
        }

        return answer;
    }
}
