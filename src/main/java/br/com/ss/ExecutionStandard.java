package br.com.ss;

import java.time.Duration;

public class ExecutionStandard {

    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            new Process().executar(i).run();
        }

        System.out.println(Duration.ofMillis(System.currentTimeMillis() - timeStart).toSeconds() + " seconds");
    }
}
