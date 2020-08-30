import java.util.*;

class TestClass {

       public static void main(String args[] ) throws Exception {
            Scanner sc = new Scanner(System.in);
               int s  = sc.nextInt();
               int e  = sc.nextInt();
            int n  = sc.nextInt();

               
               int mod  = 100000;
// <reach , steps>
         ArrayList<ArrayList<Integer>> queue = new ArrayList<ArrayList<Integer>>();
         ArrayList<Integer> visited = new ArrayList<Integer>();
         ArrayList<Integer> ele = new ArrayList<Integer>();
         for(int i =0;i<n;i++){
           
             ele.add(sc.nextInt());
            
         }
          ArrayList<Integer> ele1 = new ArrayList<Integer>();
               ele1.add(s);
               ele1.add(0);
             queue.add(ele1);
             
             int steps = -1;
             boolean rr = true;
        while(queue.size()!=0 && rr){
            
            int var = queue.get(0).get(0);
            int c_step = queue.get(0).get(1);
              
            for(int j = 0;j<n;j++){
                int reach = (var*ele.get(j)) % mod;
             //   System.out.println("reach : "+ reach);
                
                if(reach == e){
                   steps = (c_step + 1);
                   rr = false;
                    break;
                }else{
                    
                    if(visited.contains(reach) == false){
                        
                     ArrayList<Integer> ele2 = new ArrayList<Integer>();
                      ele2.add(reach);
                      ele2.add(c_step + 1);
                     queue.add(ele2);
                     visited.add(reach);
                    //  System.out.println("ele added : "+ reach+" steps : "+(c_step +  1));
                    }
                    
                }
                
            }
            
             queue.remove(0);
            
        }
        
        System.out.println(steps);

    }
}
