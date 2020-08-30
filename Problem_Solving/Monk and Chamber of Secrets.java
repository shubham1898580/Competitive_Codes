import java.util.*;

class TestClass {

       public static void main(String args[] ) throws Exception {
            Scanner sc = new Scanner(System.in);
               int n  = sc.nextInt();
               int x  = sc.nextInt();

         ArrayList<ArrayList<Integer>> power = new ArrayList<ArrayList<Integer>>();
         ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();

         for(int i =0;i<n;i++){
             ArrayList<Integer> ele = new ArrayList<Integer>();
             ele.add(sc.nextInt());
             ele.add(i);
             power.add(ele);
         }

        //  for(int i=0;i<n;i++){
        //      System.out.print(power.get(i).get(0));
        //       System.out.print(" "+power.get(i).get(1));
        //       System.out.println();
        //  }

        int ite = x;
        while(ite>0){
           ite--;
            //deque from power and enque in temp
         int size = Math.min(power.size(),x);
         int maxPowerIndex = -1;
         int maxPower = -1;
             while(size>0){
                 size--;
               temp.add(power.get(0));
               if(power.get(0).get(0)>maxPower){ maxPowerIndex = power.get(0).get(1);
                   maxPower = power.get(0).get(0);
               }
               power.remove(0);
             }
             
             System.out.print((maxPowerIndex + 1 )+" ");

             //enque back to power
             for(int j =0;j<temp.size();j++){
                 
                 if(temp.get(j).get(1) != maxPowerIndex){
                     
                     if(temp.get(j).get(0)>0){temp.get(j).set(0 ,temp.get(j).get(0) - 1) ;
                         
                     }
                      power.add(temp.get(j));
                     
                    
                 }
             }
             
             temp.clear();
             
        //      System.out.println(" After Iteration ");
             
        //   for(int i=0;i<power.size();i++){
        //      System.out.print(power.get(i).get(0));
        //       System.out.print(" "+power.get(i).get(1));
        //       System.out.println();
        //  }



        }
        
       

    }
}
