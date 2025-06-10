package com.intheeast.collections.queue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BoundedQueueExample {

	public static void launchTread(BlockingQueue<Integer> boundedQueue) throws InterruptedException {
		
		Runnable run = () -> {
			try {
				Thread.sleep(5000);
				boundedQueue.add(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			System.out.println("2nd Trenad exit");
		};
		
		// [main] Thread가 다음 Thread를 생성
		Thread thread = new Thread(run);		

		// the Java Virtual Machinecalls the run method of this thread.
		thread.start(); // [main] 넌블러킹
		
		// [main] Thread가 run 메서드의 실행이 완료될 때 까지 블러킹 됨
		// 왜? [main] Thread가 다음 Thread의 run 메서드를 호출했기 때문에...
//		thread.run(); // launchTread 메서드가 생성한 스레드가 정상 종료될 때까지
					  // main 스레드가 기다렸다[블로킹]가 리턴함
		System.out.println("launchTrenad method return");
	}
	
	// [main] Thread가 main 메서드를 실행시킴.
    public static void main(String[] args) {
        // 용량이 5인 유한 큐 생성
        BlockingQueue<Integer> boundedQueue = new ArrayBlockingQueue<>(5);
        // BlockingQueue : 엘리먼트를 검색할 때 큐가 비어 있지 않을 때까지 기다리는 
        //                 작업과 엘리먼트를 저장할때 큐에 공간이 생길 때까지 기다리는
        //                 작업을 추가로 지원하는 큐
                      
        try {
			LocalDate prvTime = LocalDate.now();
			// System이 booting한 이후 경과된 시간,
			// 1970년 1월 1일 자정부터 경과된 시간
        	
			launchTread(boundedQueue);
			
			long prvNano = System.nanoTime();
        	
			// Retrieves and removes the head of this queue, 
	        // waiting up to the specified wait time 
	        // if necessary for an element to become available.
	        // BlockingQueue.poll(long timeout, TimeUnit unit) throws InterruptedException	
			Integer element = boundedQueue.poll(10000, TimeUnit.MILLISECONDS); // 미리 세컨드라 3000은 3초임
			// 3초안에 관리할 엘리먼트가 있으면 그 엘리먼트를 리턴하고
			// 없으면 null 값 리턴
			// 근데 3초안에 무슨일이 생기면 예외를 알려줌(여기서는 Interrupted용어로 알리겠다!!)
		      	
			LocalDate afterTime = LocalDate.now();
        	long afterNono = System.nanoTime();
        	long elapsed = afterNono - prvNano;        	
        	long elapsedSeconds = elapsed / 1000000000L;        	
        	System.out.println("elapsedSeconds = " + elapsedSeconds);
        	
//        	Period period = Period.between(prvTime, afterTime);
        	
        	if(element == null) {
				System.out.println("element is null");
			} else {
				System.out.println("element = " + element);
			}
				
        } catch (InterruptedException e) {
			// lock...acquire...
			// 누군가 이미 lock을 하면 알려준다
			e.printStackTrace();
		}
         
        
        try {
            // 큐에 요소 추가
            for (int i = 1; i <= 5; i++) {
                boundedQueue.add(i);
                System.out.println("Added element: " + i);
            }

            // 큐가 가득 찼으므로 다음 추가 시도는 실패함
            boolean wasAdded = boundedQueue.offer(6);
            if (!wasAdded) {
                System.out.println("Failed to add element: 6 (Queue is full)");
            }

            // 큐에서 요소 제거
            while (!boundedQueue.isEmpty()) {
                int element = boundedQueue.poll();
                System.out.println("Removed element: " + element);
            }

        } catch (IllegalStateException e) {
            System.err.println("Error adding element to the queue: " + e.getMessage());
        }
    }
}