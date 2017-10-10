package com.cnmaia.csv.parsing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

@SpringBootApplication
public class Parse implements CommandLineRunner {

    public static final String FILE_PATH = "Fielding.csv";

    @Autowired
    private FieldingRepository fieldingRepository;

    public static void main(String[] args) {
        SpringApplication.run(Parse.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        long executionStart = System.nanoTime();
        System.out.println("Started");
        ExecutorService executor = Executors.newFixedThreadPool(4);

        try (Stream<String> line = Files.lines(Paths.get(FILE_PATH))) {

            // parse
            line.map(l -> {
                String[] lineSplit = l.split(",", -1); // This -1 is to not ignore null values

                return buildFielding(lineSplit);
            })
                    .map(fielding -> CompletableFuture.runAsync(() -> fieldingRepository.save(fielding), executor))
                    .forEach(CompletableFuture::join);
        }

        long duration = (System.nanoTime() - executionStart) / 1000000;

        System.out.println("Process time: " + duration);

        executor.shutdown();
    }

    private Fielding buildFielding(String[] lineSplit) {
        Fielding fielding = new Fielding();

        fielding.setPlayerId(lineSplit[0]);
        fielding.setYear(lineSplit[1]);
        fielding.setStint(lineSplit[2]);
        fielding.setTeam(lineSplit[3]);
        fielding.setLeague(lineSplit[4]);
        fielding.setPosition(lineSplit[5]);
        fielding.setGames(lineSplit[6]);
        fielding.setGamesStarted(lineSplit[7]);
        fielding.setInnOuts(lineSplit[8]);
        fielding.setPutOuts(lineSplit[9]);
        fielding.setAssists(lineSplit[10]);
        fielding.setErrors(lineSplit[11]);
        fielding.setDoublePlays(lineSplit[12]);
        fielding.setPassedBalls(lineSplit[13]);
        fielding.setWildPitches(lineSplit[14]);
        fielding.setOpponentStolenBases(lineSplit[15]);
        fielding.setOpponentCaughtStealing(lineSplit[16]);
        fielding.setZoneRating(lineSplit[17]);

        return fielding;
    }
}
