package com.patterns.concurrency.pau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TypeFast {
    
    private static final List<String> WORDS;
    private static final AtomicInteger SCORE = new AtomicInteger();
    private static final List<String> randomWords = new ArrayList<>();
    
    static {
        List<String> words = new ArrayList<>();
        words.add("CUNANAN");
        words.add("MACHETE");
        words.add("SUPERCALIFRAGILISTICEXPIALIDOCIOUS");
        words.add("NYARLATHOTEP");
        words.add("AZATHOTH");
        words.add("CTHULHU");
        words.add("BURUGUDUYSTUNSTUGUDUNSTUY");
        words.add("EGDARDO");
        words.add("PAULO");
        words.add("SLIPKNOT");
        words.add("ALKALINETRIO");
        words.add("COHEEDANDCAMBRIA");
        words.add("WALKWITHMEINHELL");
        words.add("BEATINGONDEATHSDOOR");
        words.add("RODSKYPATOTSKI");
        words.add("THESOUNDOFHERWINGS");
        words.add("CLOSINGTIME");
        words.add("ONEIROS");
        words.add("THELAUGHINGMAGICIAN");
        words.add("FRANKTHEPUNISHERCASTLE");
        WORDS = Collections.unmodifiableList(words);
    }

    public static void main(String[] args) {
        ExecutorService typeFastExecutor = Executors.newFixedThreadPool(2);
        try {
            typeFastExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    InputStreamReader isr = new InputStreamReader(System.in);
                    BufferedReader br = new BufferedReader(isr);
                    System.out.println("Input Now");
                    while(!Thread.interrupted()) {
                        try {
                            String input = br.readLine();
                            synchronized (randomWords) {
                                if(randomWords.contains(input)) {
                                    SCORE.incrementAndGet();
                                    randomWords.remove(input);
                                }
                            }
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        
                    }
                }
            });
            
            Future<?> typeFastFuture = typeFastExecutor.submit(new Runnable() {

                @Override
                public void run() {
                    try {
                        while(!Thread.interrupted()) {
                            synchronized (randomWords) {
                                String randomWord = getRandomWord();
                                System.out.println(randomWord);
                                randomWords.add(randomWord);
                            }
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException e) {
                        //ignore
                    }
                }
                
            });
            
            typeFastExecutor.shutdown();
            typeFastFuture.get(10, TimeUnit.SECONDS);
        } catch(Exception e) {
            System.out.println("Your score is " + SCORE);
            System.out.println("You suck");
        } finally {
            typeFastExecutor.shutdownNow();
        }
    }
        
    private static String getRandomWord() {
        int index = ThreadLocalRandom.current().nextInt(WORDS.size());
        return WORDS.get(index);
    }
}
