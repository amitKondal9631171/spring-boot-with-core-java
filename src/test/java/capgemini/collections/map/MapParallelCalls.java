package capgemini.collections.map;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class MapParallelCalls {

    static String currentDateTime;

    private static List<String> operationOne(List<String> input) throws InterruptedException {
        input.forEach(value -> {
                    currentDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                    System.out.println(Thread.currentThread() + " Operation one executed on: " + currentDateTime);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
        );
        return input;
    }

    private static List<String> operationSecond(List<String> input) throws InterruptedException {
        input.forEach(value -> {
                    currentDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                    System.out.println(Thread.currentThread() + " Operation Sec executed on: " + currentDateTime);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
        );
        return input;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Map<String, List<String>> information = new HashMap<>(2);
        List<String> tradeList = List.of("Trade Agreement 1", "Trade Agreement 2", "Trade Agreement 3", "Trade Agreement 4", "Trade Agreement 5",
                "Trade Agreement 6", "Trade Agreement 7", "Trade Agreement 8", "Trade Agreement 9", "Trade Agreement 10");
        List<String> othersList = List.of("Security Agreement 1", "Fiscal Agreement 2", "MO907 Agreement 3", "FRS Agreement 4", "FRS Agreement 5",
                "Security Agreement 6", "Fiscal Agreement 7", "MO907 Agreement 8", "FRS Agreement 9", "FRS Agreement 10");
        information.put("Trade", tradeList);
        information.put("Others", othersList);
        //information.put("Others1", othersList);
        information.put("Others2", othersList);
        information.put("Others3", othersList);
        information.put("Others4", othersList);
         /*information.put("Others5", othersList);
        information.put("Others6", othersList);
        information.put("Others7", othersList);
        information.put("Others8", othersList);
        information.put("Others9", othersList);
        information.put("Others90", othersList);*/

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<List<String>> tradeFinanceRunnable = () -> operationOne(tradeList);
        Callable<List<String>> othersRunnable = () -> operationSecond(othersList);

       /* information.entrySet().parallelStream().forEach(number ->
                {
                    if (number.getKey().equals("Trade")) {
                        try {
                            operationOne(tradeList);
                        } catch (InterruptedException exception) {
                            exception.printStackTrace();
                        }
                    } else {
                        try {
                            operationSecond(othersList);
                        } catch (InterruptedException exception) {
                            exception.printStackTrace();
                        }
                    }
                }
        );*/
        Future<List<String>> listFuture1 = executor.submit(tradeFinanceRunnable);
        Future<List<String>> listFuture2 = executor.submit(othersRunnable);
        executor.shutdown();

        System.out.println("Done 2 !" + listFuture2.get().get(0));
        System.out.println("Done 1 !" + listFuture1.get().get(0));
        //System.out.println("Trade response list :" + tradeResponse.size());
        //System.out.println("Other response list :" + otherResponse.size());

        /*
        executor.submit(othersRunnable);
        List<String> operationResults = new ArrayList<>();
          information.entrySet().parallelStream().forEach(entry -> {
            LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(2));
             if(entry.getKey().equals("Trade")){
                 try {
                     System.out.println("\t"+Thread.currentThread());
                     operationOne(entry.getValue())  ;
                 } catch (InterruptedException exception) {
                     exception.printStackTrace();
                 }
             }else {
                 try {
                     operationSecond(entry.getValue())  ;
                 } catch (InterruptedException exception) {
                     exception.printStackTrace();
                 }
             }

        });*/


    }
}
