package com.Extend;

 class reExtend {
      private int  temp[];
      private int foot;
	public  reExtend(int len) {//构造方法要和类名一致
		if(len>0){
			this.temp=new int [len];
		}else {
			this.temp=new int [1];//最小维持空间；
		}
	}
      public boolean add(int i) {
		if(this.foot<this.temp.length){
			this.temp[foot]=i;
			foot++;
			return true;
		}else {
			return false;//数组已满，添加错误；
		}
	}
      public int[] getArrary() {
		return this.temp;
	}

}
 class  ReverseARRAry extends reExtend{
	 public ReverseARRAry (int len) {
		super(len);
		} //调用父类构造方法
	 public int[] getArrary() {
		int t[]=new int[super.getArrary().length ];
		int count=t.length-1;
		for(int x=0;x<t.length;x++){
			t[count]=super.getArrary()[x];
			count--;
			
		}
		return t;
		
	}
 }
 class sortArrary extends reExtend{
	 public sortArrary (int len) {
		super(len);
	}
	 public int[] getArrary() {
		java.util.Arrays.sort(super.getArrary());//排序操作
		return super.getArrary();
	}
 }
