public static void main(String[] args){
	int[] array = {1,3,2};
	List<Integer> list = array.stream().collect(toList());
}
