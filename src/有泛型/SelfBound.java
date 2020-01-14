package ÓÐ·ºÐÍ;

public interface SelfBound<T extends SelfBound<T>>{
	void set(T args);
}
 
class DD implements SelfBound<DD>{

	
	

	@Override
	public void set(DD args) {
		// TODO Auto-generated method stub
		
	}

}


interface Self<T>{
	
	public void set(T args);
}

class D implements Self<Aniaml>{

	
		

		
		public void set(Cat args) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void set(Aniaml args) {
			// TODO Auto-generated method stub
			
		}

	}