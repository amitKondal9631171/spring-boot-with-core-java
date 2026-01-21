package com.learning.controller;


import com.learning.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class ACNBController {

    private StudentService studentService;

    @GetMapping("/testMultiThread")
    public void processACNBRequest() throws InterruptedException, ExecutionException {
        Map<String, List<String>> information = new HashMap<>(2);
        List<String> tradeList = List.of("Trade Agreement 1", "Trade Agreement 2", "Trade Agreement 3", "Trade Agreement 4", "Trade Agreement 5",
                "Trade Agreement 6", "Trade Agreement 7", "Trade Agreement 8", "Trade Agreement 9", "Trade Agreement 10");
        List<String> othersList = List.of("Security Agreement 1", "Fiscal Agreement 2", "MO907 Agreement 3", "FRS Agreement 4", "FRS Agreement 5",
                "Security Agreement 6", "Fiscal Agreement 7", "MO907 Agreement 8", "FRS Agreement 9", "FRS Agreement 10");

        information.put("Trade", tradeList);
        information.put("Others", othersList);

        information.entrySet().parallelStream().filter(value -> value.getKey().equals(""));

        List<List<String>> responseList = new ArrayList<>();


       System.out.println("Start");
           information.entrySet().parallelStream().map(value -> {

                if (value.getKey().equals("Trade")) {

                    responseList.add(studentService.processTreadAndFinanceProducts(value.getValue()));

                } else {

                    responseList.add(studentService.processOtherProducts(value.getValue()));

                }
                return responseList;
            }).collect(Collectors.toList());



    /*   ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<List<String>> tradeFinanceRunnable = () -> studentService.processTreadAndFinanceProducts(tradeList);
        Callable<List<String>> othersRunnable = () -> studentService.processOtherProducts(othersList);
        Future<List<String>> listFuture1 = executor.submit(tradeFinanceRunnable);
        Future<List<String>> listFuture2 = executor.submit(othersRunnable);
        executor.shutdown();

        List<String> finalList = new ArrayList<>();
        finalList.addAll(listFuture2.get());
        finalList.addAll(listFuture1.get());
*/

        System.out.println("Done: ");

    }

    @Async("balanceExecutor")
    private void testSynchro(Map<String, List<String>> information) {

        information.entrySet().parallelStream().forEach(value -> {
            if (value.getKey().equals("Trade")) {

                studentService.processTreadAndFinanceProducts(value.getValue());

            } else {

                studentService.processOtherProducts(value.getValue());

            }
        });


    }

    @GetMapping("/testing-gatling")
    public String testingGatling(){
        System.out.println(Thread.currentThread().getName() + " received the request...........");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " returned the response...........");
        return "Amit kondal";
    }


}
