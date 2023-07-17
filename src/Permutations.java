public class Permutations{
	
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }


    private void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums){
        //Eğer uzunluklar aynı olursa permütasyon
        if(tempList.size() == nums.length){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for(int number : nums){
            //Eğer seçtiğimiz sayıyıs bir daha seçersek atlıyoruz
            if(tempList.contains(number))
            continue;

            //Yeni sayıyı ekliyoruz
            tempList.add(number);

            //Geri dönme işlemi yapıp diğer sayıları deniyoruz
            backtrack(resultList, tempList ,nums);

            //Eklediğimiz sayıyı kaldırıyoruz
            tempList.remove(tempList.size() - 1);
        }
    }
}
