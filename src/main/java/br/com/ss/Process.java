package br.com.ss;

import java.time.Duration;

public class Process {

    public Runnable executar(int processoId) {
        return () -> {
            System.out.println(Thread.currentThread() + " executing process: " + processoId);

            try {
                Thread.sleep(Duration.ofSeconds(1));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread() + " finish process: " + processoId);
        };
    }
}
