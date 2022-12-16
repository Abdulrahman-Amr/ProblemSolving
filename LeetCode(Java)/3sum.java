class Pair
{
    int index;
    int value;
    public Pair(int i, int v)
    {
        index=i;
        value=v;
    }
}
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> loi=new ArrayList<>();
         if (nums == null || nums.length < 3) {
            return loi;
        }

       
        Set<List<Integer>> set = new HashSet<>();
         Map<Integer,Pair> map = new HashMap<>();
         
          for(int i=0;i<nums.length;i++)
          {
            
              if(map.get(nums[i])==null)
              {
                  Pair p=new Pair(i,1);

                     map.put(nums[i], p);
              }
              else
              {
                  int n=map.get(nums[i]).value+1;
                Pair p=new Pair(i,n);
                 map.put(nums[i], p);
              }
          }
             for(int i=0;i<nums.length;i++)
             {
                for(int j=i+1;j<nums.length;j++)
                {
                    int num = 0 - (nums[i]+nums[j]);
                 
                        if(map.get(num)!=null  && map.get(num).index >j )
                        {
                            
                            List<Integer> arr=new ArrayList<>();
                            arr.add(nums[i]);
                            arr.add(nums[j]);
                            arr.add(num);
                            List<Integer> xx = arr.stream().sorted().collect(Collectors.toList());
                             set.add(xx);
                    }
                }
            }
        loi.addAll(set);
         return loi;
    }
}