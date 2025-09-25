package br.com.ss;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecucaoVirtualThreads {

    public static void main(String[] args) {
        long timeStart= System.currentTimeMillis();

        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 0; i < 100000; i++) {
                var process = new Process().executar(i);
                executorService.submit(process);
            }
        }

        System.out.println(Duration.ofMillis(System.currentTimeMillis() - timeStart ).toSeconds() + " seconds");
    }
}
