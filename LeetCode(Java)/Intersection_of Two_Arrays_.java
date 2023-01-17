class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map = new HashMap<>();
        Map<Integer,Integer>map2 = new HashMap<>();
        List<Integer>list = new ArrayList<>();

        for(int i=0;i<nums1.length;i++)
        {
            if(map.get(nums1[i])==null)
            {
                map.put(nums1[i],1);
            }
            else{
                map.put(nums1[i],map.get(nums1[i])+1);
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(map.get(nums2[i])!=null )
            {
                if(map.get(nums2[i])>0 )
                {
                    list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
                }
            }
        }

        int arr[]=new int[list.size()];
        Iterator<Integer> it=list.iterator();
        int i=0;
        while(it.hasNext())
        {
        
           arr[i] = it.next();
            i++;
        }
        return arr;
    }
}