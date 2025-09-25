package br.com.ss;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecucaoThreadPool {

    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();

        try (ExecutorService executorService = Executors.newFixedThreadPool(10000)) {

            for (int i = 0; i < 50000; i++) {
                var process = new Process().executar(i);
                executorService.submit(process);
            }
        }

        System.out.println(Duration.ofMillis(System.currentTimeMillis() - timeStart).toSeconds() + " seconds");
    }
}
