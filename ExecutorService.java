import java.util.*;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
class UsingExecutorService implements Runnable 
{  
  
     public void run() 
    {  
       System.out.println(Thread.currentThread().getName()+" (Start) ");
       for(int i=1;i<=10;i++)
       {
           System.out.println(i);
       }
       System.out.println(Thread.currentThread().getName() +" (End) ");  
    }  
    
}  

public class Main 
{  
     public static void main(String[] args) 
    {  
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
        for(int i=0;i<10;i++)
        {
            Runnable r = new UsingExecutorService();  
            executor.execute(r);//calling execute method of ExecutorService  
        }
            executor.shutdown();  
        
        while (!executor.isTerminated()) {   }  
  
        System.out.println("Finished all threads");  
    }  
 }  
 
 /*
 Behaviour of ExecutorService
 
 We are creating a fixed-size thread pool of 5 UsingExecutorService threads. 
 Then we are submitting 10 jobs to this pool, since the pool size is 5, 
 it will start working on 5 jobs and other jobs will be in wait state, 
 as soon as one of the job is finished, 
 another job from the wait queue will be picked up by UsingExecutorService and get’s executed.
 
 */


********************  OR ***************************

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
class UsingExecutorService implements Runnable 
{  
  
     public void run() 
    {  
       System.out.println(Thread.currentThread().getName()+" (Start) ");
       for(int i=1;i<=10;i++)
       {
           System.out.println(i);
       }
       System.out.println(Thread.currentThread().getName() +" (End) ");  
    }  
    
}  

public class Main 
{  
     public static void main(String[] args) 
    {  
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
       
            Runnable r = new UsingExecutorService();  
            executor.execute(r);//calling execute method of ExecutorService  
            executor.shutdown();  
        
        while (!executor.isTerminated()) {   }  
  
        System.out.println("Finished all threads");  
    }  
 }  
 
